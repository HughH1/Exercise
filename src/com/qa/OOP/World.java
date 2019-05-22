package com.qa.OOP;

import java.util.ArrayList;

public class World {

	public static void main(String[] args) {

		Animal ani = new Fish(4, 2);
		Fish fishy = (Fish) ani;

		Animal ani2 = new Cat(1, "Healthy", "Bob");
		Cat cat = (Cat) ani2;
		
		Animal ani3 = new Cat(1, "Shabby");
		Cat cat2 = (Cat) ani3;
		
		
		Animal mky = new Monkey(1);
		Monkey baboon = (Monkey) mky;
		System.out.println("Age:");
		System.out.println(fishy.getAge());
		System.out.println("------");
		System.out.println("Eat: ");
		fishy.consume();
		System.out.println("------");
		System.out.println("Breathe:");
		fishy.respire();
		System.out.println("------");
		fishy.die();
		System.out.println("------");
		System.out.println(cat.getLook());
		System.out.println("------");
		System.out.println(cat.getAge());
		System.out.println(cat.getLook());
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(fishy);
		list.add(baboon);
		

	}

}
