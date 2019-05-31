
public class Receptionist extends Employee {

	private boolean onThePhone;



	public int calculateEmployeeSalary() {
		return 45000;
	}

	public boolean getOnThePhone() {
		return onThePhone;
	}

	public void onThePhone() {
		onThePhone = true;
	}

	
}
