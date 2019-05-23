package com.qa.hospital;

public class TreatmentPlanBuilder {

	private String meds = "";
	private int dose;
	private String exerices;
	private int frequency;

	TreatmentPlanBuilder() {
	}

	// public TreatmentPlanBuilder setMed(String meds, int dose, String exerices,
	// int frequency) {
	// this.meds = meds;
	// this.dose = dose;
	// this.exerices = exerices;
	// this.frequency = frequency;
	// }

	public TreatmentPlanBuilder setMeds(String meds) {
		this.meds = meds;
		return this;
	}

	public TreatmentPlanBuilder setExerices(String exerices) {
		this.exerices = exerices;
		return this;
	}

	public TreatmentPlanBuilder setFrequency(int frequency) {
		this.frequency = frequency;
		return this;
	}

	public TreatmentPlanBuilder setDose(int dose) {
		this.dose = dose;
		return this;
	}

	public TreatmentPlan build() {
		return new TreatmentPlan(exerices, dose, exerices, dose);
	}

}
