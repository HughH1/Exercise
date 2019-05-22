package com.qa.exercies;

import java.util.ArrayList;
import java.util.Scanner;

public class Inputs {

	
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		boolean run = true;
		String myInput = "";
		
		Inputs theInput = new Inputs();
		theInput.input();
		
		while (run) {
			System.out.println("What would you like to do: 'add', 'show', 'delete', 'exit'");
			switch (theInput.input()) {
			case "show":
				System.out.println("List items are: " + myList);
				break;
			case "add":
				System.out.println("What would you like to add?");
				myInput = theInput.input();
				myList.add(myInput);
				System.out.println("'" + myInput + "'" + " was added");
				break;
			// System.out.println("What would you like to do: 'add', 'show', 'delete'");
			case "delete":
				System.out.println("Type item that you wish to delete");
				myList.remove(theInput.input());
				System.out.println("'" + theInput.input() + "'" + " was deleted");
				break;
			case "exit":
				System.out.println("Application closed");
				run = false;
				break;
			default:
				break;
			}
		}

	}

	public String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
}
