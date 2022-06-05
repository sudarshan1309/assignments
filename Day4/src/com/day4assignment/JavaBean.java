package com.day4assignment;

public class JavaBean {
	int roll;
	String name;
	int age ;
	int marks;
	
	
	

	public JavaBean() {
	
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public JavaBean(int roll, String name, int marks, int age) {
		
		this.roll=roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
		
	}
	
	 void name(){
		if((age > 18 && age<= 60) && (0<marks && marks<=500))
		{
		System.out.println("Name is:"+name);
		
		
		System.out.println("Roll Number is:"+roll);
	
		System.out.println("Age is :"+age);
	
		System.out.println("Marks is:"+marks);
		}
		
		else
			{
			System.out.println("Invalid Person");
			}
		
	}



}
