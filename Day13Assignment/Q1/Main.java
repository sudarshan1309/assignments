package Day13Assignment.Q1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main 
{
	public static void main(String args[])
{
System.out.println("start of main..");
Scanner sc = new Scanner(System.in);

//System.out.println("Enter num1");
//int num1 = sc.nextInt();
//
//System.out.println("Enter num2");
//int num2 = sc.nextInt();

try 
{
	System.out.println("Enter num1");
	int num1 = sc.nextInt();
	
	System.out.println("Enter num2");
	int num2 = sc.nextInt();
	
	String message = null;
	int num3 = num1 / num2;
	
	if(num3 > 10)
	{
	message = "�Message is :Welcome to Exception Handling ";
	System.out.println(message);
	}
	else
	{
		message = null;
		System.out.println("Message is :"+message.toUpperCase());
	}
		
} 
catch (InputMismatchException e) 
{
	System.out.println("Please enter valid number");
}
catch (ArithmeticException e) 
{
	System.out.println("num2 should not be 0");
}
catch (NullPointerException e) 
{
	System.out.println("String value is null");
}

System.out.println("end of main");


//String message = null;
//int num3 = num1 / num2;
//if(num3 > 10)
//{
//message = "Welcome to Exception Handling ";
//}
//System.out.println("Message is :"+message.toUpperCase());
//System.out.println("end of main");


}
}
