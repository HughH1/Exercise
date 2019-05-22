package com.qa.OOP;

public class Car extends Vehicle {
	private int doors;

	public Car(int wheels, int seatNum, String name, int doors) {
		super(wheels, seatNum, name);
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void type() {
	}

	public void steer() {
		System.out.println("Yeet");
	}

//	@Override
//	public void printer() {
//		// TODO Auto-generated method stub
//		
//	}

}
