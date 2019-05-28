
public class Janitor extends Employee {


	private boolean sweeping;

	public int getJanitorSalary() {
		return 40000;
	}

	public boolean getSweeping() {
		return sweeping;
	}

	public void sweeping() {
		sweeping = true;
	}


}
