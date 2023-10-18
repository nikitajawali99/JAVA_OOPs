package com.oops.inheritance;

import java.util.Date;

class Employee {

	Date joiningDate;
	String gender, position;
	double salary;

	public void show() {
		System.out.println("Employee joining date:" + joiningDate);
		System.out.println("Employee gender:" + gender);
		System.out.println("Employee position:" + position);
	}
}

public class Programmer extends Employee {

	int experienceInYears;
	double salary;
	double bonus;

	double getSalary(double salary, double bonus) {
		return bonus + salary;
	}

	public void show() {
		super.show();
		System.out.println("Experience in years:" + experienceInYears);
		System.out.println("Salary:" + salary);
		System.out.println("Salary after bonus :" + getSalary(salary, bonus));

	}

	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.show();
		System.out.println("--------------------------------");
		p.experienceInYears = 2;
		p.gender = "Female";
		Date date = new Date(20 - 2 - 2023);
		p.joiningDate = date;
		p.salary = 80000.8;
		p.position = "SDE";
		p.bonus = 800.0;
		p.getSalary(p.salary, p.bonus);
		p.show();

	}

}
