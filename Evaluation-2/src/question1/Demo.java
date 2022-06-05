package question1;

/*
Q1) Explain the difference between IS-A and Has-A relationship with the help of an
example and explain about access modifiers and their accessibility?

IS-A relationship means classes which is extended from the parent class they are is known as IS-A relationship.
       Has-A relatonship means classes which has child classes inside parent class is known as Has-A relationship.


Access modifiers are the modifier which is used to increase visibility as well as accessibility.Its accessibility are:
1) Public ===> which has very high visibility which can access everywhere.
2)Private ===> which is accessible inside that particular class only not outside of that particular class.
3)Protected ==> same as Default but can be access in another package with the help of inheritance.
4)Default ===> public inside the same package but act as private outside the package.
*/


/*
 * eg of IS-a relationship



public class Bird{
	public void funA() {
		System.out.println("Inside Bird class");
	}
}
public class Parrot extends Bird {    // Here Parrot IS-A Bird 

	public static void main(String[] args) {
		Bird c1 = new Bird();
		c1.funA();
	}
	
}
 */


/* 
 * eg of Has-A relationship
 * 
 * public class Bike{
 * String name;
 * String company;
 * Engine engine;   //Here Bike HAS-A Engine  
 * 
 * }
 * 
 * public class Engine{
 * 
 * public void fun1() {
		System.out.println("Inside Engine class");
	}
 * 
 * 
 */



public class Demo{
	public static void main(String[] args) {
		System.out.println("Answer of Question 1");
	}
}







