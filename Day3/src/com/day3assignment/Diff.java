package com.day3assignment;

public class Diff {
	
//	*Static:-
//	 static element is that element which we can access directly from the main method without creating any object.
//	ex-  static int x = 10;	
//	class Demo {
//	 static int x=10;  //static 
//	    public static void main (String[] args){
//	      System.out.println(x);
//	   }
//	 
//	}
//
//	=========================================================================================================================================

	
	



//	*Non-Static:- 
//	Non-static elements are instance variable i.e those element which we can not directly from main method, we have to create a object to
//	 access that variable. 
//	ex- int x=10;


//	class Demo {
	 int x=10;  //non-static 
	    public static void main (String[] args){

	      Diff d1 = new Diff();
	      System.out.println(d1.x);
	   }
}
