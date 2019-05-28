import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoctorTest {

	@Test
	public void shouldBeAbleToCreateDoctor() {
		Doctor underTestDoctor = new Doctor("", 0, null);
		
	}
	@Test
	public void shouldBeAbleToGetDoctorNameJohn() {
		Doctor john = new Doctor("John", 0, null);
		String expectedName = john.getName();
		assertEquals("John", expectedName);
		
	}
	@Test
	public void shouldBeAbleToGetDoctorNameFred() {
		Doctor fred = new Doctor("Fred", 0, null);
		String expectedName = fred.getName();
		assertEquals("Fred", expectedName);
	}
	@Test
	public void shouldBeAbleToGetDoctorNumber23() {
		Doctor underTestDoctor = new Doctor("", 23, null);
		int expectedEmployeeNumber = underTestDoctor.getEmployeeNumber();
		assertEquals(23, expectedEmployeeNumber);
	}
	@Test
	public void shouldBeAbleToGetDoctorNumber24() {
		Doctor underTestDoctor = new Doctor("", 24, null);
		int expectedEmployeeNumber = underTestDoctor.getEmployeeNumber();
		assertEquals(24, expectedEmployeeNumber);
	}
	@Test
	public void shouldHaveDoctorSalaryOf900000() {
		Doctor underTestDoctor = new Doctor ("", 0, null);
		int expectedDoctorSalary = underTestDoctor. getDoctorSalary();
		assertEquals(900000, expectedDoctorSalary);		
	}
	@Test
	public void shouldHaveDefaultSalaryPaymentAsFalse() {
		Doctor underTestDoctor = new Doctor ("", 0, null);
		boolean expectedSalaryPayment = underTestDoctor.getSalaryPaid();
		assertEquals(false, expectedSalaryPayment);
		
	}
	@Test
	public void shouldBeAbleToPayDoctorAndChangeSalaryPaymentToTrue() {
		Doctor underTestDoctor = new Doctor ("", 0, null);
		underTestDoctor.pay();
		boolean expectedSalaryPayment = underTestDoctor.getSalaryPaid();
		assertEquals(true, expectedSalaryPayment);
		
	}
	@Test
	public void doctorShouldHaveBrainSurgeonSpecialty() {
		Doctor brainSurgeon = new Doctor("", 0, "Brain Surgeon");
		String expectedSpecialty = brainSurgeon.getSpecialty();
		assertEquals("Brain Surgeon", expectedSpecialty);
		
	}
	@Test
	public void doctorShouldHaveHeartSurgeonSpecialty() {
		Doctor heartSurgeon = new Doctor("", 0, "Heart Surgeon");
		String expectedSpecialty = heartSurgeon.getSpecialty();
		assertEquals("Heart Surgeon", expectedSpecialty);
	}
	@Test
	public void shouldBeAbleToDrawBlood() {
		Doctor underTestDoctor = new Doctor("", 0, null);
		underTestDoctor.drawBlood();
	}
	@Test
	public void shouldBeAbleToCareForPatients() {
		Doctor underTest = new Doctor ("", 0, null);
		underTest.careForPatients();
	}

	
}
