package question1;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
	int size=scan.nextInt();
	int [] array=new int [size];
	for(int i=0; i<size; i++) {	
		System.out.println("Enter the elements in the array");
		array[i]=scan.nextInt();
		
	}
	System. out.println("Enter the index of the array element you want to access");
	int index=scan.nextInt()-1;
	System.out.println("The array elelment at index "+ ++index+" = "+array[index]);
	System.out.println("The array element successfully accessed");
	

	}

}
