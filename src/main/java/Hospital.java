import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<Integer, Employee> hospitalEmployees = new HashMap();
	Map<String, Patient> patientData = new HashMap();

	// employees
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

	public Employee getEmployee(int employeeNumber) {
		return hospitalEmployees.get(employeeNumber);
	}

	public void printDoctorStats() {
		for (Employee doctor : hospitalEmployees.values()) {
			if (doctor instanceof Doctor) {
				System.out.println("Doctor Name: " + doctor.getName() + "\n\tID: " + doctor.getEmployeeNumber() + "\n\tSalary: " + doctor.getPaySalary() + "\n\tHas Been Paid: " + doctor.getHasBeenPaid() + "\n\tSpecialty: " + (((Doctor)doctor).getSpecialty()));
			}
		}
	}
	public void printDoctorBasicStats() {
		for (Employee doctor : hospitalEmployees.values()) {
			if (doctor instanceof Doctor) {
				System.out.println("Doctor: " + doctor.getName() + "| EmployeeID: " + doctor.getEmployeeNumber());
			}
		}
	}

	public void printNurseStats() {
		for (Employee nurse : hospitalEmployees.values()) {
			if (nurse instanceof Nurse) {
				System.out.println("Nurse Name: " + nurse.getName() + "\n\tID: " + nurse.getEmployeeNumber() + "\n\tSalary: " + nurse.getPaySalary() + "\n\tHas Been Paid: " + nurse.getHasBeenPaid() + "\n\tPatients Under Care: " + (((Nurse)nurse).getPatientsUnderCare()));
			}
		}
	}
	public void printNurseBasicStats() {
		for (Employee nurse : hospitalEmployees.values()) {
			if (nurse instanceof Nurse) {
				System.out.println("Nurse: " + nurse.getName() + "| EmployeeID: " + nurse.getEmployeeNumber());  
			}
		}
	}
	public void printReceptionistStats() {
		for (Employee receptionist : hospitalEmployees.values()) {
			if (receptionist instanceof Receptionist) {
				System.out.println("Receptionist: " + receptionist.getName() + "\n\tID: " + receptionist.getEmployeeNumber() + "\n\tSalary: " + receptionist.getPaySalary() + "\n\tHas Been Paid: " + receptionist.getHasBeenPaid() + "\n\tIs On Phone: " + (((Receptionist)receptionist).getIsOnPhone()));
			}
		}
	}
	public void printJanitorStats() {
		for (Employee janitor : hospitalEmployees.values()) {
			if (janitor instanceof Janitor) {
				System.out.println("Janitor: " + janitor.getName() + "\n\tID: " + janitor.getEmployeeNumber() + "\n\tSalary: " + janitor.getPaySalary() + "\n\tHas Been Paid: " + janitor.getHasBeenPaid() + "\n\tIs Sweeping: " + (((Janitor)janitor).getIsSweeping()));
			}
		}
	}
	public int payAll() {
		int payment = 0;
		for(Employee employee : hospitalEmployees.values()) {
			if (employee.pay())
				payment += employee.getPaySalary();
		}
		return payment;
	}

	public Doctor findAvailableDoctor() {
		// find a doctor that is free
		// currently it just returns the first doctor
		for(Employee employee : hospitalEmployees.values()) {
			if(employee instanceof Doctor) {
				return (Doctor)employee;
			}
		}
		return null;
	}

	public boolean drawBloodFromAllPatients() {

		Doctor doctor = findAvailableDoctor();

		if (doctor != null) {
			for(Patient patient : patientData.values()) {
				doctor.drawBlood(patient);
			}
			return true;
		}

		return false;
	}

	public boolean careAllPatients() {

		Doctor doctor = findAvailableDoctor();

		if (doctor != null) {
			for(Patient patient : patientData.values()) {
				doctor.care(patient);
			}
			return true;
		}

		return false;
	}
	// end employees



	// patients
	public void addPatient(String patientName, int BLOOD_LEVEL, int HEALTH_LEVEL) {
		patientData.put(patientName, new Patient(patientName, BLOOD_LEVEL, HEALTH_LEVEL));
	}
	public void printPatientInfo() {
		for (Patient patient : patientData.values()) {
			System.out.println(patient.getPatientName() + "  " + patient.getBloodLevel() + "  " + patient.getHealthLevel());
		}
	}
	public void printPatientNames() {
		for (Patient patient : patientData.values()) {
			System.out.println(patient.getPatientName());
		}
	}
	public Patient getPatient(String name) {
		return patientData.get(name);
	}
	// end patients



}
	

