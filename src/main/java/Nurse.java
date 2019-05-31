
public class Nurse extends MedicalEmployee{

	private int patientsUnderCare;

	public Nurse(int patientsUnderCare) {
		this.patientsUnderCare = patientsUnderCare;
		
	}
	@Override
	public int calculateEmployeeSalary() {
 		return 50000;
	}

	public int getPatientsUnderCare() {
		return patientsUnderCare;
	}

	@Override
	public void careForPatients(Patient patient) {	
		patient.increaseHealthLevel(3);

	}

}
