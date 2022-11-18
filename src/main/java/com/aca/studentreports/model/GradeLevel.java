package com.aca.studentreports.model;

public enum GradeLevel {

	Sixth("6th"), Seventh("7th"), Eighth("8th");
	
	private String gradeLevel;

	private GradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	@Override
	public String toString() {
		return gradeLevel;
	}

}
