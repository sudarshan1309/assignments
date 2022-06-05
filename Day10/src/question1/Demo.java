package question1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		if(amount >1000) {
			TajHotel tajHotel = new TajHotel();
			return tajHotel;
		}
		else  {       //(amount>200 && amount <1000)
			RoadSideHotel roadSide = new RoadSideHotel();
			return roadSide;
		}
		
	}
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter Amount");
			int amt = scan.nextInt();
			
			if(amt>200) {  //checking if user entered more than 200 or not
						
						Demo d = new Demo();
						Hotel h = d.provideFood(amt);
						
						
						if(h instanceof TajHotel) {
							TajHotel h1 = ((TajHotel) h);
							h1.chickenBiryani();
					        h1.masalaDosa();
							h1.welcomeDrink();
						}
						if (h instanceof RoadSideHotel){
							RoadSideHotel h2 = (RoadSideHotel)h;
							h2.chickenBiryani();
							h2.masalaDosa();
						}
				
			}
			else {
				        System.out.println("Please Enter valid amount");
			}
		}
		
		
	}

}
