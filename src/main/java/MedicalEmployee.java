
public abstract class MedicalEmployee extends Employee{

	public MedicalEmployee(String name, int employeeNumber) {
		super(name, employeeNumber);
	}
	
	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevel(5);
	}
	
	public abstract void care(Patient patient);
	
	protected void care(Patient patient, int level) {
		patient.increaseHealthLevel(level);
	}
	
	
}
