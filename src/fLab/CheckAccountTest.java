package fLab;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckAccountTest {

	@Test
	public void testAddAccount() {
		CheckingAcount test = new CheckingAcount();
		Account result = test.selectAccount(12);
		assertEquals(12, result);
		//fail("Not yet implemented");
	}

}
