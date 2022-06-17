package Day14Assignment.Q3;
//Explain Finally and Final Keyword with an Example?

//Ans

/*Final :- final is a keyword which is basically used with class ,method and variable if a 
 * class is declare as final then it can't be inherited , if a method is declare as final 
 * then it can't be override and if a variable is declare as final then it can't be reassigned
 * the value.
 * 
 * finally :- finally is a keyword which create a block of code that follow try block 
 * and finally block code always executed whether exception occur or not it will not execute 
 * in one case when we force fully call System.exit(0) method.
 * */


class FinalKeyWord
{
	final int Num=10;
	public void changeNum()
	{
		//Num=23;
		System.out.println("can't be reassigned the value of final variable ");
	}
}
public class Main {
	

	public static void main(String[] args) 
	{
		FinalKeyWord f1 = new FinalKeyWord();
		f1.changeNum();//o/p Error
		
		try 
		{
			int res = 10/0;
		} catch (Exception e) {
			System.out.println("Exception occur");
		}
		finally 
		{
			System.out.println("finally block code");
		}
	}

}
