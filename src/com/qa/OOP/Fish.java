package com.qa.OOP;

public class Fish extends Animal {



	private int fins;

	public Fish(int fins, int age) {
		super(age);
		this.fins = fins;
	}

	public int getFins() {
		return fins;
	}

	public void swim() {
		System.out.println("Splash");
	}

}
