import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HospitalTest {

	@Test
	public void shouldHaveAHospital() {
		Hospital underTest = new Hospital();
	}
	@Test
	public void shouldHaveDoctorJohnInHospital() {
		Hospital underTest = new Hospital();
		underTest.addDoctor("John", 23, null);
		String empName = underTest.getEmpName(23);
		assertEquals("John", empName);

	}
	@Test
	public void shouldBeAbleToAddNurseJackieToHospital() {
		Hospital underTest = new Hospital();
		underTest.addNurse("Jackie", 24);
		String empName = underTest.getEmpName(24);
		assertEquals("Jackie", empName);
	}
	@Test
	public void shouldBeAbleToAddReceptionstJennToHospital() {
		Hospital underTest = new Hospital();
		underTest.addReceptionist("Jenn", 25);
		String empName = underTest.getEmpName(25);
		assertEquals("Jenn", empName);	
	}
	@Test
	public void shouldBeAbleToAddJanitorFredToHospital() {
		Hospital underTest = new Hospital();
		underTest.addJanitor("Fred", 26);
		String empName = underTest.getEmpName(26);
	}
}
