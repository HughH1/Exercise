package com.qa.exercies;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		ArrayList<BankAccount> accounts = new ArrayList<>();

		Boolean run = true;
		
		Bank bank = new Bank();

		while (run) {
			System.out.println("What would you like to do: 'add' adds bank account, 'show', 'delete', 'exit'");
			switch (bank.input()) {
			case "show":
				System.out.println("Please enter your name");
				for (BankAccount account : accounts) {
					if (account.name.equals(bank.input())) {
						System.out.println("£"+ account.balance);
					}
				}

				System.out.println();
				break;
			case "add":
				System.out.println("Enter your name then balance");
				accounts.add(new BankAccount(bank.input(), bank.input2()));
				System.out.println("Account created");
				break; 
			// System.out.println("What would you like to do: 'add', 'show', 'delete'");
			case "delete":
				System.out.println("Please enter your name");
				String myInput = bank.input();
				for (BankAccount account : accounts) {
					System.out.println(account.name);
					if (account.name.equals(myInput)) {
						System.out.println("Account " + myInput + " deleted");
						accounts.remove(account);
						break;
					}
				}
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

	public Float input2() {
		Scanner s = new Scanner(System.in);
		Float input = s.nextFloat();
		return input;
	}
}
