import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Hospital myHospital = new Hospital();
		PatientData myPatientData = new PatientData();
		Scanner input = new Scanner(System.in);
		String userChoice; 
		
		Doctor doc1 = new Doctor("John", 1, "Neurosurgeon" );
		Doctor doc2 = new Doctor("Joe", 2, "Heart Surgeon" );
		Doctor doc3 = new Doctor("Sally", 3, "Foot Doctor");
		Nurse nurse1 = new Nurse("Alex", 4);
		Nurse nurse2 = new Nurse("Jackie", 5);
		Receptionist receptionist = new Receptionist("Rachel", 6);
		Janitor janitor = new Janitor ("Bo", 7);

	
		myHospital.addDoctor("John", 1, "Neurosurgeon");
		myHospital.addDoctor("Joe", 2, "Heart Surgeon");
		myHospital.addDoctor("Sally", 3, "Foot Doctor");
		myHospital.addNurse("Alex", 4);
		myHospital.addNurse("Jackie", 5);
		myHospital.addReceptionist("Rachel", 6);
		myHospital.addJanitor("Bo", 7);
		
do{
	System.out.println("");
	System.out.println("Here are your options");
	System.out.println("(1) to check doctor data           (2) to check nurse data");
	System.out.println("(3) to check receptionist data     (4) to check janitor data");
	System.out.println("(9) to exit");
	userChoice = input.nextLine();
	
	if(userChoice.equals("9")) {
		System.out.println("Good Bye");
		break;
		}
	if(userChoice.equals("1")) {
		myHospital.printDoctorStats();
	}
	if(userChoice.equals("2")) {
		myHospital.printNurseStats();
	}
	if(userChoice.equals("3")) {
		System.out.println("Name, EmpNum, Salary, Has Been Paid, On Phone");
		myHospital.printReceptionistStats();
	}
	if(userChoice.equals("4")) {
		System.out.println("Name, EmpNum, Salary, Has Been Paid, Sweeping");
		myHospital.printJanitorStats();
	}
	} while(!userChoice.equals("9"));
	
}
	
	
}




	
	
	

	

