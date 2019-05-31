import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoctorTest {

	@Test
	public void shouldBeAbleToGetDoctorNameJohn() {
		Doctor john = new Doctor("John", 0, null, 0);
		String expectedName = john.getName();
		assertEquals("John", expectedName);
		
	}
	@Test
	public void shouldBeAbleToGetDoctorNameFred() {
		Doctor fred = new Doctor("Fred", 0, null, 0);
	 	String expectedName = fred.getName();
		assertEquals("Fred", expectedName);
	}
	@Test
	public void shouldBeAbleToGetDoctorNumber23() {
		Doctor underTestDoctor = new Doctor("", 23, null, 0);
		int expectedEmployeeNumber = underTestDoctor.getEmployeeNumber();
		assertEquals(23, expectedEmployeeNumber);
	}
	@Test
	public void shouldBeAbleToGetDoctorNumber24() {
		Doctor underTestDoctor = new Doctor("", 24, null, 0);
		int expectedEmployeeNumber = underTestDoctor.getEmployeeNumber();
		assertEquals(24, expectedEmployeeNumber);
	}
	@Test
	public void shouldHaveDoctorSalaryOf900000() {
		Doctor underTestDoctor = new Doctor ("", 0, null, 90000);
		int expectedDoctorSalary = underTestDoctor. calculateEmployeeSalary();
		assertEquals(90000, expectedDoctorSalary);		
	}
	
	@Test
	public void shouldHaveDefaultSalaryPaymentAsFalse() {
		Doctor underTestDoctor = new Doctor ("", 0, null, 0);
		boolean expectedSalaryPayment = underTestDoctor.getSalaryPaid();
		assertEquals(false, expectedSalaryPayment);
		
	}
	@Test
	public void shouldBeAbleToPayDoctorAndChangeSalaryPaymentToTrue() {
		Doctor underTestDoctor = new Doctor ("", 0, null, 0);
		underTestDoctor.pay();
		boolean expectedSalaryPayment = underTestDoctor.getSalaryPaid();
		assertEquals(true, expectedSalaryPayment);
		
	}
	@Test
	public void doctorShouldHaveBrainSurgeonSpecialty() {
		Doctor brainSurgeon = new Doctor("", 0, "Brain Surgeon", 0);
		String expectedSpecialty = brainSurgeon.getSpecialty();
		assertEquals("Brain Surgeon", expectedSpecialty);
		
	}
	@Test
	public void doctorShouldHaveHeartSurgeonSpecialty() {
		Doctor heartSurgeon = new Doctor("", 0, "Heart Surgeon", 0);
		String expectedSpecialty = heartSurgeon.getSpecialty();
		assertEquals("Heart Surgeon", expectedSpecialty);
	}
	@Test
	public void shouldBeAbleToDrawBlood() {
		Doctor underTestDoctor = new Doctor("", 0, null, 0);
		Patient patient1= new Patient();
		underTestDoctor.drawBlood(patient1);
		int expectedBloodLevel= patient1.getBloodLevel();
		assertEquals (10, expectedBloodLevel);
	}   
	@Test
	public void shouldBeAbleToCareForPatients() {
		Doctor underTest = new Doctor ("", 0, null, 0);
		Patient patient2= new Patient();
		underTest.careForPatients(patient2);
		int expectedHealthLevel= patient2.getHealthLevel();
		assertEquals (15, expectedHealthLevel);
	}

	
}
