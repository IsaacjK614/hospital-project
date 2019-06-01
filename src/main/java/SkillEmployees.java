
public abstract class SkillEmployees extends Employee {

	public SkillEmployees(String name, int employeeNumber) {
		super(name, employeeNumber);
	}

	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevel(0);
	}

	public void care(Patient patient) {
		patient.increaseHealthLevel(0);
	}

}