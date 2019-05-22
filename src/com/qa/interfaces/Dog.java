package com.qa.interfaces;

public class Dog extends Animal implements See {

	public Dog(String live) {
		super(live);
	}
	

	public void bork() {
		System.out.println("Bork");
	}
	
	
	@Override
	public void sight() {
		System.out.println("Black and white");
	}

	@Override
	public void eyes() {
		System.out.println("Puppy eyes");

	}
}
