package com.qa.exercies;

import java.util.ArrayList;

public class ObjectInstances {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Task>> myList = new ArrayList<>();
		
		Task myTask = new Task("Eggs","Cow", 1);
		
		System.out.println(myTask.item + " " + myTask.where + " "+ myTask.daysLeft);
	}
}
