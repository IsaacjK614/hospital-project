import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {

	Hospital underTestHospital = new Hospital();
//	@Test 
//	public void shouldBeAbleToAddDoctorJohnToHospital() {
//		underTestHospital.addEmployeeToHospital(new Doctor("John", 0, null, 0));
//		
//	}
//	@Before 
//	public void before() {
//		Hospital hospital = new Hospital();
//		underTestHospital.addEmployeeToHospital(new Doctor("A", 0, null, 0));
//		underTestHospital.addEmployeeToHospital(new Nurse (0));
//		underTestHospital.addEmployeeToHospital(new Receptionist ());		
//		underTestHospital.addEmployeeToHospital(new Janitor ());
//		
//	}
//	
	@Test
	public void shouldBeAbleToAddDoctorJohnFromHospital() {
		underTestHospital.addEmployeeToHospital(new Doctor("John", 0, null, 0));
		String expectedName = underTestHospital.getEmployeeName("John");
		assertEquals("John", expectedName);
	}
	@Test
	public void shoulbBeAbleToGetNameNatalieFromHospital() {
		underTestHospital.addEmployeeToHospital(new Doctor("Natalie", 0, null, 0));
		String expectedName = underTestHospital.getEmployeeName("Natalie");
		assertEquals("Natalie", expectedName);	
	}
	@Test
	public void shoulBeAbletoGetJohnEmployeeNumber12FromHospital() {
		underTestHospital.addEmployeeToHospital(new Doctor("John", 12, null, 0));
		int expectedEmployeeNumber = underTestHospital.getEmployeeNumber("John");
		assertEquals(12, expectedEmployeeNumber);	
	}
	@Test
	public void shouldBeAbleToGetJohnEmployeeSalary90000FromHospital() {
		underTestHospital.addEmployeeToHospital(new Doctor("John", 12, null, 0));
		int expectedEmployeeSalary = underTestHospital.getEmployeeSalary("John");
		assertEquals(90000, expectedEmployeeSalary);
	}
	@Test
	public void shouldBeAbleToGetJohnEmployeeSalaryStatusFalseFromHospital() {
		underTestHospital.addEmployeeToHospital(new Doctor("John", 12, null, 0));
		boolean expectedEmployeeSalaryPaidStatus = underTestHospital.getSalaryPaid("John");
		assertEquals(false, expectedEmployeeSalaryPaidStatus);
	}
	
}
