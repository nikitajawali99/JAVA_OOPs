package com.oops.wrapper;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

		int no = 10;

		Integer number = no; // Auto - boxing

		System.out.println("Auto boxing :" + number);

		int number2 = number; // Auto - unboxing

		System.out.println("Auto un-boxing :" + number2);

	}

}
