package question4;

import java.util.Scanner;

public class Demo {
	
	
	public static Bank getBank(String bank) {
		Scanner sc = new Scanner(System.in);
		
		if(bank.equals("axis")) {
			return new AxisBank(sc);
		}else if(bank.equals("icici")) {
			return new ICICIBank(sc);
		}else {
			return null;
		}
	}
	
	
	static void findBank(Bank b) {
		if(b instanceof AxisBank) {
			b.displayDetails();
			((AxisBank)b).getCreditCard();
		}else if(b instanceof ICICIBank) {
			b.displayDetails();
		}else {
			System.out.println("Invalid Bank Name");
		}
	}

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			
			for(int x = 0;x< 3;x++) {
				System.out.println("Enter Bank Name");
				Bank b = Demo.getBank(sc.next());
				Demo.findBank(b);
				
				System.out.println("****************************************");
			}
		}
		
	
	}

}
