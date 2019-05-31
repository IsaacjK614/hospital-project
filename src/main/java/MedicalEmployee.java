
public abstract class MedicalEmployee extends Employee {

	public MedicalEmployee() {
		super();
	}

	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevel(10);
		
	}

	public void careForPatients(Patient patient) {
		patient.increaseHealthLevel(5);
	
		
	}

}