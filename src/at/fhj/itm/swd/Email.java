package at.fhj.itm.swd;

public class Email
	extends Entity
{
	/*
	 * Constructor
	 */
	public Email(long id, String address)
	{
		setId(id);
		setAddress(address);
	}
	
		
	
	
	/*
	 * Object methods
	 */
	
	@Override
	public String toString()
	{
		return getId() + "," + getAddress();
	}
}
