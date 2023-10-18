package com.oops.inheritance;

class ADemo {

	void show() {
		System.out.println("Inside ADemo::show");
	}
}

class BDemo extends ADemo {

	void show() {
		System.out.println("Inside BDemo::show");
	}

}

class CDemo extends ADemo {

	void show() {
		System.out.println("Inside CDemo::show");
	}

}

public class HierarchialInheritance extends ADemo {

	public static void main(String[] args) {

		CDemo c = new CDemo();
		c.show();
		BDemo b = new BDemo();
		b.show();
		ADemo a = new ADemo();
		a.show();

	}

}
