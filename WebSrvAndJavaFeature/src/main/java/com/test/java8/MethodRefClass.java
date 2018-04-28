package com.test.java8;

import java.util.Arrays;
import java.util.List;

interface Method1
{
	public void show1();
}


public class MethodRefClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,2,3);
		l.forEach(MethodRefClass::show);
		//l.forEach(MethodRedSubClass::subMethod());
	}

	public static void show(Integer i)
	{
		System.out.println("Calling show method" + i);
		i++;
	}
}
