import org.junit.Test;

public class PatientDataTest {

	@Test
	public void shouldHavePatientData() {
		PatientData underTest = new PatientData();
	}
	@Test
	public void shouldBeAbleToAddPatientsIntoData() {
		PatientData underTest = new PatientData();
		underTest.addPatient(null, 0, 0);
	}
}
