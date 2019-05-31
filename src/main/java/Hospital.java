import java.util.HashMap;
import java.util.Map;

public class Hospital {

	private Map<String, Employee> employeeMap = new HashMap<>();
	
	public void addEmployeeToHospital(Doctor doctor) {
		employeeMap.put(doctor.getName(), doctor);
	}
	public void addEmployeeToHospital(Nurse nurse) {
		employeeMap.put(nurse.getName(), nurse);
	}
	public void addEmployeeToHospital(Receptionist receptionist) {
		employeeMap.put(receptionist.getName(), receptionist);
	}
	public void addEmployeeToHospital(Janitor janitor) {
		employeeMap.put(janitor.getName(), janitor);
	}
	
	
	
	public String getEmployeeName(String name) {
		return employeeMap.get(name).getName();
	}
	public int getEmployeeNumber(String name) {
		return employeeMap.get(name).getEmployeeNumber();
	}
	public int getEmployeeSalary(String name) {
		return employeeMap.get(name).calculateEmployeeSalary();
	}
	public boolean getSalaryPaid(String name) {
		return employeeMap.get(name).getSalaryPaid();
	}
	
}
	

