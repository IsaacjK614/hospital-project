
public class Doctor {

	private String name;
	private int employeeNumber;
	private boolean salaryPaid;
	private String specialty;
	
	


	public Doctor(String name, int employeeNumber, String specialty) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.salaryPaid = salaryPaid;
		this.specialty = specialty;
	}


	public String getName() {
		return name;
	}



	public int getEmployeeNumber() {
		return employeeNumber;
	}



	public int getDoctorSalary() {
		return 900000;
	}



	public boolean getSalaryPaid() {
		return salaryPaid;
	}



	public boolean pay() {
		return salaryPaid = true;
	}



	public String getSpecialty() {
		return specialty;
	}


	public void drawBlood() {
		
	}


	public void careForPatients() {
		// TODO Auto-generated method stub
		
	}

}
