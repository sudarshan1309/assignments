package com.question2;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	
//	The method which is not assign as static are called non-static method.
//ex= public void displayCourseDetails()(){  }
	
	
	public void displayCourseDetails(int courseId,String courseName,int courseFee) {
		System.out.println("================================");
		System.out.println("courseId : "+courseId);
		System.out.println("courseName : "+ courseName);
		System.out.println("courseFee : "+courseFee);
	}
	
	public void setData() {
		Course ram = new Course();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter course Id");
		ram.courseId=(scan.nextInt());
		
		scan.nextLine();
		System.out.println("Enter Course Name");
		ram.courseName=(scan.nextLine());
		
		System.out.println("Enter courseFee");
		ram.courseFee=(scan.nextInt());
		
		this.displayCourseDetails(ram.courseId,ram.courseName,ram.courseFee);
		
	}
	
//	The method which is  assign as static are called static method.
//ex= public static void displayCourseDetails()(){  }
	
	public void authenticate(String username, String password) {
		if(username=="Admin" & password == "1234") {
		 this.setData();
			
//			System.out.println("Enter course Id");
			
			
			
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public Course() {
		
	}
	
	public static void main(String[] args) {
		Course rupesh = new Course();
		rupesh.authenticate("Admin", "12345");
		
		
	}
}
