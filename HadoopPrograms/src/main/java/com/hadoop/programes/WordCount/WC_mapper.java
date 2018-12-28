package com.hadoop.programes.WordCount;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class WC_mapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>{
	private Text word = new Text(); 
	public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		// TODO Auto-generated method stub
		String line =value.toString();
		System.out.println("HADOOP LOG - Each Line :"+line);
		StringTokenizer tokenizer = new StringTokenizer(line);
		while(tokenizer.hasMoreTokens()) {
			word.set(tokenizer.nextToken());
			output.collect(word, new IntWritable(1));
		}
	}

}
