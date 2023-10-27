package com.oops.interfaces;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {

	private static final long serialVersionUID = 1L;
	int i;
	String s;

	public A(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", s=" + s + "]";
	}

}

public class SerializableDemo {

	public static void main(String[] args) throws IOException {

		A s = new A(145, "Niki");

		FileOutputStream fos = new FileOutputStream("xyz.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		fos.close();
		oos.close();
		System.out.println(s);

	}

}
