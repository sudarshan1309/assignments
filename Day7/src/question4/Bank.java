package question4;

import java.util.Scanner;

public class Bank {

	@Override
	public String toString() {
		return "Bank : "+ this.branchName + " IFSC Code : "+ this.ifscCode ;
	}
	
	String branchName;
	String ifscCode;
	
	void displayDetails() {
		System.out.println("Bank Name " +this.branchName );
		System.out.println("IFSC Code "+this.ifscCode);
	}
	
	
	public Bank() {
		super();
	}
	public Bank(Scanner sc) {
		super();
		System.out.println("Enter IFSC code : ");
		this.ifscCode = sc.nextLine();
	}
	
}