package com.day4assignment;

public class Demo {

	String a;
	int b;
	float f;
	
	
	public Demo() {
		this("Rupesh");
		System.out.println("It's a empty constructor");
	}
	
	public Demo(String a) {
		this(01);
		System.out.println("It's a string constructor");
	}
	
	public Demo(int b) {
		this(10.00f);
		System.out.println("It's a int constructor");
	}
	
	public Demo(float f) {
		System.out.println("It's a float constructor");
	}
	
	public static void main(String[] args) {
//		Demo d1 = new Demo();
		new Demo();
	}
}
