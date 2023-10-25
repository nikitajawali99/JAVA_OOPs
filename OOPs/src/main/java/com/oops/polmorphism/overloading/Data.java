package com.oops.polmorphism.overloading;

public class Data {

	public static void response(String data) {
		System.out.println("Inside String data:" + data);
	}

	public static void response(Integer data) {
		System.out.println("Inside Integer data:" + data);
	}

	public static void response(Float data) {
		System.out.println("Inside Float data:" + data);
	}

	public static void response(Double data) {
		System.out.println("Inside Double data:" + data);
	}

	public static void response(Character data) {
		System.out.println("Inside Character data:" + data);
	}

	public static void response(Boolean data) {
		System.out.println("Inside Boolean data:" + data);
	}

	public static void main(String[] args) {

		response(false);
		response('c');
		response(8.8);
		response(3.5f);
		response(5);
		response("Hello");

	}
}
