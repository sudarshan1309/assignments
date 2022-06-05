package question2;

/*
 * Q2) Explain ClassCastException with the help of the example.

 Defination
  ClassCastException an exception is an object of some java classes that will be created by the
   JVM at runtime whenever any Logical error occurs in our java application. */

//example


	public class Main{
		public static void main(String args[]){
		try{
		//code that may raise exception
		int data=100/0;
		System.out.println(data);
		}catch(ArithmeticException e){
		System.out.println(e);
		}
		//rest code of the program
		System.out.println("rest of the code...");
		}
		
}






