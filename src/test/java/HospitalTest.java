import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {

	@Before
	public void setup() {
	Hospital underTest = new Hospital();
	underTest.addDoctor("John", 23, null);
	underTest.addNurse("Jackie", 24);
	underTest.addReceptionist("Jenn", 25);
	underTest.addJanitor("Fred", 26);

	}
	
	@Test
	public void shouldHaveAHospital() {
		Hospital underTest = new Hospital();
	}
	@Test
	public void shouldHaveDoctorJohnInHospital() {
		Hospital underTest = new Hospital();
		underTest.addDoctor("John", 23, null);
		String empName = underTest.getEmployeeName(23);
		assertEquals("John", empName);

	}
	@Test
	public void shouldBeAbleToAddNurseJackieToHospital() {
		Hospital underTest = new Hospital();
		underTest.addNurse("Jackie", 24);
		String empName = underTest.getEmployeeName(24);
		assertEquals("Jackie", empName);
	}
	@Test
	public void shouldBeAbleToAddReceptionstJennToHospital() {
		Hospital underTest = new Hospital();
		underTest.addReceptionist("Jenn", 25);
		String empName = underTest.getEmployeeName(25);
		assertEquals("Jenn", empName);	
	}
	@Test
	public void shouldBeAbleToAddJanitorFredToHospital() {
		Hospital underTest = new Hospital();
		underTest.addJanitor("Fred", 26);
		String empName = underTest.getEmployeeName(26);
	}
	@Test
	public void shouldBeAbleToPayDoctor() {
		Hospital underTest = new Hospital();
		underTest.addDoctor("John", 23, null);
		
	}
	@Test
	public void shouldBeAbelToAddPatients() {
		Hospital underTest = new Hospital();
		underTest.addPatient(null, 0, 0);
	}
	
}
