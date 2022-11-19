package com.aca.studentreports.model;

public enum Race {

	WHITE("White"), 
	AFRICANAMERICAN("African American"), 
	ASIAN("Asian"), 
	HISPANIC("Hispanic"), 
	NATIVEAMERICAN("Native American"), 
	PACIFICISLANDER("Pacific Islander");
	
	private String studentRace;
	
	private Race (String race) {
		this.studentRace = race;
	}
	
	@Override
	public String toString() {
		return studentRace;
	}
	
}
