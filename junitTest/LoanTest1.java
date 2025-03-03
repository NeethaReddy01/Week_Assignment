package junitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoanTest1 {

	@Test
	void testGetEmi() {
		//fail("Not yet implemented");
		Loan l=new Loan();
		int actual = l.getEmi(60000);
		assertEquals(5000,actual);
	}
	@Test
	void testSum() {
		Loan l=new Loan();
		assertEquals(7,l.sum(3, 4));
	}

}
