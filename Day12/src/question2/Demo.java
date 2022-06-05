package question2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		boolean nam=Pattern.matches("[a-zA-Z]{3,8}", name);
		
		boolean mob=Pattern.matches("[6789]{1}[0-9]{9}", mobileNum);
		
		
		boolean adh=Pattern.matches("[0-9]{12}", aadharCard);
		
		if(nam && mob && adh) {
			return true;
		}else {
		return false;
	    }
	}	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = scan.next();
		
		System.out.println("Enter Your Aadhar Number");
		String aadharNumber  = scan.next();
		
		System.out.println("Enter Your Mobile  Number");
		String mobileNumber = scan.next();
		
				
		Demo d1 = new Demo();
		boolean result = d1.validate(name, mobileNumber, aadharNumber);
		
				
		if(result) {
			Citizen details = new Citizen(name,aadharNumber,mobileNumber);
			
			System.out.println("Name: "+ details.getName());
			System.out.println("Aaddhar Number: "+ details.getAddharNumber());
			System.out.println("Mobile Number: "+ details.getMobileNumber());
		}
		else {
			System.out.println("Please Enter Correct Credential");
		}
	}
	
	
}
