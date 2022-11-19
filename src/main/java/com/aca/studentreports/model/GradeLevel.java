package com.aca.studentreports.model;

public enum GradeLevel {

	SIXTH("6th"), SEVENTH("7th"), EIGHTH("8th");
	
	private String grade;

	private GradeLevel(String gradeLevel) {
		this.grade = gradeLevel;
	}

	@Override
	public String toString() {
		return grade;
	}

}
