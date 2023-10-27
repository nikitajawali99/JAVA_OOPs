package com.oops.interfaces;

interface i1 {
	public static final String firstName = "rohan";

}

interface i2 {
	int age = 21;
}

public class Implement implements i1, i2 {

	public static void main(String[] args) {

		System.out.println("First name:" + firstName);
		System.out.println("Age:" + age);

	}

}
