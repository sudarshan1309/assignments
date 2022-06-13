package question1;

import java.time.LocalDate;  
import java.time.Period;  
import java.util.Scanner;  
public class AgeCalculator {
	public static void main(String args[])   
	{  
	System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
	Scanner scanner = new Scanner(System.in);  
	String input = scanner.nextLine();  
	scanner.close();    
	LocalDate dob = LocalDate.parse(input);   
	 calculateAge(dob);
	}
	public static int calculateAge(LocalDate dob)   
	{  
	LocalDate curDate = LocalDate.now();    
	if ((dob != null) && (curDate != null))   
	{  
	int age = Period.between(dob, curDate).getYears();  
	}  
	if(age>18) {
	System.out.print("You are eligible to cast your vote");
	}
	}  
}
