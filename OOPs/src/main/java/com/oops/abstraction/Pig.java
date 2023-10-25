package com.oops.abstraction;

abstract class Animal {

	private int a = 90;

	private void m1() {
		System.out.println("Inside m1");
		n6();
	}

	abstract void m8();

	private static void n6() {
		System.out.println("Inside private static ::n6");
	}

	public void m5() {
		m1();
		System.out.println("Inside m5:" + a);
	}

	protected abstract void m2();

	abstract void m3();

	final void m4() {
		System.out.println("Inside final ::m4");
	}

}

public class Pig extends Animal {

	private void n6() {
		System.out.println("Inside private::n6");
	}

	@Override
	protected void m2() {
		System.out.println("Inside m2");
	}

	@Override
	void m3() {
		System.out.println("Inside m3");
	}

	public static void main(String[] args) {
		Pig p = new Pig();
		p.m2();
		p.m3();
		p.m5();
		p.n6();
		p.m8();

	}

	@Override
	void m8() {
		System.out.println("Inside m8");
	}
}
