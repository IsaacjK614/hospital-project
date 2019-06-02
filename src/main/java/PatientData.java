import java.util.HashMap;
import java.util.Map;

public class PatientData {

	
	Map <String, Patient> patientData = new HashMap();

	public void addPatient(String patientName, int BLOOD_LEVEL, int HEALTH_LEVEL) {
		patientData.put(patientName, new Patient(patientName, BLOOD_LEVEL, HEALTH_LEVEL));
		
	}
}
