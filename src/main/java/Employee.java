
public class Employee {

	protected String name;
	protected int employeeNumber;
	protected boolean salaryPaid;

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public boolean getSalaryPaid() {
		return salaryPaid;
	}

	public boolean pay() {
		return salaryPaid = true;
	}

}