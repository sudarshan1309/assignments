package question3;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the Number of Passenger");
				int numberOfPassenger=sc.nextInt();
				
				System.out.println("Enter the number of Kms");
				int numberOfKms= sc.nextInt();
				
				
				OLA myOla = new OLA();
				Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
				int res = myOla.calculateBill(myCar);
				
				System.out.println("------------------------------------");
				System.out.println("The total fare amount is"+ res);
			}
		}
		
}
