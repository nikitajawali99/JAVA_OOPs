package com.oops.inheritance;

class Parent {

	int num = 10;

	void dis() {
		System.out.println("Parent Num :" + num);
	}

	public Parent(int num) {
		System.out.println("Inside parent constructor:" + num);
	}

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class UseOfSuper extends Parent {

	int num1 = 20;

	public UseOfSuper(int num, int num1) {
		super(num);
		this.num1 = num1;
	}

	public UseOfSuper() {
		super();
	}

	public UseOfSuper(int num) {
		super(num);
	}

	public void dis() {
		super.dis();
		System.out.println("Child:" + num1);
		System.out.println("Child using super:" + super.num);

	}

	public static void main(String[] args) {

		UseOfSuper u = new UseOfSuper();
		u.dis();
		System.out.println("________________________________");
		UseOfSuper u1 = new UseOfSuper(29);
		u1.dis();

	}

}
