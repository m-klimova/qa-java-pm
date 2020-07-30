package main;

import common.ContactDetails;
import interfaces.Person;

abstract class University implements Person {
	private String faculty;
	
	public ContactDetails setContactDetails(String name, String emailAddress, String phoneNumber) {
		ContactDetails contactDetails = new ContactDetails(name, emailAddress, phoneNumber);
		return contactDetails;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
}
