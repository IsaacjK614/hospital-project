
public class Doctor extends Employee {

	private String specialty;
	
	
	public Doctor(String name, int employeeNumber, String specialty, int employeeSalary) {
	  	this.name = name;
	  	this.employeeNumber = employeeNumber;
		this.specialty = specialty;
		this.employeeSalary = employeeSalary;	}

	@Override
	public int calculateEmployeeSalary() {
		return 90000;
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

	//public void giveMedication(Patient patient) {
		//patient.increaseHealthLevel(5);
		
		
	

	//public void splintInjury(Patient patient) {
		//patient.increaseHealthLevel(5);
		
	}


