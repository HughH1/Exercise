package com.qa.hospital;

public class TreatmentPlan {
	private String meds = "";
	private int dose;
	private String exerices;
	private int frequency;

	public TreatmentPlan(String meds, int dose, String exerices, int frequency) {
		this.meds = meds;
		this.dose = dose;
		this.exerices = exerices;
		this.frequency = frequency;
	}

}
