
public class Patient {

	private int bloodLevel;
	private int healthLevel;


	public Patient(int BLOOD_LEVEL, int HEALTH_LEVEL) {
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




}
