package com.qa.exercies;

import com.qa.OOP.Animal;

public class Cage<T extends Animal  > {
	private T item;

	public static void main(String[] args) {
				
		Cage<Animal> myCage = new Cage<>();
//		myCage.setMyList(2);
		
		System.out.println();

	}

	public T getItem() {
		return item;
	}

	public void setMyList(T item) {
		this.item = item;
	}

}
