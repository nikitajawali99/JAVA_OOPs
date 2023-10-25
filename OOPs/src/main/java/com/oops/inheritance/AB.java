package com.oops.inheritance;

class kk{
	
	
}

final class Nik{
	
	
}

class AA {

	int x = 10;
	protected int y = 20;
	public int z = 30;
	private int a = 40;

	void show() {
		System.out.println("A:" + a);
	}

}

class BB extends AA{
	public int z =45;
	
	void show() {
		System.out.println("A:" + z);
	}
	
	void details() {
		show();
	}
	
}

public class AB extends BB{

	public static void main(String[] args) {
		
		BB b = new BB();
		System.out.println("Z:"+b.z);
		System.out.println("X:"+b.x);
		System.out.println("Y:"+b.y);
		//System.out.println("A:"+b.a); --> private can't be accessed
		b.details();
		b.show();
		
	}
	
}
