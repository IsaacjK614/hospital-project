import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatientTest {

	@Test
	public void patientShouldExist() {
		Patient underTest = new Patient("", 0, 0);	
	}
	@Test
	public void patientShouldHaveNameJoe() {
		Patient underTest = new Patient("Joe", 0,0);
		String patientName = underTest.getPatientName();
		assertEquals("Joe", patientName);
	}
	
	@Test
	public void patientShouldHaveDefaultBloodLevelOf20() {
		Patient underTest = new Patient("", 20, 0);
		int expectedBloodLevel = underTest.getBloodLevel();
		assertEquals(20, expectedBloodLevel);
	}

	@Test
	public void patientShouldHaveDefaultHealthLevelOf10() {
		Patient underTest = new Patient("", 0, 10);
		int expectedHealthLevel = underTest.getHealthLevel();
		assertEquals(10, expectedHealthLevel);
	}
	
}
