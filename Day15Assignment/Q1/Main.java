package Day15Assignment.Q1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//user defined exception class
class InvalidDateFormat extends Exception
{
	public InvalidDateFormat(String error) 
	{
		super(error);
	}
}
public class Main {
	public static void Age() throws InvalidDateFormat
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter date of birth in dd/MM/yyyy formate");
		String Dob = s.next();
		
		try
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate ld = LocalDate.parse(Dob,dtf);
			
			LocalDate today = LocalDate.now();
			//System.out.println(today+"=========="+ld);
			
			Period AgeDiff = Period.between(ld, today);
			//System.out.println(ld.getYear());
			
			
			if(ld.getYear()>today.getYear())
			{
				System.out.println("Date should not be in Future.");
			}
			else
			{
				System.out.println("Current Age is "+AgeDiff.getYears()+
						" Year's "+AgeDiff.getMonths()+" Month's "+AgeDiff.getDays()+
						" Day's");
			}
		}
		catch(Exception e)
		{
			InvalidDateFormat ex = new InvalidDateFormat("user defined exception");
			throw ex;
		}
		
	}

	public static void main(String[] args) 
	{
		try
		{
			Age();
		} 
		catch (InvalidDateFormat e) 
		{
			//e.printStackTrace();
			System.out.println("Enter Date in valid dd/MM/yyyy format");
		}
	}

}
