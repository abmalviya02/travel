package com.hadoop.programes.WordCount;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;

import com.sun.jersey.core.impl.provider.entity.XMLJAXBElementProvider.Text;

public class WC_runner {
public static void main(String args[]) throws IOException{
	JobConf conf = new JobConf(WC_runner.class);
	conf.setJobName("WordCount");
	conf.setOutputKeyClass(Text.class);
	conf.setOutputValueClass(IntWritable.class);
	conf.setMapperClass(WC_mapper.class);
	conf.setCombinerClass(WC_reducer.class);
	conf.setInputFormat(TextInputFormat.class);
	conf.setOutputFormat(TextOutputFormat.class);
	FileInputFormat.setInputPaths(conf,new Path(args[0]));
	FileOutputFormat.setOutputPath(conf, new Path(args[1]));
	JobClient.runJob(conf);
}
}
