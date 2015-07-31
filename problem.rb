#!/usr/bin/env ruby

require 'nokogiri'
require 'optparse'
require 'yaml'
require 'redcarpet'

options = {}

optparser = OptionParser.new do |opts|
  opts.on('-l', '--list LANGUAGE', 'output problem list') do |value|
    options[:list] = value
  end

  opts.on('-p', '--problem PROBLEM', 'output problem') do |value|
    options[:problem] = value
  end
end

begin
  optparser.parse!
  if options[:list].nil? and options[:problem].nil?
    puts "Missing option: list, problem"
    puts optparser
    exit
  end
rescue OptionParser::InvalidOption, OptionParser::MissingArgument
  puts $!.to_s
  puts optparser
  exit
end

if options[:list]
  problemList = YAML::load(File.open('problems.yml').readlines.join)
  language = options[:list]
  puts "\033[31m" + "Done".ljust(6, " ") + "Id".ljust(6, " ") + "Title".ljust(64, " ") + "Acceptance".ljust(12, " ") + "Difficulty".ljust(12, " ") + "\033[0m"
  difficultyColor = {'Easy' => "\033[32m", 'Medium' => "\033[33m", 'Hard' => "\033[31m"}
  doneColor = {'Y' => "\033[32m", 'N' => "\033[31m", ' ' => "\033[36m"}
  problemList.each do |problem|
    problem['Done'] = 'Y' if File.exists? "." + problem['Link'] + language + "/.done"
    puts doneColor[problem["Done"]] + problem["Done"].ljust(6, " ") + "\033[36m" + problem["Id"].ljust(6, " ") + problem["Title"].ljust(64, " ") + problem["Acceptance"].ljust(12, " ") + difficultyColor[problem["Difficulty"]] + problem["Difficulty"].ljust(12, " ") + "\033[0m"
  end
end

if options[:problem]
  markdown = File.open(options[:problem] + '/content.md').readlines.join
  html = Redcarpet::Markdown.new(Redcarpet::Render::HTML, autolink: true, tables: true).render(markdown)
  content = Nokogiri::HTML(html)
  puts content.text unless content.nil?
end
