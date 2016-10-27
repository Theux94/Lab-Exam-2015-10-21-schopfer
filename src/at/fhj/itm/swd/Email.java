package at.fhj.itm.swd;

public class Email extends Entity


{
	private String address;
	private Person owner;
	
	/*
	 * Constructor
	 */
	public Email(long id, String address) {
		setId(id);
		if (address == null) {
			throw new IllegalArgumentException();
		} else {
			setAddress(address);
		}
	}
	
	
	
	/*
	 * Object methods
	 */
	
	private void setAddress(String address) {
		this.address=address;
		
	}
	
	public String getAddress() {
	
		return this.address;
	}




	@Override
	public String toString()
	{
		return getId() + "," + getAddress();
	}



	public void setOwner(Person person) {
		this.owner = person;
		
	}
	
	public Person getOwner() {
		return this.owner;
		
	}





}
