package question3;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter Stadium Name");
			String name = scan.next();
			
			Stadium stadium= Stadium.valueOf(name);  //enum.java it will only accept those value 
			                                         //which are declare inside Stadium enum.
			IPL stadiumName = new IPL();
			
			stadiumName.homeTeamStadium(stadium);
			
		}
	}


}
