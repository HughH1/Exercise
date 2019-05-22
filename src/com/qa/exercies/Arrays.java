package com.qa.exercies;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3 };

		System.out.println(x[2]);
		System.out.println("----------");

		for (int i = 0; i < 3; i++) {
			System.out.println(x[i]);
		}

		int[][] y = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("----------");
		System.out.println(y[2][1]);
		System.out.println(y);

		for(int[] row: y) {
			for(int cell: row) {
				System.out.println(cell);
			}
		}
		System.out.println("----------");
		
		ArrayList<String> sList = new ArrayList<>();
		sList.add("cheese");
		sList.add("trams");
		sList.add("dogs");
		
		sList.remove(1);
		
		
		System.out.println(sList.get(1));
		
		
		
	}
}
