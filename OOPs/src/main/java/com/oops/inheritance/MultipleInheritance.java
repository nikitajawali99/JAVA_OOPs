package com.oops.inheritance;

class ATest {

	void show() {
		System.out.println("Inside ATest");
	}

}

class BTest {

	void show() {
		System.out.println("Inside BTest");
	}
}

public class MultipleInheritance
//extends BTest,ATest  -> Multiple inheritance
{

	public static void main(String[] args) {

		ATest t = new ATest();
		t.show();
		BTest b = new BTest();
		b.show();

	}

}
