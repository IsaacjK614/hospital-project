import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {

	@Test
	public void shouldHaveNurseSalaryOf50000() {
		Nurse underTestNurse = new Nurse("name", 1, 2);
		int expectedNurseSalary = underTestNurse. calculateEmployeeSalary();
		assertEquals(50000, expectedNurseSalary);
		
	}
	@Test
	public void shouldHave2PatientsNurseTakesCareOf() {
		Nurse underTestNurse = new Nurse("name", 1, 2);
		int expectedPatientsUnderCare = underTestNurse.getPatientsUnderCare();
		assertEquals(2, expectedPatientsUnderCare);
	
	}
	@Test
	public void shouldHave3PatientsNurseTakesCareOf() {
		Nurse underTestNurse = new Nurse("name", 1, 3);
		int expectedPatientsUnderCare = underTestNurse.getPatientsUnderCare();
		assertEquals(3, expectedPatientsUnderCare);
		
	}
	@Test
	public void shouldBeAbleToDrawBlood() {
		Nurse underTestNurse = new Nurse("name", 1, 2);
		Patient patient1= new Patient();
		underTestNurse.drawBlood(patient1);
		int expectedBloodLevel= patient1.getBloodLevel();
		assertEquals (10, expectedBloodLevel);
	
	}
	@Test
	public void shouldBeAbleToCareForPatients() {
		Nurse underTest = new Nurse("name", 1, 3);
		Patient patient2= new Patient();
		underTest.careForPatient(patient2);
		int expectedHealthLevel= patient2.getHealthLevel();
		assertEquals (13, expectedHealthLevel);
		
	}
	@Test
	public void shouldBeAbleToGiveMedication() {
		Nurse underTest = new Nurse("", 1, 3);
		Patient patient3= new Patient();
		underTest.giveMedication(patient3);
		int expectedHealthLevel= patient3.getHealthLevel();
		assertEquals (13, expectedHealthLevel);
		
	}
}
