
public class Patient {

	private int bloodLevel = 20;
	private int healthLevel = 10;

	public int getBloodLevel() {
		return bloodLevel ;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	

	public void decreaseBloodLevel(int amount) {
		this.bloodLevel-=amount;
		
	}

	public void increaseHealthLevel(int amount) {
		this.healthLevel+=amount;
		
		
		
	}


}
