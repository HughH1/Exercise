package com.qa.OOP;

public class Animal {
	private int age;

	public Animal(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void die() {
		System.out.println("Oof");
	}

	public void consume() {
		System.out.println("Nom nom");
	}

	public void respire() {
		System.out.println("*inhale*");
	}

}
