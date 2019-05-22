package com.qa.exercies;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		Numbers number = new Numbers();

		// number.input();
		// System.out.println("test");
		// int num1 = number.input();
		// String num = String.valueOf(num1);
		Boolean run = true;
		int num;

		System.out.println("Input a 2 digit number:");
		while (run) {
			num = number.input();
			if (num > 9 && num < 100) {

				String theNum = Integer.toString(num);
				String[] splitter = theNum.split("");
				String split1 = splitter[0];
				String split2 = splitter[1];

				int firstNum = Integer.parseInt(split1);
				int secondNum = Integer.parseInt(split2);
				System.out.println(firstNum + secondNum);
				
			} else {
				System.out.println("Please enter a number between 10 and 99");
			}

		}

		// System.out.println(num);

	}

	public int input() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}

}
