package com.day4assignment;

public class Student {
	int roll;
	String name;
	String address ;
	String collegeName;
	
	public Student(int i, String string, String string2, String string3) {
		roll = i;
		name = string ;
		address = string2;
		collegeName = string3;
	}
	

	public void getName() {
		
		System.out.println("Name is :"+this.name);
		System.out.println("Roll is :"+this.roll);
		System.out.println("Address is :"+this.address);
		System.out.println("College name is :"+this.collegeName);
		
		
	}
	
	public void setName(boolean a) {
		
		if(a==true) {
			
			System.out.println("He is blong to NIT");
		  getName();
		}
		else
		{
			System.out.println("He is Not belong to NIT");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Student d1 = new Student(20,"Hari","Mumbai","NIT");
		
		boolean b1 = true;
		d1.setName(b1);
		
		System.out.println("===============================");
		Student d2 = new Student(15,"Ram","Delhi","Nehru");
		boolean b2 = false;
		d2.setName(b2);
	}
}
