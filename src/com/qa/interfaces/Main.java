package com.qa.interfaces;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("live");
		
		Bee bee = new Bee("live","buzz");
		
		  
		
		dog.sight();
		bee.sound();
		bee.flap();
	
		ArrayList<See> sighted = new ArrayList<>();
		
		sighted.add(dog);
		sighted.add(bee);
		
		
	}
}
