package com.qa.OOP;

import java.util.ArrayList;

public class Garage {
	public static void main(String[] args) {
		Vehicle vec = new Motorcycle(2, 2, "Ninja", "Super sport");
		
		Vehicle bike = new Motorcycle(2, 1, "turbo bike", "Super sport");
		
		Vehicle car = new Car(4, 5, "Ford", 5);
		
		Vehicle car2 = new Car(4, 7, "frgdg", 3);
//		System.out.println("Car door number is: " + car.getDoors());
		
		Vehicle bike3 = new Motorcycle(2, 2, "Yeet master 69", "Turbo Yeet");
		Vehicle bus = new Bus(6, 50, "Big Boi", true);
		
		ArrayList<Vehicle> list = new ArrayList<>();
				
		bike.type();
		car.type();
		bus.type();
		bike3.type();
		
		list.add(bus);
		list.add(bike);  
		list.add(car);
//		bus.steer();
//		bike.steer();
//		car.steer();
		
//		bike.printer();
		
		
		// System.out.println("doors "+car2.getDoors());

		// System.out.println(biker.getName() +" : "+ biker.getType());

	}
	
	public float bill() {
				
		return 0;
		
	}
	
	
	
	

	// public double bill()

}
