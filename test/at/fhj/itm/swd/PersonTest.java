package at.fhj.itm.swd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import at.fhj.itm.swd.Email;
import at.fhj.itm.swd.Person;

public class PersonTest
{
	private Person person;
	
	@Before
	public void setup()
	{
		person = new Person(1, "Homer", "Simpson");
	
		Email m1 = new Email(2, "homer.simpson@springfield.com");
		m1.setOwner(person);
		person.addEmail(m1);
		
		Email m2 = new Email(3, "homer.j.simpson@springfield.com");
		m2.setOwner(person);
		person.addEmail(m2);
	}

	
	@Test
	public void testPerson()
	{
		Assert.assertEquals(1, person.getId());
		Assert.assertEquals("Homer", person.getFirstName());
		Assert.assertEquals("Simpson", person.getLastName());
		Assert.assertEquals(
				"1,Homer,Simpson," +
				"[2,homer.simpson@springfield.com, " +
				"3,homer.j.simpson@springfield.com]", 
				person.toString());
		
		Assert.assertEquals(2, person.getEmails().size());
	}

	
	@Test
	public void testEmail1()
	{
		Email m = person.getEmails().get(0);
		
		Assert.assertEquals(2, m.getId());
		Assert.assertEquals("homer.simpson@springfield.com", m.getAddress());
		Assert.assertEquals("2,homer.simpson@springfield.com", m.toString());
		
		Assert.assertNotNull(m.getOwner());
		Assert.assertEquals(1, m.getOwner().getId());		
	}
	
	@Test
	public void testEmail2()
	{
		Email m = person.getEmails().get(1);
		
		Assert.assertEquals(3, m.getId());
		Assert.assertEquals("homer.j.simpson@springfield.com", m.getAddress());
		Assert.assertEquals("3,homer.j.simpson@springfield.com", m.toString());
		
		Assert.assertNotNull(m.getOwner());
		Assert.assertEquals(1, m.getOwner().getId());
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testPerson_IdIsNegative()
	{
		new Person(-1, "Homer", "Simpson");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPerson_FirstNameIsNull()
	{
		new Person(1, null, "Simpson");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPerson_LastNameIsNull()
	{
		new Person(1, "Homer", null);
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void testEmail_IdIsNegative()
	{
		new Email(-1, "homer.j.simpson@springfield.com");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEmail_AddressIsNull()
	{
		new Email(1, null);
	}
}
