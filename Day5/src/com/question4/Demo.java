package com.question4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the number of Students");
         int number = s1.nextInt();
	     
         
	     Student [] students  = new Student[number];
		
	    for (int i = 0; i < number; i++) {
	    	 
	    students[i] = new Student();
	    
		System.out.println("Enter roll : ");
		int roll = s1.nextInt();
		
		s1.nextLine();
		
		System.out.println("Enter Name : ");
		String Name = s1.nextLine();
		
//		s1.nextLine();
		
		System.out.println("Enter Address : ");
		String addrress = s1.nextLine();
		
		System.out.println("Enter Marks : ");
		int marks = s1.nextInt();
		
		students[i].setRoll(roll);
		students[i].setName(Name);
		students[i].setAddress(addrress);
		students[i].setMarks(marks);
	     
		
		    
	    }
	    double sum = 0;
	  
	    for (Student student : students) {
	    	System.out.println("Student Details ");
		     
		    System.out.println(" Roll is : " + student.getRoll());
		    System.out.println("Name is  : " + student.getName());
		    System.out.println("Address is : " + student.getMarks());
		    System.out.println("Marks is : " +student.getMarks());
		    System.out.println("================================");
		    sum += student.getMarks();
		    
		}
	    
	    System.out.println("Average is : " + sum/number);
	     
	
	}
}
