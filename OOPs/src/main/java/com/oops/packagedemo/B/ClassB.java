package com.oops.packagedemo.B;

import com.oops.packagedemo.A.ClassA;

class ClassT {

	void m4() {
		System.out.println("Inside m4");
	}

	protected void m3() {
		System.out.println("Inside m3");
	}

	private void m1() {
		System.out.println("Inside m1");
	}

}

public class ClassB {

	public static void main(String[] args) {

		ClassA a = new ClassA();
		a.mesg();
		ClassT t = new ClassT();
		t.m4();
		t.m3();
		ClassC c = new ClassC();
		c.c();
		c.b();

	}
}
