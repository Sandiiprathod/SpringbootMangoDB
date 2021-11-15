package com.nosql.mongodbapp.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Department {

	@Field(name = "dept_name")
	private String departmentName;
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", location=" + location + "]";
	}

}
