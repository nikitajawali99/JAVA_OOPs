package com.oops.polmorphism.overrriding;

class BaseTest1 {

	private void add() {
		System.out.println("Inside private BaseTest1");
	}

	protected void addTest() {
		System.out.println("Inside protected BaseTest1");
	}

	public void addDemo() {
		System.out.println("Inside public BaseTest1 ");
	}

	void addMain() {
		System.out.println("Inside default BaseTest1 ");
	}

	public void test() {
		System.out.println("Inside child test");
	}
}

class BaseTest extends BaseTest1 {

	public void addDemo() {
		super.addDemo();
		add();
		System.out.println("Inside public BaseTest ");
	}

	private void add() {
		System.out.println("Inside private BaseTest");
	}

	protected void addTest() {
		super.addTest();
		System.out.println("Inside protected BaseTest");
	}

	void addMain() {
		super.addMain();
		System.out.println("Inside default BaseTest1 ");
	}

	void niki() {
		System.out.println("Inside niki");
	}

}

public class DerivedTest extends BaseTest {

	public static void main(String[] args) {

		BaseTest t = new BaseTest();
		t.addDemo();
		t.addMain();
		t.addTest();

		BaseTest t1 = new DerivedTest();
		t1.test();
		t1.niki();

	}

}
