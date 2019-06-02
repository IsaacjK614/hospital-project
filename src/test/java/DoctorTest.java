import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoctorTest {
	
	@Test
	public void shouldBeAbleToCreateDoctor() {
		Employee underTest = new Doctor("", 0, null);	
	}
	
	@Test
	public void shouldBeAbleToGetDoctorNameMatt() {
		Employee underTest= new Doctor("Matt", 0, null);
		String expectedName = underTest.getName();
		assertEquals("Matt", expectedName);
		
	}
	@Test
	public void shouldBeAbleToGetJanitorNameLawrence() {
		Employee underTest = new Doctor("Lawrence", 0, null);
		String expectedName = underTest.getName();
		assertEquals("Lawrence", expectedName);		
	}
	@Test
	public void shouldBeAbleToGetDoctorSalaryOf90000() {
		Employee underTest = new Doctor("", 0, null);
		int expectedSalary = underTest.getPaySalary();
		assertEquals(90000, expectedSalary);
	}
	@Test
	public void shouldHaveDoctorStatusOfIsPaidAsFalse() {
		Employee underTest = new Doctor("", 0, null);
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();		
		assertEquals(false, expectedHasBeenPaid);

	}
	@Test
	public void shouldHaveHasBeenPaidAsTrueAfterPay() {
		Employee underTest = new Doctor("", 0, null);
		underTest.pay();
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();
		assertEquals(true, expectedHasBeenPaid);
	}
	@Test
	public void DoctorShouldHaveEmployeeNumber23() {
		SkillEmployees underTest = new Doctor("", 23, null);
		int expectedEmployeeNumber = underTest.getEmployeeNumber();
		assertEquals(23, expectedEmployeeNumber);
	}
	@Test
	public void doctorShouldHaveBrainSurgeonSpecialty() {
		Doctor underTest = new Doctor("", 0, "Brain Surgeon");
		String expectedSpecialty = underTest.getSpecialty();
		assertEquals("Brain Surgeon", expectedSpecialty);
		
	}
	@Test
	public void doctorShouldHaveHeartSurgeonSpecialty() {
		Doctor underTest = new Doctor("", 0, "Heart Surgeon");
		String expectedSpecialty = underTest.getSpecialty();
		assertEquals("Heart Surgeon", expectedSpecialty);
	}
	@Test
	public void shouldBeAbleToDrawBlood() {
		SkillEmployees underTest = new Doctor("", 0, null);
		Patient patient = new Patient("", 0, 0);
		underTest.drawBlood(patient);
		int expectedBloodLevel= patient.getBloodLevel();
		assertEquals (-5, expectedBloodLevel);
}
	@Test
	public void shouldBeAbleToCareForPatients() {
		SkillEmployees underTest = new Doctor("", 0, null);
		Patient patient = new Patient("", 0, 0);
		underTest.care(patient);
		int expectedHealthLevel= patient.getHealthLevel();
		assertEquals (-5, expectedHealthLevel);
	}
	
	
	
}
