package com.oops.interfaces;

interface print {

	public abstract void prints();

	interface show {

		void shows();

	}

	interface dis {

		void diss();
	}

}

public class NestedInterface implements print.show, print.dis, print {

	@Override
	public void diss() {
		System.out.println("Inside disss");
	}

	@Override
	public void shows() {
		System.out.println("Inside shows");

	}

	@Override
	public void prints() {
		System.out.println("Inside prints");
	}

	public static void main(String[] args) {

		NestedInterface n = new NestedInterface();
		n.diss();
		n.shows();
		n.prints();

	}

}
