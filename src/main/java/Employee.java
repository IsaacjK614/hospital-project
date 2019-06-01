
public abstract class Employee {

	private String name;
	private int employeeNumber;
	private boolean hasBeenPaid;

	
	public Employee(String name, int employeeNumber) {
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public int getPaySalary() {
		
		return 0;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public boolean getHasBeenPaid() {
		return hasBeenPaid;
	}

	public void pay() {
		hasBeenPaid = true;
	}

}