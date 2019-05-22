package com.qa.OOP;

public class Cat extends Animal {
	private String look;
	private String name;
	
	public Cat(int age, String look, String name) {
		super(age);
		this.look = look;
		this.name = name;
	}
	
	public Cat(int age, String look) {
		super(age);
		this.look = look;
		System.out.println("Is a stray");
	}

	public String getLook() {
		return look;
	}

	public void setLook(String look) {
		this.look = look;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
