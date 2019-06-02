
public class Janitor extends Employee {

	private boolean isSweeping;
	
	
	public Janitor(String name, int employeeNumber) {
		super(name, employeeNumber);
		}

	public boolean getIsSweeping() {
		return isSweeping;
	}

	public void sweep() {
		isSweeping = true;
	}

	@Override
	public int getPaySalary() {
		return 40000;
	}

}