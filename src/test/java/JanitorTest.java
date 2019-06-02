import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest {
	
	@Test
	public void shouldBeAbleToGetJanitor() {
		Janitor underTestJanitor = new Janitor("", 0);
	}
	@Test
	public void shouldBeAbleToGetJanitorNameMatt() {
		Janitor underTestJanitor = new Janitor("Matt", 0);
		String expectedName = underTestJanitor.getName();
		assertEquals("Matt", expectedName);
		
	}
	@Test
	public void shouldBeAbleToGetJanitorNameLawrence() {
		Janitor underTestJanitor = new Janitor("Lawrence", 0);
		String expectedName = underTestJanitor.getName();
		assertEquals("Lawrence", expectedName);		
	}
	@Test
	public void shouldBeAbleToGetJanitorSalaryOf40000() {
		Janitor underTestJanitor = new Janitor("", 40000);
		int expectedSalary = underTestJanitor.getPaySalary();
		assertEquals(40000, expectedSalary);
	}
	@Test
	public void shouldHaveDefaultJanitorSweepAsFalse() {
		Janitor underTestJanitor = new Janitor("", 0);
		boolean expectedIsSweeping = underTestJanitor.getIsSweeping();
		assertEquals(false, expectedIsSweeping);
	}
	@Test
	public void shouldBeAbleToMakeJanitorSweepWhichWouldMakeIsSweepingTrue() {
		Janitor underTestJanitor = new Janitor("", 0);
		underTestJanitor.sweep();
		boolean expectedIsSweeping = underTestJanitor.getIsSweeping();
		assertEquals(true, expectedIsSweeping);
	}
	@Test
	public void shouldHaveJanitorStatusOfIsPaidAsFalse() {
		Janitor underTestJanitor = new Janitor("", 0);
		boolean expectedHasBeenPaid = underTestJanitor.getHasBeenPaid();		
		assertEquals(false, expectedHasBeenPaid);

	}
	@Test
	public void shouldHaveHasBeenPaidAsTrueAfterPay() {
		Janitor underTestJanitor = new Janitor("", 0);
		underTestJanitor.pay();
		boolean expectedHasBeenPaid = underTestJanitor.getHasBeenPaid();
		assertEquals(true, expectedHasBeenPaid);
	}
	@Test
	public void janitorShouldHaveEmployeeNumber23() {
		Janitor underTestJanitor = new Janitor("", 23);
		int expectedEmployeeNumber = underTestJanitor.getEmployeeNumber();
		assertEquals(23, expectedEmployeeNumber);
		
	}

}