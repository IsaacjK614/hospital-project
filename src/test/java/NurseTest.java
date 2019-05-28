import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {

	@Test
	public void shouldHaveNurseSalaryOf50000() {
		Nurse underTestNurse = new Nurse(0);
		int expectedNurseSalary = underTestNurse.getNurseSalary();
		assertEquals(50000, expectedNurseSalary);
		
	}
	@Test
	public void shouldHave2PatientsNurseTakesCareOf() {
		Nurse underTestNurse = new Nurse(2);
		int expectedPatientsUnderCare = underTestNurse.getPatientsUnderCare();
		assertEquals(2, expectedPatientsUnderCare);
	}
	@Test
	public void shouldHave3PatientsNurseTakesCareOf() {
		Nurse underTestNurse = new Nurse(3);
		int expectedPatientsUnderCare = underTestNurse.getPatientsUnderCare();
		assertEquals(3, expectedPatientsUnderCare);
		
	}
	@Test
	public void shouldBeAbleToDrawBlood() {
		Nurse underTestNurse = new Nurse(0);
		underTestNurse.drawBlood();
	}
	@Test
	public void shouldBeAbleToCareForPatients() {
		Nurse underTestNurse = new Nurse(0);
		underTestNurse.careForPatients();
	}
}
