package com.oops.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class A {
}

class B extends A {
}

public class SerializableDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static int value;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SerializableDemo obj = new SerializableDemo();
		value = 90;
		FileOutputStream fos = new FileOutputStream("serial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		System.out.println("Value:" + value);
		oos.close();

		FileInputStream fs = new FileInputStream("serial.txt");
		ObjectInputStream ois = new ObjectInputStream(fs);
		SerializableDemo s = (SerializableDemo) ois.readObject();
		System.out.println("Value :" + s.value);

	}

}
