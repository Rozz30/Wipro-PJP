import static org.junit.Assert.*;

import org.junit.Test;

public class RDAccountTest {

RDAccount rdAccount = new RDAccount();
	
	@Test
	public void testSetInterestRate() {
		rdAccount.setInterestRate(5);
		assertEquals(5, rdAccount.getInterestRate(), 0);
	}

	@Test
	public void testSetAmount() {
		rdAccount.setMonthlyAmount(10000.0);
		assertEquals(10000.0, rdAccount.getMonthlyAmount(), 0.0);
	}

	@Test
	public void testSetMonthlyAmount() {
		rdAccount.setMonthlyAmount(500);
		assertEquals(500, rdAccount.getMonthlyAmount(), 0);
	}
	
	@Test
	public void testSetAgeOfACHolder() {
		rdAccount.setAge(65);
		assertEquals(65, rdAccount.getAge());
	}
	
	@Test
	public void testCalculateInterest() {
		rdAccount.setMonthlyAmount(10000.0);
		rdAccount.setNoOfMonths(6);
		rdAccount.setAge(65);
		assertEquals(9600, rdAccount.calculateInterest(),0.0);
	}


}
