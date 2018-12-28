package com.java.streamconcept;

import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class StreamCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> ar = new ArrayList();
	      ar.add(2);ar.add(4);ar.add(2);ar.add(7);ar.add(9);ar.add(10);
	      LocalTime t1 = LocalTime.now();
        for(long i=0;i<100000000;i++) {
        	ar.stream().sorted();
        	ar.stream().sorted();
        	ar.stream().sorted();
        	ar.stream().sorted();
        	ar.stream().sorted();
        }
        LocalTime t2 = LocalTime.now();
        System.out.println("First Total Time :" +String.valueOf(t2.getSecond()*1000-t1.getSecond()*1000));
        List<Integer> ar1 = new ArrayList();
	      ar1.add(2);ar1.add(4);ar1.add(2);ar1.add(7);ar1.add(9);ar1.add(10);
	      LocalTime t3 = LocalTime.now();
      for(long i=0;i<100000000;i++) {
    	  ar1.parallelStream().sorted();
    	  ar1.parallelStream().sorted();
    	  ar1.parallelStream().sorted();
    	  ar1.parallelStream().sorted();
    	  ar1.parallelStream().sorted();
      }
      LocalTime t4 = LocalTime.now();
      
      System.out.println("Second Total Time:" +String.valueOf(t4.getSecond()*1000-t3.getSecond()*1000));
	}

}
