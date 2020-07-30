package main;

import java.util.Date;

import common.ContactDetails;

public class Employee extends University {
	private String office;		// "Room 101"
	private double salary;		// 1200.00
	private String officeHours; // "9AM - 6PM"
	private Date dateHired; 
	private ContactDetails contactInfo;
	
	public void printOfficeHours() {
		System.out.println("Working hours: " + this.officeHours + "\n");
	}
	
}
