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
		underTestPatient.doctorDrawBlood();
		int bloodLevelAfterDoctorDrawBlood = underTestPatient.getBloodLevel();
		assertEquals(bloodLevelBeforeDoctorDrawBlood -5, bloodLevelAfterDoctorDrawBlood);
	}
	@Test
	public void healthLevelShouldIncreaseBy10IfCaredByDoctor() {
		Patient underTestPatient = new Patient();
		int healthLevelBeforeDoctorCares = underTestPatient.getHealthLevel();
		underTestPatient.doctorCares();
		int healthLevelAfterDoctorCares = underTestPatient.getHealthLevel();
		assertEquals(healthLevelBeforeDoctorCares +10, healthLevelAfterDoctorCares);
	}
	@Test
	public void bloodLevelShouldDecreaseBy2IfBloodDrawnByNurse() {
		Patient underTestPatient = new Patient();
		int bloodLevelBeforeNurseDrawBlood = underTestPatient.getBloodLevel();
		underTestPatient.nurseDrawBlood();
		int bloodLevelAfterNurseDrawBlood = underTestPatient.getBloodLevel();
		assertEquals(bloodLevelBeforeNurseDrawBlood -2, bloodLevelAfterNurseDrawBlood);
	}
	@Test
	public void healthLevelShouldIncreaseBy5IfCaredByDoctor() {
		Patient underTestPatient = new Patient();
		int healthLevelBeforeNurseCares = underTestPatient.getHealthLevel();
		underTestPatient.nurseCares();
		int healthLevelAfterNurseCares = underTestPatient.getHealthLevel();
		assertEquals(healthLevelBeforeNurseCares +5, healthLevelAfterNurseCares);
	
	
	}
	
}
