package com.qa.itteration;

public class FirstIteration {

	public static void main(String[] args) {
		// int i = 0;
		// for (; i < 5; i++) {
		// System.out.println(i);
		// }
		// System.out.println(i);
		for (int i = 0; i < 9; i++) {
			if (i == 2) {
				continue;
			} else if (i == 7) {
				break;
			} else {
		 		System.out.println(i);
			}
		}
		
	}
}
