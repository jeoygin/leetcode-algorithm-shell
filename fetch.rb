#!/usr/bin/env ruby

require 'net/https'
require 'uri'
require 'nokogiri'
require 'reverse_markdown'
require 'fileutils'
require 'optparse'
require 'yaml'

options = {}

optparser = OptionParser.new do |opts|
  opts.on('-l', '--list', 'fetch problem list') do |value|
    options[:list] = true
  end

  opts.on('-p', '--problem', 'fetch problems') do |value|
    options[:problems] = true
  end
end

begin
  optparser.parse!
  if options[:list].nil? and options[:problems].nil?
    puts "Missing option: list, problems"
    puts optparser
    exit
  end
rescue OptionParser::InvalidOption, OptionParser::MissingArgument
  puts $!.to_s
  puts optparser
  exit
end

if __FILE__ == $0
  if options[:list]
    uri = URI.parse('https://leetcode.com/problemset/algorithms/')
    http = Net::HTTP.new(uri.host, uri.port)
    http.use_ssl = true if uri.scheme == "https"
    http.verify_mode = OpenSSL::SSL::VERIFY_NONE
  
    puts "Fetching problem list..."
  
    problemList = Array.new
    
    http.start {
      http.request_get(uri.path, {'User-Agent' => 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.93 Safari/537.36'}) {|res|
        puts "Saving page to problems.html..."
        File.open('problems.html', 'w') do |file|
          file.puts res.body
        end
        
        page = Nokogiri::HTML(res.body)
        table = page.css('table#problemList')[0]
        table.css('tbody')[0].css('tr').each{|row|
          cells = row.css('td')
          problem = Hash.new
          problem['Id'] = cells[1].text
          problem['Book'] = 'Y' if cells[2].css('i').length > 0
          problem['Title'] = cells[2].css('a')[0].text
          problem['Link'] = cells[2].css('a')[0]['href']
          problem['Acceptance'] = cells[3].text
          problem['Difficulty'] = cells[4].text
          if problem['Book'] == 'Y'
            problem['Done'] = 'N'
          else
            problem['Done'] = ' '
          end 
          problemList.push(problem)
          dir = "." + problem['Link']
          FileUtils::mkdir_p dir
#          File.delete dir + '.updated' if File.exists? dir + '.updated'
        }
      }
    }
    
    puts "Fetched " + problemList.length.to_s + " problems"
  
    problemList = problemList.sort{|a, b| b['Acceptance'].to_f <=> a['Acceptance'].to_f}
  
    puts "Saving list to problems.yml..."
    yml = problemList.to_yaml
    File.open('problems.yml', 'w') { |file| file.puts yml}
  
    puts "Saving list to problems.md..."
    File.open('problems.md', 'w') do |file|
      file.puts "| Done | Id | Title | Acceptance | Difficulty |"
      file.puts "|:----:|:-:| ----- |:---:|:---:|"
      problemList.each {|problem|
        puts "\tWriting " + problem['Title']
        file.puts "| " + problem['Done']  + " | " + problem['Id'] + " | [" + problem['Title'] + "](." + problem['Link'] + "content.md) | " + problem['Acceptance'] + " | " + problem['Difficulty'] + " |"
      }
    end
  end

  if options[:problems]
    puts "Fetching problems..."
    problemList = YAML::load(File.open('problems.yml').readlines.join)
    problemList.each {|problem|
      link = problem['Link']
      dir = "." + link

      if not File.exists? dir + '.updated'
        puts "\tWriting '" + problem['Title'] + "' to " + dir
      
        uri = URI.parse('https://leetcode.com/' + link)
        http = Net::HTTP.new(uri.host, uri.port)
        http.use_ssl = true if uri.scheme == "https"
        http.verify_mode = OpenSSL::SSL::VERIFY_NONE
        http.start {
          http.request_get(uri.path, {'User-Agent' => 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.93 Safari/537.36'}) { |res|
            File.open(dir + "index.html", 'w') do |file|
              file.puts res.body
            end

            page = Nokogiri::HTML(res.body)
            content = page.css('div.question-content')[0]
            unless content.nil?
              md = ReverseMarkdown.convert content.to_html
              File.open(dir + "content.md", 'w') do |file|
                file.puts md
              end
            end
          }
        }
        File.open(dir + '.updated', 'w') do |file|
          file.puts Time.now
        end

        sleep 0.1
      end
    }
  
    puts "Done!"
  end

end
