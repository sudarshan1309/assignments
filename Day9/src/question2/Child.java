package question2;

import java.util.Scanner;

final class Child extends Parent {


	@Override
	public void method1() {
		System.out.println("Number:"+ num);
		System.out.println("method1 of child class");
	}
	
	
	public void method4() {
		System.out.println("method4 of child");
	}
	
	public Child(int num){
		super(num);
	}
	
	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in);
		  
		  
		  System.out.println("Enter Number");
		   int num=sc.nextInt();
		   
		   if(num>0 && num<11) {
			   Parent parent = new Child(num);
			   
			   parent.method1();
			   parent.method2();
			   parent.method3();
			   
			   ((Child)parent).method4();
		   }
		   else {
			   
			   Parent parent = new Child(0);
				  System.out.println("Invalid Number");
			   parent.method1();
			   parent.method2();
			   parent.method3();
			   ((Child)parent).method4();
		   }
	}

}
