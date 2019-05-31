import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest {

	@Test
		public void shouldHaveJanitorSalaryOf40000() {
		Janitor underTestJanitor = new Janitor();
		int expectedJanitorSalary = underTestJanitor.calculateEmployeeSalary();
 		assertEquals(40000, expectedJanitorSalary);
	}
	@Test
		public void shouldHaveDefaultSweepingAsFalse() {
		Janitor underTestJanitor = new Janitor();
		boolean expectedSweeping = underTestJanitor.getSweeping();	
		assertEquals(false, expectedSweeping);
			
	}
	@Test
		public void shouldReturnSweepingAsTrueIfJanitorSweeps() {
		Janitor underTestJanitor = new Janitor();
		underTestJanitor.sweeping();
		boolean expectedSweeping = underTestJanitor.getSweeping();	
		assertEquals(true, expectedSweeping);

	}
}
