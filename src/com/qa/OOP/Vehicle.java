package com.qa.OOP;

public abstract class Vehicle {
	private int wheels;
	private int seatNum;
	private String name;
	
	public Vehicle(int wheels, int seatNum, String name) {
		this.wheels = wheels;
		this.seatNum = seatNum;
		this.name = name;
	}
	
	public abstract void steer();
	
	public abstract void type();
	
//	public abstract void printer();
	
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
