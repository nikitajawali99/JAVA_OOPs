package com.oops.polmorphism.overrriding;

class Org {

	int professionalPeriod;
	int casualLeaves;
	String qualification;
	int x, y;

	public void setDemo(int x, int y) {
		System.out.println("X:" + x + "|" + "Y:" + y);
	}

	public void setPolicy() {
		System.out.println("Professional period :" + professionalPeriod);
		System.out.println("Casual leaves :" + casualLeaves);
		System.out.println("Qualification:" + qualification);
	}

}

public class Organization extends Org {

	String certification;

	public void setDemo(int x, int y, int z) {
		super.setDemo(x, y);
		System.out.println("X:" + x + "|" + "Y:" + y);
	}

	public void setPolicy() {
		super.setPolicy();
		System.out.println("Certification:" + certification);
	}

	public static void main(String[] args) {

		Organization o = new Organization();
		o.casualLeaves = 9;
		o.certification = "String";
		o.professionalPeriod = 90;
		o.qualification = "BE";
		o.setPolicy();
		o.setDemo(90, 60, 40);

	}

}
