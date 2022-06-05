package question1;

import java.util.Scanner;

public class Student {

	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {
		
	}
	
	@Override
	public String toString() {
		return "Student Name : "+name + ","
				+ "Student roll: " + roll + ","
				+ "Total marks: " + marks + ", "
				+ "Student Grade: " + grade;
	}
	
	public void displayDetails() {
		Scanner scanner  = new Scanner(System.in);
		
//		sc.nextLine();
		System.out.println("Enter Student name");
		this.name = scanner.nextLine();
		
		System.out.println("Enter Student roll number");
		this.roll = scanner.nextInt();
		
		System.out.println("Enter Student marks");;
		this.marks = scanner.nextInt();
		
		this.grade = calculateGrade();
		
	}
	
	
	private char calculateGrade() {
		if(this.marks >= 500) {
			return 'A';
		}
		
		else if(this.marks < 500 & this.marks >=400) {
			return 'B';
		}
		else {
			return 'C';	
		}
		
	}
	
	
}




