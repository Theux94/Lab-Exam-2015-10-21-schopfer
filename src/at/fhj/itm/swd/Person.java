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
}
