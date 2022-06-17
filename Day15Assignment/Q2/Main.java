package Day15Assignment.Q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import Day15Assignment.Q1.InvalidDateFormat;

class InvalidAgeexception extends Exception
{
	public InvalidAgeexception( String error) 
	{
		super(error);
	}
}

class EmployeeBonus
{
	double bonous =0;
	public  double calBonus(String joiningdate) throws InvalidAgeexception
	{
		String Doj = joiningdate;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(Doj,dtf);
		
		LocalDate today = LocalDate.now();
		//System.out.println(today+"=========="+ld);
		
		Period AgeDiff = Period.between(ld, today);
		if(AgeDiff.getYears()<1)
		{
			this.bonous=5000;
		}
		else if(AgeDiff.getYears()==1 ||AgeDiff.getYears()<2)
		{
			this.bonous=8000;
		}
		else if(AgeDiff.getYears()>2)
		{
			this.bonous=10000;
		}
		if(ld.getYear()>today.getYear())
		{
			InvalidDateFormat ex = new InvalidDateFormat("”Age should not be in the future");
			throw ex;
		}
		return this.bonous;
	}
}

public class Main {

	public static void main(String[] args) 
	{
		EmployeeBonus e1 = new EmployeeBonus();
		try 
		{
			Double bonous = e1.calBonus("30/05/2018");
		} 
		catch (InvalidAgeexception e) 
		{
			e.printStackTrace();
		}
	}

}
