package com.test.java9;

import java.util.List;
import java.util.Map;

public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l = List.of("1","2","3");
		l.forEach(i -> System.out.println(i));
		System.out.println("Immutable.....1");
		//l.add("4");
		//System.out.println("Immutable.....2");
		//l.forEach(i -> System.out.println(i));
		Map m = Map.of(1,"a",2,"b");
		System.out.println(m.get(1));
		m.forEach((j,k) -> System.out.println(k));
	}

}
