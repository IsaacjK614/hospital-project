
public class Doctor extends Employee {

	private String specialty;
	
	public Doctor(String name, int employeeNumber, String specialty) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.specialty = specialty;
	}

	public int calculateEmployeeSalary() {
		return 900000;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevel(10);
		
	}
	
	public void careForPatients(Patient patient) {
		patient.increaseHealthLevel(5);
	
		
	}

}
