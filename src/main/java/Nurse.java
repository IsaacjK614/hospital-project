
public class Nurse extends Employee{

	private int patientsUnderCare;

	public Nurse(String name, int employeeNumber, int patientsUnderCare) {
		this.name= name;
		this.employeeNumber= employeeNumber;
		this.patientsUnderCare= patientsUnderCare;
		}


	public int calculateEmployeeSalary() {
		return 50000;
	}
	
	public void drawBlood(Patient patient) {
		patient.decreaseBloodLevel(10);
		
		}

	public void careForPatient(Patient patient) {
		patient.increaseHealthLevel(3);
		
		
	}

	public int getPatientsUnderCare() {
		return patientsUnderCare;
	}

	

}
