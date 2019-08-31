package com.in;

import java.util.*;

public class TestHello {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("amit");
		l.add("sumit");
		l.add("vineet");
		l.forEach(x -> System.out.println(x));
	}

}
