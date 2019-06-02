
public class Patient {

	private String patientName;
	private int bloodLevel;
	private int healthLevel;


	public Patient(String patientName, int BLOOD_LEVEL, int HEALTH_LEVEL) {
		this.patientName = patientName;
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
	}


	public int getBloodLevel() {
		return bloodLevel;
	}
	public int getHealthLevel() {
		return healthLevel;
	}


	public void decreaseBloodLevel(int amount) {
		bloodLevel -= amount;
	}


	public void increaseHealthLevel(int amount) {
		healthLevel -= amount;
	}


	public String getPatientName() {
		return patientName;
	}




}
