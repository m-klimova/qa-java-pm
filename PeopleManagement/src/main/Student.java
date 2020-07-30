package main;

import java.util.HashMap;

import common.ContactDetails;

public class Student extends University {
	// key/value pairs: key: String, value: Double
	private HashMap<String, Double> courses = new HashMap<String, Double>();
	private String facultyNumber;
	private ContactDetails contactInfo;
	
	public Student(String name, 
			String eAddress, 
			String phoneNumber, 
			String facultyNumber, 
			String faculty,
			HashMap<String, Double> courses) {
		this.facultyNumber = facultyNumber;
		this.courses = courses;
		this.setFaculty(faculty);
		this.contactInfo = super.setContactDetails(name, eAddress, phoneNumber);
	}
	
	public Double calculateAvgGrade() {
		// This method should return double value after calculation
		Double sum = 0.0;
		for(Double grade : this.courses.values()) {
			sum += grade;
		}
		return sum / this.courses.size();
	}
	
	public String getFacultyNumber() {
		return facultyNumber;
	}
	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}
	public HashMap<String, Double> getCourses() {
		return courses;
	}
	public void setCourses(HashMap<String, Double> courses) {
		this.courses = courses;
	}

	public ContactDetails getContactInfo() {
		return contactInfo;
	}
	
}
