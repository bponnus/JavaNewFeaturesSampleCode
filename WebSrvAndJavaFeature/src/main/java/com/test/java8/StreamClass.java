package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stream<String> streamStr = Stream.empty();
		List<String> intList = new ArrayList<String>();
		intList.add("A");
		intList.add("B");
		intList.add("C");
		String a[] = new String[] {"a","b","c"};
		Stream<String> e1 = Arrays.stream(a);
		//Stream<String> e2 = Arrays.stream(a);
		//e2.forEach(System.out::println);
		e1.forEach(s -> {
			if (s.equals("a")) {
				System.out.println("Test");
			}
			}
		);
		
		Stream.iterate(40, n -> n + 2).limit(20).forEach(System.out::println);
		//streamIterated.forEach(System.out::println);
			
	}

}
