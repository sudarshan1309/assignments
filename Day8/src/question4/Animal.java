package question4;

public class Animal {
	
	public void makeNoise(){
		System.out.println("Animal making Noise");
		}
	
		public void eat(){
		System.out.println("Animal is eating");
		}
		
		public void walk(){
		System.out.println("Animal is walking");
		}
}



/*
 * Q4) Create an Java class with the name Animal.
Inside this class define following 3 methods

public void makeNoise(){
System.out.println("Animal making Noise");
}
public void eat(){
System.out.println("Animal is eating");
}
public void walk(){
System.out.println("Animal is walking");
}
Create 3 child classes for the above Animal class

1. Dog
2. Cat
3. Tiger
Override makeNoise method in all these child classes as follows:
1. Inside Dog:
System.out.println("Barking...")
2. Inside Cat:

System.out.println("Meaw...");
3. Inside Tiger:
System.out.println("Raoring...");
Create the Main class as follows and implement the commented line
class Main{
public static void main(String[] args){
//create an array of Animal class with size 3
//initialize all 3 elements of this Animal class
with //Dog, Cat and Tiger class object.
//call the all methods (eat,walk,makeNoise) from all
//the 3 objects.
}
}
 */
