#!/usr/bin/env ruby

require 'fileutils'
require 'optparse'

options = {}

optparser = OptionParser.new do |opts|
  opts.on('-f', '--force', 'force write') do |value|
    options[:force] = true
  end

  opts.on('-l', '--language LANGUAGE', 'set language') do |value|
    options[:language] = value
  end
end

begin
  optparser.parse!
  if options[:language].nil?
    puts "Missing option: language"
    puts optparser
    exit
  end
rescue OptionParser::InvalidOption, OptionParser::MissingArgument
  puts $!.to_s
  puts optparser
  exit
end

if ARGV.length == 0
  puts "Usage: code problem"
  exit
end

language = options[:language]
problem = ARGV[0]
patterns = {'java' => /\{'value': 'java', 'text': 'Java', 'defaultCode': '[^']+' \}/,
            'python' => /\{'value': 'python', 'text': 'Python', 'defaultCode': '[^']+' \}/}
block = patterns[language].match(File.open(problem+'/index.html').readlines.join).to_s
code = /'defaultCode': '(.*)'/.match(block)
formattedCode = eval "\"#{code[1]}\""

puts formattedCode

solutionFiles = {'java' => 'Solution.java',
                 'python' => 'Solution.py'}
testFiles = {'java' => 'Test.java',
             'python' => 'Test.py'}

solution = File.join(problem, language, solutionFiles[language])
test = File.join(problem, language, testFiles[language])
FileUtils::mkdir_p File.join(problem, language)

if not File.exists? solution or options[:force]
  puts "Writing to #{solution}"
  File.open(solution, 'w') { |file| file.puts formattedCode }
end

puts "---------------------------------------------------------------------------"

testCode = ''

case language
  when 'java'
    testCode = File.open('templates/Test.java').readlines.join.sub('<function>', /public [^ ]+ (\w+)\(/.match(code[0])[1]).sub('<source>', formattedCode.gsub(/^/, '// '))
end
puts testCode

if not File.exists? test or options[:force]
  puts "Writing to #{test}"
  File.open(test, 'w') { |file| file.puts testCode}
end
