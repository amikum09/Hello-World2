package com.in;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHello {

	public static void main(String[] args) {
		//forEach example
		
		List<String> l=new ArrayList<String>();
		l.add("amit");
		l.add("sumit");
		l.add("vineet");
		l.forEach(x -> System.out.println(x));
		
		//stream example
		
		int i=(int) l.stream()
		.filter(y -> y.equalsIgnoreCase("sumit"))
		.count();
		System.out.println(i); 
		
		//String operation
		System.out.println(l);
		System.out.println(l.stream().map(String::toUpperCase).collect(toList()));
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list=list.stream()
		.map(j -> j*j)
		.collect(toList());
		System.out.println(list);
		
		//Even/Odd numbers
		List<Integer> lists=Arrays.asList(1,2,3,4,5,6,7,8);
		lists.stream()
		.filter(n -> n%2==0)
		.forEach(x1 -> System.out.println(x1));
	}

}
