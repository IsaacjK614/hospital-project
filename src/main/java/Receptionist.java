
public class Receptionist extends Employee {

	public Receptionist(String name, int employeeNumber) {
		super(name, employeeNumber);
	}
	
	@Override
	public int getPaySalary() {
		return 45000;
	}
	public boolean getIsOnPhone() {
		return isOnPhone;
	}
	
	private boolean isOnPhone;{
		
	}
	public void pickUpPhone() {
		isOnPhone = true;
	}

}
