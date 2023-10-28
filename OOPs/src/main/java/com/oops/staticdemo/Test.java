package com.oops.staticdemo;

class Parent {

	static void test() {
		System.out.println("Inside parent test");
	}

}

public class Test extends Parent {

	{
		System.out.println("Inside instance block");
	}

	static int pie = 8;

	static {
		System.out.println("Inside static block-1");
	}

	static {
		System.out.println("Inside static block-2");
	}

	public Test() {
		System.out.println("Inside Test constructor");
	}

	void show() {
		test();
	}

	static void test() {
		System.out.println("Pie :" + pie);
	}

	public static void main(String[] args) {

		Test t = new Test();
		System.out.println();
		t.show();
		System.out.println();
		Test.test();
		System.out.println();
		Parent p = new Test();
		p.test(); // Method - hiding
		System.out.println("After method-hiding");
		Test.test();
		System.out.println();
		Parent.test();

	}

}
