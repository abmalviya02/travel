package com.java.streamconcept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class parallelStreamMethods {
  public static void main(String args[]) {
	  List<Integer> ar = new ArrayList();
      ar.add(2);ar.add(4);ar.add(2);ar.add(7);ar.add(9);ar.add(10);
      
      List<Integer> flst = ar.parallelStream().filter(i->i>2).collect(Collectors.toList());
      System.out.println("List > 2 : "+flst);
      
      List<Integer> inlst = ar.parallelStream().map(i->i+1).collect(Collectors.toList());
      System.out.println("Incremental List : "+inlst);
      
      long totalElement = ar.parallelStream().count();
      System.out.println("Incremental List : "+totalElement);
      long totalEven = ar.parallelStream().filter(i->i%2==0).count();
      System.out.println("total Even Element: "+totalEven);
      
      List<Integer> sortedList = ar.parallelStream().sorted().collect(Collectors.toList());
      System.out.println("Natural sorted List:"+sortedList);
      Comparator<Integer> c = (n1,n2) -> n2-n1;
      
      List<Integer> dSortedList = ar.parallelStream().sorted((n1,n2) -> n2-n1).collect(Collectors.toList());
      System.out.println("Decending sorted List:"+dSortedList);
      
      Integer minElement = ar.parallelStream().min((n1,n2) -> n2-n1).get();
      System.out.println("min elemnt:"+minElement);
      
      Integer maxElement = ar.parallelStream().max((n1,n2) -> n2-n1).get();
      System.out.println("Max Elemnt:"+maxElement);
      
      ar.parallelStream().forEach(n -> System.out.print(" "+n));
      
      Stream<Integer> s = Stream.of(3,4,7,8);
      s.parallel().forEach(k -> System.out.print("\n "+k));
      
      
	}

}
