package com.question4;

public class Student {

		private int roll;
		private String name;
		private String address;
		private int marks;
		
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public int getRoll() {
			return roll;
		}
		
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public int getMarks() {
			return marks;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAddress() {
			return address;
		}
	}


/*

roll: Integer
name: String
Assignment Day5: 5
address: String
marks: Integer


Create a Demo class and perform the following operation in the main method:
Take the number as input from the user, How many Student objects need to be
created.
 Create an array of Students with those numbers.
Initialize all the student objects by taking details from the user.
print all the Student details
print the average of all the Student marks.
*/