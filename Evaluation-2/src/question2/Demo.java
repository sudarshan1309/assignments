package question2;

import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter Number of students");
			int n = scan.nextInt();

			int[] arr = new int[n];
			
			int avg=0;
			
			for(int i=0;i<arr.length;i++) {
				Student s = new Student(); 

				scan.nextLine();
				System.out.println("Enter Student Name");
				s.setName(scan.nextLine());
				
				System.out.println("Enter Student Rollno.");
				s.setRoll(scan.nextInt());
				
				System.out.println("Enter Student Address");
				s.setAddress(scan.next());
				
				System.out.println("Enter Student Mark");
				int m = scan.nextInt();
				s.setMark(m);
				
				avg+=m;
				
				System.out.println("Name:- "+s.getName());
				System.out.println("Roll.No.:- "+s.getRoll());
				System.out.println("Address:- "+s.getAddress());
				System.out.println("Mark:- "+s.getMark());
				System.out.println("=======================================================");

			}
			
			System.out.println("Average:- "+avg);
		}
		
	}

}


/*
 * Q2)Create a Student Bean class with the following fields:

roll: Integer
name: String
address: String
marks: Integer

Create a Demo class and perform the following operation in the main method:

Take the number as input from the user, How many Student objects need to be
created.
Create an array of Students with those numbers.
Initialize all the student objects by taking details from the user.
print all the Student details.
print the average of all the Student marks.
 */
