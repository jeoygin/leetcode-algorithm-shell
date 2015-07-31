#!/usr/bin/env ruby

require 'optparse'
require 'fileutils'

def compile(problem, language)
  case language
    when 'java'
      FileUtils.remove_dir 'build/classes' if File.exists? 'build/classes'
      FileUtils.mkdir_p 'build/classes'
      system "javac -sourcepath common/java:#{problem}/java -d build/classes #{problem}/java/Test.java" 
    else
      puts 'Not supported language: ' + language
  end
end

def test(problem, language)
  case language
    when 'java'
      system "java -cp build/classes Test"
    else
      puts 'Not supported language: ' + language
  end
end

def run(options)
  if options[:test] != nil
    compile(options[:test], options[:language])
    test(options[:test], options[:language])
  elsif options[:compile] != nil
    compile(options[:compile], options[:language])
  else
    puts "Run 'runner -h' for help"
  end
end

options = {}

optparser = OptionParser.new do |opts|
  opts.on('-c', '--compile PROBLEM', 'compile problem') do |value|
    options[:compile] = value
  end

  opts.on('-t', '--test PROBLEM', 'test problem') do |value|
    options[:test] = value
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
  elsif options[:compile].nil? and options[:test].nil?
    puts "Missing option: compile or test"
    puts optparser
    exit
  end
rescue OptionParser::InvalidOption, OptionParser::MissingArgument
  puts $!.to_s
  puts optparser
  exit
end

run(options)
