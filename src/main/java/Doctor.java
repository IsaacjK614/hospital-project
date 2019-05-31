
public class Doctor extends MedicalEmployee {

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
	

}
