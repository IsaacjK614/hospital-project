
public class Doctor extends Employee {

	private String specialty;
	
	public Doctor(String name, int employeeNumber, String specialty) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.specialty = specialty;
	}

	public int getDoctorSalary() {
		return 900000;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void drawBlood() {
		
	}
	
	public void careForPatients() {
		
	}

}
