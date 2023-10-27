package com.oops.interfaces;

public class CloneableDemo implements Cloneable {

	int id;
	String name, address;

	public CloneableDemo(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "CloneableDemo [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		CloneableDemo c = new CloneableDemo(1, "Nikki", "Mumbai");
		System.out.println(c.toString());
		CloneableDemo c1 = (CloneableDemo) c.clone();
		System.out.println(c1.toString());

	}

}
