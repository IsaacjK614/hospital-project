
public class Nurse extends SkillEmployees {

	
	public Nurse(String name, int employeeNumber) {
		super(name, employeeNumber);
	}

	@Override
	public int getPaySalary() {
		return 50000;
	}

	public int getPatientsUnderCare() {
		return 5;
	}
	
	@Override
	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevel(5);
	}
	@Override
	public void care(Patient patient) {
		patient.increaseHealthLevel(3);
	}



}
