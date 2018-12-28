package com.java.streamconcept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> ar = new ArrayList();
       ar.add(2);ar.add(4);ar.add(2);ar.add(7);ar.add(9);ar.add(10);
       
       List<Integer> flst = ar.stream().filter(i->i>2).collect(Collectors.toList());
       System.out.println("List > 2 : "+flst);
       
       List<Integer> inlst = ar.stream().map(i->i+1).collect(Collectors.toList());
       System.out.println("Incremental List : "+inlst);
       
       long totalElement = ar.stream().count();
       System.out.println("Incremental List : "+totalElement);
       long totalEven = ar.stream().filter(i->i%2==0).count();
       System.out.println("total Even Element: "+totalEven);
       
       List<Integer> sortedList = ar.stream().sorted().collect(Collectors.toList());
       System.out.println("Natural sorted List:"+sortedList);
       Comparator<Integer> c = (n1,n2) -> n2-n1;
       
       List<Integer> dSortedList = ar.stream().sorted((n1,n2) -> n2-n1).collect(Collectors.toList());
       System.out.println("Decending sorted List:"+dSortedList);
       
       Integer minElement = ar.stream().min((n1,n2) -> n2-n1).get();
       System.out.println("min elemnt:"+minElement);
       
       Integer maxElement = ar.stream().max((n1,n2) -> n2-n1).get();
       System.out.println("Max Elemnt:"+maxElement);
       
       ar.stream().forEach(n -> System.out.print(" "+n));
       
       Stream<Integer> s = Stream.of(3,4,7,8);
       s.forEach(k -> System.out.print("\n "+k));
       
       
	}

}
