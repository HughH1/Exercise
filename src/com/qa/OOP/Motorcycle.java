package com.qa.OOP;

public class Motorcycle extends Vehicle {
	private String type;
	

	public Motorcycle(int wheels, int seatNum, String name, String type) {
		super(wheels, seatNum, name);
		this.type = type;
		
	}
	
	
//	public void printer() {
//		System.out.println(getWheels(), getClass());
//	}
	
	
	
	public void steer() {
		System.out.print("Steering method for motorcycles' is: ");
		System.out.println("Leen");
		System.out.println("------------------------------");
		System.out.println("");
		
	}
	public void type() {
		String s = this.type;
		System.out.print("Motor bike type is: ");
		System.out.println(s);
		System.out.println("------------------------------");
		System.out.println("");
	}

	
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
