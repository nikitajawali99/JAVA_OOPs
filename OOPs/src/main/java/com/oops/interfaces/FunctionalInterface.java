package com.oops.interfaces;

interface functional {

	void run();

}

public class FunctionalInterface implements functional {

	@Override
	public void run() {
		System.out.println("I'm running");
	}

	public static void main(String[] args) {

		FunctionalInterface i = new FunctionalInterface();
		i.run();

	}

}
