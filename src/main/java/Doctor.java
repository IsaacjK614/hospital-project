
public class Doctor extends MedicalEmployee {

	private String specialty;
	
	public Doctor(String name, int employeeNumber, String specialty) {
		super(name, employeeNumber);
		this.specialty = specialty;
	}

	@Override
	public int getPaySalary() {
		
		return 90000;
	}
	public String getSpecialty() {
		return specialty;
	}
	
	
	public void care(Patient patient) {
		super.care(patient, 5);
	}


}
