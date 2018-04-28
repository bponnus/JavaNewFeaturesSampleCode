package com.test.java8;

import java.util.ArrayList;

@FunctionalInterface
interface FunClass {
	
	public void show();
	//public void show1();
	default void show1() {
		System.out.println("Show 1 ...");
		int i = 10;
		i += i;
		System.out.println(i);
	}
}
public class FunctionInterfaceClass implements FunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionInterfaceClass f = new FunctionInterfaceClass();
		f.show();
		f.show1();
		
	}
	public void show()
	{
		System.out.println("Calling show method");
	}
	public void show1()
	{
		show1();
		System.out.println("Calling show1 method");
	}
}
