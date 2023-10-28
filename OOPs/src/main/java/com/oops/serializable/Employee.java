package com.oops.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	public String name, address;
	public transient int salary;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	public static void main(String[] args) throws IOException {

		Employee e = new Employee();
		e.name = "Niki";
		e.address = "Thane";
		e.salary = 9000;
		System.out.println(e);

		FileOutputStream fs = new FileOutputStream("emp.txt");
		ObjectOutputStream out = new ObjectOutputStream(fs);
		out.writeObject(e);
		out.flush();
		out.close();
		System.out.println("success");

	}

}
