package com.oops.inheritance;

class Demo {

	public void print() {
		System.out.println("In printing ::parent");
	}

	public Demo() {
		super();
		System.out.println("Demo constructor");
	}

}

public class SingleInheritance extends Demo {

	public void print() {
		super.print();
		System.out.println("In printing ::child");
	}

	public SingleInheritance() {
		super();
		System.out.println("SingleInheritance constructor");
	}

	public static void main(String[] args) {

		SingleInheritance s = new SingleInheritance();
		s.print();

	}

}
