package com.qa.exercies;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

	public static void main(String[] args) {
		int x = ThreadLocalRandom.current().nextInt(30, 40);
		System.out.println(x);
	}
}
