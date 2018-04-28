package com.test.java8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface MyString {
	public String callStringFunction(String str);
}

public class LamdaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyString callStr = (str) -> "Hi " + str;

		System.out.println("Lamda Calling - > " + subFunction(callStr, "Bala"));
		List<Integer> listValue = new ArrayList();
		listValue.add(3);
		listValue.add(10);
		listValue.add(5);
		listValue.add(8);
		listValue.add(4);
		listValue.add(1);
		listValue.add(2);
		listValue.add(6);

		callList(listValue);

	}

	public static String subFunction(MyString fun, String str) {
		return fun.callStringFunction(str);
	}

	public static void callList(List<Integer> intList) {
		System.out.println("Stream Example");
		System.out.println("Stream Count-----" + intList.stream().count());
		// Map - Integer to int, or change the original value to something else
		// Limit - Fix the stream size
		// forEach - looping element from list
		// filter - filter the value from stream
		intList.stream().filter(list1 -> list1 < 10).limit(8).map(list1 -> list1 * 2).sorted()
				.forEach(list1 -> System.out.println(list1));
		// intList.parallelStream().filter(list1 -> list1 < 10).limit(8).map(list1 ->
		// list1 * 2).sorted().forEach(list1 -> System.out.println(list1));
		intList.stream().filter(list1 -> list1 < 10).collect(Collectors.toList());
		System.out.println("Stream sorted-----" + intList.stream().sorted().filter(i -> i > 5).mapToInt(i -> i).sum());

	}

}
