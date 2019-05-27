
public class Nurse extends Employee{

	private int patientsUnderCare;

	public Nurse(int patientsUnderCare) {
		this.patientsUnderCare = patientsUnderCare;
		
	}

	public int getNurseSalary() {
		return 50000;
	}

	public int getPatientsUnderCare() {
		return patientsUnderCare;
	}

	public void drawBlood() {	
	}
	public void careForPatients() {	
	}

}
