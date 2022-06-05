package com.day3assignment;

public class StudentDetails {
	  
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int roll , String name , int marks) {
		System.out.println("Roll is :"+" "+roll);
		System.out.println("Name is :"+" "+name);
		System.out.println("Marks is :"+" "+marks);
	    System.out.println("==========================");
	}
	
	
	public static void main(String[] argus) {
		
		StudentDetails d1 = new StudentDetails();
		  
		d1.roll=1;
		d1.name="Harshit Bhai";
		d1.marks=500;
		
		d1.displayStudentDetails(d1.roll,d1.name,d1.marks);
		
		StudentDetails d2 = d1;
		d2.roll=2;
		d2.name="Rupesh Bhai";
		d2.marks=499;
		d2.displayStudentDetails(d2.roll,d2.name,d2.marks);
		
		d1 = null;
		
	}
}