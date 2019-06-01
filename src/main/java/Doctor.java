
public class Doctor extends SkillEmployees {

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

	@Override
	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevel(5);
	}
	@Override
	public void care(Patient patient) {
		patient.increaseHealthLevel(5);
	}


}
