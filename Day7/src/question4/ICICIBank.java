package question4;

import java.util.Scanner;

public class ICICIBank extends Bank{

	public ICICIBank() {
		
	}
	public ICICIBank(Scanner sc) {
		super(sc);
		super.branchName = "ICICI Bank";
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
	
	
}