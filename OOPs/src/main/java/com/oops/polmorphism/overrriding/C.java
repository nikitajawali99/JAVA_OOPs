package com.oops.polmorphism.overrriding;

class A {

	void callme() {
		System.out.println("Inside A's callme");
	}

}

class B extends A {

	void callme() {
		System.out.println("Inside B's callme");
	}

}

public class C extends B {

	void callme() {
		System.out.println("Inside C's callme");
	}

	public static void main(String[] args) {
		A a = new A();
		a.callme();
		B b = new B();
		b.callme();
		C c = new C();
		c.callme();

		A r;
		r = a;
		r.callme();
		r = b;
		r.callme();
		r = c;
		r.callme();

	}
}
