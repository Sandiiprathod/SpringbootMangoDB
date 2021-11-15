package com.nosql.mongodbapp.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Subject {

	@Field(name = "subject_name")
	private String subjectName;
	@Field(name = "marks_obtained")
	private Long marksObtained;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectNmae) {
		this.subjectName = subjectNmae;
	}

	public Long getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(Long marksObtained) {
		this.marksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "Subject [subjectNmae=" + subjectName + ", marksObtained=" + marksObtained + "]";
	}

}
