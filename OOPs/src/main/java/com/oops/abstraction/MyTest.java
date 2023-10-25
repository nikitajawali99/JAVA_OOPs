package com.oops.abstraction;

abstract class Mydemo {

	int rollNo;
	String name;

	public Mydemo(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Mydemo() {
		super();
		rollNo = 90;
		name = "Niki";
	}

	abstract void test(int rollNo, String name);

}

public class MyTest extends Mydemo {

	public MyTest() {
		super();
		rollNo = 9999;
		name = "XYZ";
	}

	public MyTest(int rollNo, String name) {
		super(rollNo, name);
		System.out.println("Roll no:" + rollNo);
		System.out.println("Name:" + name);
	}

	@Override
	void test(int rollNo, String name) {
		System.out.println("Roll no:" + rollNo);
		System.out.println("Name:" + name);
	}

	public static void main(String[] args) {

		MyTest t = new MyTest();
		t.rollNo = 7878;
		t.name = "Kri";
		MyTest t2 = new MyTest();
		t2.test(t2.rollNo, t2.name);
		t.test(t.rollNo, t.name);
		MyTest t1 = new MyTest(7777, "Sit");

	}

}
