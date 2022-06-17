package Day14Assignment.Q1;

class InsufficientFundsException extends Exception
{

	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
		
	}	
}
class Account
{
	String accountNumber;
	double Balance ;
	Account(String accountNumber) 
	{
		super();
		this.accountNumber = accountNumber;
	}
	void deposit(double amount)
	{
		this.Balance +=amount;
		System.out.println("Total Account Balance : "+this.Balance );
	}
	double withdraw(double amount) throws InsufficientFundsException
	{
		if(amount <= this.Balance)
		{
			System.out.println("withdraw Amount : "+amount);
			this.Balance -=amount;
			System.out.println("Remaining Amount : "+this.Balance );
		}
		else
		{
			System.out.println("withdraw Amount : "+amount);
			InsufficientFundsException e = new InsufficientFundsException("InsufficientFunds");
			throw e;
		}
		return 0;
	}
	
	
}
public class AccountDemo {

	public static void main(String[] args) 
	{
		Account a1 = new Account("123456789");
		a1.deposit(35000);
		
		try 
		{
			a1.withdraw(40000);
		} 
		catch (InsufficientFundsException e) 
		{
			//e.printStackTrace();
			System.out.println("InsufficientFundsException");
		}
		
		System.out.println("Normal termination of main");
	}

}
