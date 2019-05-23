package com.qa.exercies;

public enum Day {

	MONDAY("Bad"), TUESDAY("Meh"), WEDNESDAY("Dead"), THURSDAY("Ok"), FRIDAY("Pleased");

	private String feeling;

	Day(String feeling) {
		this.feeling = feeling;
	}
	
	public String getFeeling() {
		return feeling;
	}
}
