package common;

public class ContactDetails {
	// Instance variables
	private String name;
	private String emailAddress;
	private String phoneNumber;
	
	// parametrised constructor
	public ContactDetails(String name, String emailAddress, String phoneNumber) {
		// All in left of = are instance variables
		this.setName(name);
		this.setEmailAddress(emailAddress);
		this.setPhoneNumber(phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
