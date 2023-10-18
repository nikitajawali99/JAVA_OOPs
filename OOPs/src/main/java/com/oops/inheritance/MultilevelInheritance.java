package com.oops.inheritance;

class A {

	void show() {
		System.out.println("Inside show:A");
	}
}

class B extends A {

	void show() {
		super.show();
		System.out.println("Inside show:B");
	}

}

public class MultilevelInheritance extends B {

	void show() {
		super.show();
		System.out.println("Inside show:MultilevelInheritance");
	}

	public static void main(String[] args) {

		MultilevelInheritance m = new MultilevelInheritance();
		m.show();

	}

}
