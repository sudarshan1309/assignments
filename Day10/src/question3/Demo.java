package question3;


/*
 * Q3) Explain abstract class and interface with an example.
 * 
 => A class that is declared as abstract is known as an abstract class. It can have abstract  and non-abstract methods.
 
 example:-
 
 
 abstract class Bike{
     abstract void run();
   }
   
   

public class Apache extends Bike{
    void run(){
     System.out.println("running safely");
       }
       
   
	public static void main(String args[]){
		Bike bike1 = new Apache();
		bike1.run();
		}
 }
 * 
 =============================================================================================================================
 
 Interface is a type of class which is decleared by interface keyword which contains 100% abstraction . It contains static constants and abstract methods.
 
 example:-
 

public interface Intr{
void funX();
void funY();
}




class Demo implements Intr{

		@Override
		public void funX(){
		System.out.println("inside funX of Demo");
		}
		
		@Override
		public void funY(){
		System.out.println("inside funY of Demo");
		}
}



class A implements Intr{

        @Override
		public void funX(){
		System.out.println("inside funX of A");
		}
		
		@Override
		public void funY(){
		System.out.println("inside funY of A");
		}
}


class Main{
		public static void main(String args[]){
		Intr i1=new A();
		
		i1.funX();
		i1.funY();
		}
}
  
 * 
 * 
 * 
 */

public class Demo {
	public static void main(String[] args) {
		System.out.println("Answer of quesion number 3");
	}
}
