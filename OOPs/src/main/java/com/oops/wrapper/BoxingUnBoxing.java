package com.oops.wrapper;

public class BoxingUnBoxing {

	public static void main(String[] args) {

		int no = 90;
		Integer number = new Integer(no); // Boxing

		System.out.println("Boxing no:" + number);

		Integer number1 = Integer.valueOf(no); // Boxing

		System.out.println("Boxing no 1:" + number1);

		int num = number1.intValue();
		System.out.println("Unboxing :" + num);

	}

}
