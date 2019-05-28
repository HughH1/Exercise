package com.qa.exercies;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

	public static void main(String[] args) {
		int x = ThreadLocalRandom.current().nextInt(10, 40);
		double y = ThreadLocalRandom.current().nextDouble(10.1, 40.3);
		System.out.println(y);
	}
}