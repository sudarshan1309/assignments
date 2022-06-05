package question4;

import java.util.Scanner;

public class AxisBank extends Bank{

	public AxisBank() {
		super();
	}
	public AxisBank(Scanner sc) {
		super(sc);	
		super.branchName = "Axis Bank"; 
		System.out.println("Enter Rate of Interest : ");
		this.rateOfInterest = sc.nextDouble();
	}

	
	double rateOfInterest;
	
	@Override
	void displayDetails() {
		System.out.println("Bank Name " +this.branchName );
		System.out.println("IFSC Code "+this.ifscCode);
		System.out.println("Rate Of Interest : "+this.rateOfInterest);
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
}