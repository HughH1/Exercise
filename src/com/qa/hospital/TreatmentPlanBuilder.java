package com.qa.hospital;

public class TreatmentPlanBuilder {

	private String meds = "";
	private int dose;
	private String exerices;
	private int frequency;
	
	TreatmentPlanBuilder() {}
	
	public TreatmentPlanBuilder setMed(String meds, int dose, String exerices, int frequency) {
		this.meds = meds;
		this.dose = dose;
		this.exerices = exerices;
		this.frequency = frequency;  
		return this;
		
		
	}
	
	}
