package com.qa.exercies;

public class Tax {

	public static void main(String[] args) {
		Tax tax = new Tax();
		/*
		 * Create the tax class, it contains 2 methods. a. Method 1 - which takes a
		 * salary and works out the percentage by which the salary will be taxed. b.
		 * Method 2 - which works out the exact amount that the user will be taxed using
		 * a similar process to that in the first method. This amount should be returned
		 * and output to the console. These 2 methods should be able to work
		 * independently so it is ok if some of the code is repeated.
		 * 
		 */

		System.out.println(tax.myNet(21000.0f));

	}

	public float myNet(float gross) {
		char myBand = taxBracket((int) gross);
		float theNet = taxPer((int) gross, myBand);
		return theNet;
	}

	public char taxBracket(int gross) {
		char band1 = 'a';
		char band2 = 'b';
		char band3 = 'c';
		char band4 = 'd';

		if (gross < 15000) {
			return band1;
		} else if (gross < 20000) {
			return band2;
		} else if (gross < 30000) {
			return band3;
		} else if (gross >= 45000) {
			return band4;
		}
		return 'e';
	}

	public float taxPer(int gross, char band) {
		float net = 0.0f;
		float tax = 0.0f;
		switch (band) {
		case 'a':
			return gross;
		case 'b':
			tax = (gross - 15000) / 10;
			return net = gross - tax;

		case 'c':
			tax = (gross - 15000) / 10;
			tax += (gross - 20000) *15/100;
			return net = gross - tax;
		case 'd':
			tax = (gross - 15000) / 20;
			tax += (gross - 20000) / 15;
			tax += (gross - 15000) / 10;
			return net = gross - tax;
		case 'e':
			tax = (gross - 45000) / 25;
			tax += (gross - 30000) / 20;
			tax += (gross - 20000) / 15;
			tax += (gross - 15000) / 10;
			return net = gross - tax;
		}

		return 0.0f;
	}

}
