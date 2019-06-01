import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<Integer, Employee> hospitalEmployees = new HashMap();
	
	public String getEmpName(int employeeNumber) {
		return hospitalEmployees.get(employeeNumber).getName();
	}

	public void addDoctor(String name, int employeeNumber, String specialty) {
		hospitalEmployees.put(employeeNumber, new Doctor(name, employeeNumber, specialty));
	}

	public void addNurse(String name, int employeeNumber) {
		hospitalEmployees.put(employeeNumber, new Nurse(name, employeeNumber));
	}

	public void addReceptionist(String name, int employeeNumber) {
		hospitalEmployees.put(employeeNumber, new Receptionist(name, employeeNumber));
	}

	public void addJanitor(String name, int employeeNumber) {
		hospitalEmployees.put(employeeNumber, new Janitor(name, employeeNumber));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
