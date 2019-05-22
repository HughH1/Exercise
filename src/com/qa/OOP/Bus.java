package com.qa.OOP;

public class Bus extends Vehicle{
	private boolean stairs;

	public Bus(int wheels, int seatNum, String name, boolean stairs) {
		super(wheels, seatNum, name);
		this.stairs = stairs;
	}

	public boolean isStairs() {
		return stairs;
	}

	public void setStairs(boolean stairs) {
		this.stairs = stairs;
	}


	public void type() {
	}
	
	public void steer() {
				System.out.println("Spin spin");
	}
	
	
}
