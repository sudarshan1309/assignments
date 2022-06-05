package question1;
import java.util.Scanner;
public class Main {

	public static String reversString(String input){
		//write the logic
		
	  	String str="";
	  	for(int i=input.length()-1; i>=0; i--) {
	  		str +=input.charAt(i);
	  	}
		
		

		return str;
	
		}
		public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a String to reverse");
			String orignalString = sc.next();
			String result =Main.reversString(orignalString);
			System.out.println("Original String is :"+ orignalString);
			System.out.println("Reversed String is :"+ result);
		  }
		}
	
}
