package com.question3;

public class Main {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.model= "Tata-111";
		c.companyName="Tata";
		c.Color = "red";
		c.engine = "turbo";
		c.details();
		
		Engine e = new Engine();
		e.rmp = 10000;
		e.power = 110;
		e.manufacture = "Tata";
		e.hasTurbo= true;
	}
}
