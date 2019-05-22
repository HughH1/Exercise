package com.qa.interfaces;

public class Bee extends Animal implements See, Fly{
	String noise;
	
	public Bee(String live, String noise) {
		super(live);
		this.noise = noise;
		
	}

	@Override
	public void flap() {
		System.out.println("Flap flap");
		
	}
	
	
	@Override
	public void sight() {
		System.out.println("UV sight");
		
	}

	@Override
	public void eyes() {
		System.out.println("Tiny eyes!");
		
	}

	public void sound() {
		System.out.println(this.noise);
	}
	
	
	
	
	
}
