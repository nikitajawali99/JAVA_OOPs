package com.oops.polmorphism.overloading;

public class StaticPoly {

	String mesg;

	public StaticPoly() {
		super();
		System.out.println("Inside StaticPoly default constructor ");
	}

	public StaticPoly(String mesg) {
		super();
		this.mesg = mesg;
		System.out.println("Inside StaticPoly parameterized constructor :" + mesg);
	}

	void sum() {
		System.out.println("Inside empty method");
	}

	void sum(int x) {
		System.out.println("Inside method:" + x);
	}

	public static void main(String[] args) {

		StaticPoly p = new StaticPoly();
		p.sum();
		p.sum(7);
		StaticPoly p1 = new StaticPoly("hello");

	}

}
