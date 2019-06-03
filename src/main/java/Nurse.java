
public class Nurse extends MedicalEmployee {

	
	public Nurse(String name, int employeeNumber) {
		super(name, employeeNumber);
	}

	@Override
	public int getPaySalary() {
		return 50000;
	}

	public int getPatientsUnderCare() {
		return 1;
	}
	
	public void care(Patient patient) {
		super.care(patient, 3);
	}

}
