
//Write a non-static method inside a java class that accepts a whole number and prints
//the same number if the input is Odd. If the input is even, it should print the next multiple
//of ten. If the input is negative, print the string: “Error”.
//Input: 44, output: 50
//Input: 45, output: 45
//Input: -5, output: Error


package com.day4assignment;

public class Question4 {

	
	public void funA(int a) {
		if(a%2==1) {
			System.out.println(a);
		}
		else if(a%2==0){
			int x = (a%10);
			int y = (10-x);
			int ans = (a+y);
			System.out.println(ans);
		}
		else {
			System.out.println("Error");
		}
		
	}
	
	public static void main(String[] args) {
		
		Question4 s1 = new Question4();
		
		int a = 44;
		int b = 45;
		int c = -5;
		
		s1.funA(a);
		s1.funA(b);
		s1.funA(c);
		
	}
}


