package question3;

public class OLA {

	public  Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
		HatchBack h = new HatchBack();
		   h.numberOfKms=numberOfKMs;
			return h;
			
		}
		else {
		
			Sedan s = new Sedan();
			s.numberOfKms=numberOfKMs;
			return s;
		}
	}
	
	
	public int calculateBill(Car car) {
		 
		if(car instanceof Sedan) {
			int total=	car.numberOfKms*((Sedan)car).farePerKm;
		return total;
		}
		else {
			int total = car.numberOfKms*((HatchBack)car).farePerKm;
			return total;
		}
		
	}
}
