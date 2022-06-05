package com.question3;

public class Engine {

	
	int rmp;
	int power;
	String manufacture;
	Boolean hasTurbo;
	
	void engines() {
		Engine eng = new Engine();
		System.out.println("Car RPM : "+rmp);
		System.out.println("Car power : "+power);
		System.out.println("Car manufacture : "+manufacture);
		System.out.println("Car hasTurbo : "+hasTurbo);
	}
}
