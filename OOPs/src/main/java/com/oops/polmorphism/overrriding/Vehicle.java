package com.oops.polmorphism.overrriding;

class Bike {

	int prize = 5000;

	public void dis() {
		System.out.println("Old impl");
	}

}

public class Vehicle extends Bike {

	int prize = 8000;

	public void dis() {
		System.out.println("New impl");
	}

	public void show() {
		System.out.println("Prize :" + prize);
		System.out.println("Using super Prize:" + super.prize);
	}

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.show();
		v.dis();
		Bike b = new Vehicle();
		b.dis();
		Bike b1 = new Bike();
		b1.dis();

	}

}
