package com.qa.exercies;

import java.util.Optional;

public class New {

	public static void main(String[] args) {

		String s = null;
		String name = Optional.ofNullable(s).orElse("no value");

		System.out.println(name);

		String x = null;
		Optional<String> myOptional = Optional.ofNullable(x);
		System.out.println(myOptional.orElse("Oh no"));
		System.out.println(myOptional.isPresent());
	}

}
