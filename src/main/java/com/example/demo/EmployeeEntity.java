package com.example.demo;

public class EmployeeEntity {

	private String name;

	private String place;

	public EmployeeEntity() {

	}

	public EmployeeEntity(String name, String place) {
		super();
		this.name = name;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
}
