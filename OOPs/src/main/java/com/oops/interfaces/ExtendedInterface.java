package com.oops.interfaces;

interface printdemo {

	void test();
}

interface show extends printdemo {
	void test();

}

public class ExtendedInterface implements show, printdemo {

	@Override
	public void test() {
		System.out.println("Testing");

	}

	public static void main(String[] args) {

		ExtendedInterface i = new ExtendedInterface();
		i.test();
	}

}
