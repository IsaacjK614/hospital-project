import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {
	
	@Test
	public void nurseShouldHaveDefaultSalaryOf50000() {
		Nurse underTest = new Nurse("", 0);
		int expectedSalary = underTest.getPaySalary();
		assertEquals(50000, expectedSalary);
	}
	@Test
	public void nurseShouldHaveFivePatientsUnderCare() {
		Nurse underTest = new Nurse("", 0);
		int expectedPatientsUnderCare = underTest.getPatientsUnderCare();
		assertEquals(5, expectedPatientsUnderCare);
	}
	
}
	
	

