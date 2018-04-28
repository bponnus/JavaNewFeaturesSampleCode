package com.test.java8;

interface MylamdaExp {
	public String sayHello();

}

interface ParamEx {
	private void addValue1(int i, int j) {
		System.out.println("Default method value is " + (i + j));
	}

	default void addValue(int i) {
		addValue1(i, 500);
	}

	public int addInt(int i);

	public static void exStaticMethod() {
		System.out.println("Calling static method");
	}
}

class callInter implements ParamEx {
	public void callInterMethod() {
		addValue(10);
	}

	public int addInt(int i) {
		return 100;
	}
}

public class InterfaceLamdaExp implements ParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Without parameter
		MylamdaExp mytest1 = () -> {
			return "Test";
		};
		System.out.println("Calling ...." + mytest1.sayHello());

		// With parameter
		ParamEx mytest2 = (x) -> {
			return 5 + x;
		};
		System.out.println(mytest2.addInt(10));

		// Calling Private & Default methods from lamda interface
		mytest2.addValue(100);

		// Calling methods from interface implemented class
		callInter mytest3 = new callInter();
		mytest3.callInterMethod();

		// Calling Private & Default methods interface methods
		mytest3.addValue(100);

		// Calling static methods of interface class
		ParamEx.exStaticMethod();

		// Creating object for main class and calling implements methods
		InterfaceLamdaExp ex = new InterfaceLamdaExp();
		System.out.println(ex.addInt(1000));

	}

	public int addInt(int i) {
		return (200 + i);
	}

}
