package com.oops.inheritance;

class Calculation {

	public void add(int x, int y) {
		int z = x + y;
		System.out.println("Old Z:" + z);
	}

}

public class MyCalculation extends Calculation {

	public void add(int x, int y) {
		int z = x + y - x;
		System.out.println("New Z:" + z);
	}

	public static void main(String[] args) {

		MyCalculation c = new MyCalculation();
		c.add(20, 10);
		Calculation c1 = new Calculation();
		c1.add(20, 10);
		Calculation c2 = new MyCalculation();
		c2.add(20, 10);

	}

}
