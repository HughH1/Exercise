package com.qa.interfaces;

public class Worm extends Animal {
	private String wiggle;

	public Worm(String live, String wiggle) {
		super(live);
		this.wiggle = wiggle;
	}
	
	public void move() {
		System.out.println(this.wiggle);
	}


}
