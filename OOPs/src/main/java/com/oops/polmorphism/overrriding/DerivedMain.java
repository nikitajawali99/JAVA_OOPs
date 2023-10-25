package com.oops.polmorphism.overrriding;

class BaseMain {

	void test1() {
		System.out.println("Testing 1");
	}

	static void staticTest() {
		System.out.println("Inside parent static");
	}

	Object test() {
		System.out.println("Testing");
		return null;
	}

}

public class DerivedMain extends BaseMain {

	//covariant-type
	String test() {
		System.out.println("Testing");
		return null;
	}

	static void staticTest() {
		System.out.println("Inside child static");
	}

	public static void main(String[] args) {

		BaseMain b = new DerivedMain();
		b.test1();
		DerivedMain.staticTest();
		BaseMain.staticTest();

	}

}
