package at.fhj.itm.swd;

import java.util.ArrayList;
import java.util.List;

public class Person
	extends Entity
{
	public Person(long id, String firstName, String lastName)
	{
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
	}
		
	
	/*
	 * Property: firstName
	 */
	private String firstName;
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		if(firstName == null)
			throw new IllegalArgumentException();
		this.firstName = firstName;
	}
	
	
	
	/*
	 * Property: lastName
	 */
	private String lastName;
	private List<Email> emails = new ArrayList<Email>();
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		if(lastName == null)
			throw new IllegalArgumentException();
		this.lastName = lastName;
	}
	
	
	
	/*
	 * Object methods
	 */
	
	@Override
	public String toString()
	{
		return getId() + "," + getFirstName() + "," + getLastName() + "," + getEmails();
	}
	
	public void addEmail(Email m) {
		this.emails.add(m);
	}

	public List<Email> getEmails() {
		return this.emails;
	}

}
