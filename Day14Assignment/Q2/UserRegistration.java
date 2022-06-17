package Day14Assignment.Q2;

import java.util.Scanner;

class InvalidCountryException extends Exception
{
	public InvalidCountryException(String err)
	{
		super(err);
	}
}
public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username ");
		String username = s.next();
		
		System.out.println("Enter userCountry ");
		String userCountry = s.next();
		try 
		{
			registerUser(username,userCountry);
		} 
		catch (InvalidCountryException e) 
		{
			
			//e.printStackTrace();
			System.out.println("User Outside India cannot be registered");
		}
	}
	
	public static void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if(userCountry.equals("India"))//to check the equality of 2 String 
		{
			System.out.println("User registration done successfully");
		}
		else
		{
			InvalidCountryException e = new InvalidCountryException(userCountry);
			throw e;
		}
	}
}
