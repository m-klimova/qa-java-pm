package interfaces;

import common.ContactDetails;

public interface Person {
	public ContactDetails setContactDetails(String name, 
			String emailAddress, 
			String phoneNumber);
}
