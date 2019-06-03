import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Hospital myHospital = new Hospital();
		Scanner input = new Scanner(System.in);
		String userChoice; 
		
	
		myHospital.addDoctor("John", 1, "Neurosurgeon");
		myHospital.addDoctor("Joe", 2, "Heart Surgeon");
		myHospital.addDoctor("Sally", 3, "Foot Doctor");
		myHospital.addNurse("Alex", 4);
		myHospital.addNurse("Jackie", 5);
		myHospital.addReceptionist("Rachel", 6);
		myHospital.addJanitor("Bo", 7);
		
		myHospital.addPatient("Old Johnny", 20, 10);
		myHospital.addPatient("Jack", 20, 10);
		myHospital.addPatient("Granny", 20, 10);
		myHospital.addPatient("Matt", 20, 10);

		
do{
	System.out.println("Here are your options");
	System.out.println("(1) Doctor Info           (2) Nurse Info");
	System.out.println("(3) Receptionist Info     (4) Janitor Info");
	System.out.println("(5) Pay all employees     (6) Medical employees functions");
	System.out.println("(7) Check patient info    (9) Exit");
	userChoice = input.nextLine();
	if(userChoice.equals("9")) {
		System.out.println("Good Bye");
		break;
		}

	else if (userChoice.equals("1")) {
		myHospital.printDoctorStats();
	}

	else if(userChoice.equals("2")) {
		myHospital.printNurseStats();
	}
	else if(userChoice.equals("3")) {
		myHospital.printReceptionistStats();
	}
	else if(userChoice.equals("4")) {
		myHospital.printJanitorStats();
	}
	else if(userChoice.equals("5")) {
			int payment = myHospital.payAll();
			System.out.println("You have paid all employees - total of $" + payment);


			
		}
	else if(userChoice.equals("6")) {
		String option;
		int caretakerId;
		String patientName;
		
		Employee caretaker;
		
		
		myHospital.printDoctorBasicStats();
		myHospital.printNurseBasicStats();
		System.out.println("----------------------------------------");
		System.out.println("Enter caretaker ID: ");
		caretakerId = Integer.parseInt(input.nextLine());
		caretaker = myHospital.getEmployee(caretakerId);
		while (caretaker == null ||
				!(caretaker instanceof MedicalEmployee))
		{
			System.out.println("Enter a valid id");
			caretakerId = input.nextInt();
			caretaker = myHospital.getEmployee(caretakerId);
			if (caretaker == null ||
					!(caretaker instanceof MedicalEmployee)) {
				caretaker = null;
			}

		}
		
		System.out.println("(1) draw blood");
		System.out.println("(2) care");
		System.out.println("Select Option: ");
		option = input.nextLine();
		while(option.contentEquals("1") && option.contentEquals("2") ) {
			System.out.println("Enter a valid option");
			option = input.next();
		}
			
		
		
		myHospital.printPatientNames();
		System.out.println("Type patient name: ");
		patientName = input.nextLine();
		Patient patient = myHospital.getPatient(patientName);
		while (patient == null) {
			System.out.println("Enter a valid patient name");
			patientName = input.next();
			patient = myHospital.getPatient(patientName);
		}
		
		if (option.equals("1")) {
			((MedicalEmployee)caretaker).drawBlood(patient);
			System.out.println("You Have Succesfully Drawn Blood!");
		} else if (option.equals("2")) {
			((MedicalEmployee)caretaker).care(patient);
			System.out.println("You Have Taken Care Of Your Pateint!");
			
		} 
		System.out.println("Press enter to continue");
		input.nextLine();
		
		
	}
	else if(userChoice.equals("7")) {
		System.out.println("Here is the list of all patients");
		System.out.println("");
		myHospital.printPatientInfo();
		
		}
	
	System.out.println("------------------------\n");
	} while(!userChoice.equals("9"));
	

	}
}


	
	

	

