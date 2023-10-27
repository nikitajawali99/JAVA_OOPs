package com.oops.interfaces;

interface city {
	void mumbai();
}

interface country {
	void india();

}

public class MultipleInheritance implements city, country {

	@Override
	public void india() {
		System.out.println("Inside india");
	}

	@Override
	public void mumbai() {
		System.out.println("Inside mumbai");
	}

	public static void main(String[] args) {

		MultipleInheritance m = new MultipleInheritance();
		m.india();
		m.mumbai();

	}

}
