
public class Patient {

	private int bloodLevel = 20;
	private int healthLevel = 10;

	public int getBloodLevel() {
		return bloodLevel ;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void doctorDrawBlood() {
		this.bloodLevel = this.bloodLevel - 5;
	}

	public void doctorCares() {
		this.healthLevel = this.healthLevel + 10;
		
	}

	public void nurseDrawBlood() {
		this.bloodLevel = this.bloodLevel - 2;
	}

	public void nurseCares() {
		this.healthLevel = this.healthLevel + 5;
	}


}
