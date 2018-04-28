package com.test.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Date
//		LocalDate ld1 = LocalDate.now();
//		System.out.println("Current Date is :"+ld1);
//		LocalDate ld2 = LocalDate.of(2018, Month.APRIL, 2);
//		System.out.println("Date format 2 : "+ ld2);
//		LocalDate ld3 = LocalDate.ofEpochDay(365);
//		System.out.println("Date format 3 : "+ ld3);
//		LocalDate ld4 = LocalDate.ofYearDay(2017, 100);
//		System.out.println("Date format 3 : "+ ld4);
////Time
//		LocalTime time = LocalTime.now();
//		System.out.println("Time now : " + time);
//		
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Current DateTime 1 ="+today);
		System.out.println("Current DateTime 2 ="+today.format(DateTimeFormatter.ofPattern("MMM:uuuu:dd")));
//		
//		Instant timestamp = Instant.now();
//		System.out.println("Current Timestamp = "+timestamp);
		
		}
		
}
