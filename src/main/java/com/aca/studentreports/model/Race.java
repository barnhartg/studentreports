package com.aca.studentreports.model;

public enum Race {

	White("White"), 
	AfricanAmerican("African American"), 
	Asian("Asian"), 
	Hispanic("Hispanic"), 
	NativeAmerican("Native American"), 
	PacificIslander("Pacific Islander");
	
	private String race;
	
	private Race (String race) {
		this.race = race;
	}
	
	@Override
	public String toString() {
		return race;
	}
	
}
