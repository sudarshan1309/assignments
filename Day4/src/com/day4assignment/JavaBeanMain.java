package com.day4assignment;

public class JavaBeanMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		JavaBean d1 = new JavaBean();
        d1.setAge(21);
        d1.setName("Rupesh");
        d1.setRoll(50);
        d1.setMarks(500);
		
        JavaBean d2 = new JavaBean(20,"Harshit",400,21);

		d1.name();
		
		System.out.println("************");
		
		d2.name();
		
		
		
	}
}
