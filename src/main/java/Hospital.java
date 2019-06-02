import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<Integer, Employee> hospitalEmployees = new HashMap();
	
	public String getEmployeeName(int employeeNumber) {
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



	public void printDoctorStats() {
		for (Employee doctor : hospitalEmployees.values()) {
			if (doctor instanceof Doctor) {
		System.out.printf(doctor.getName() + " " + doctor.getEmployeeNumber() +     "     " + doctor.getPaySalary() + "     " + doctor.getHasBeenPaid() + "    " + (((Doctor)doctor).getSpecialty()));
			}
		}
	}

	public void printNurseStats() {
		for (Employee nurse : hospitalEmployees.values()) {
			if (nurse instanceof Nurse) {
		System.out.printf(nurse.getName() + "     " + nurse.getEmployeeNumber() + "     " + nurse.getPaySalary() + "     " + nurse.getHasBeenPaid() + "     " + (((Nurse)nurse).getPatientsUnderCare()));
			}
		}
	}
	public void printReceptionistStats() {
		for (Employee receptionist : hospitalEmployees.values()) {
			if (receptionist instanceof Receptionist) {
		System.out.printf(receptionist.getName() + "   " + receptionist.getEmployeeNumber() + "    " + receptionist.getPaySalary() + "       " + receptionist.getHasBeenPaid() + "       " + (((Receptionist)receptionist).getIsOnPhone()));
			}
		}
	}
	public void printJanitorStats() {
		for (Employee janitor : hospitalEmployees.values()) {
			if (janitor instanceof Janitor) {
		System.out.printf(janitor.getName() +"  " +janitor.getEmployeeNumber() +"  " + janitor.getPaySalary() +"   "+ janitor.getHasBeenPaid() +"   "+ (((Janitor)janitor).getIsSweeping()));
			}
		}
	}
	
}

