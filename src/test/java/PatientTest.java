import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatientTest {

	@Test
	public void shouldHaveDefaultBloodLevelOf20() {
		Patient underTestPatient = new Patient();
		int expectedDefaultBloodLevel = underTestPatient.getBloodLevel();
		assertEquals(20, expectedDefaultBloodLevel);
	}
	@Test
	public void shouldHaveDefaultHealthLevelOf10() {
		Patient underTestPatient = new Patient();
		int expectedDefaultHealthLevel = underTestPatient.getHealthLevel();
		assertEquals(10, expectedDefaultHealthLevel);
	}
	@Test
	public void bloodLevelShouldDecreaseBy5IfBloodDrawnByDoctor() {
		Patient underTestPatient = new Patient();
		int bloodLevelBeforeDoctorDrawBlood = underTestPatient.getBloodLevel();
		underTestPatient.drawBlood();
		int bloodLevelAfterDoctorDrawBlood = underTestPatient.getBloodLevel();
		assertEquals(bloodLevelBeforeDoctorDrawBlood -5, bloodLevelAfterDoctorDrawBlood);
		
	}
}
