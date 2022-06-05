package question4;

public class Main {

	public static void main(String[] args) {
//		Animal[] animal = {new Dog(),new Cat(),new Tiger()};
		Animal[] animal = new Animal[3];
		animal[0]= new Dog();
		animal[1]= new Cat();
		animal[2]= new Tiger();

		
	
		for(int i=0;i<animal.length;i++) {
			animal[i].eat();
			animal[i].walk();
			animal[i].makeNoise();
			System.out.println("===========================");
		}
	}

}


/*
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