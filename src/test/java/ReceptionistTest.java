import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceptionistTest {

	@Test
	public void receptionistShouldHaveSalaryOf45000() {
		Receptionist underTest = new Receptionist(null, 0);
		int expectedSalary = underTest.getPaySalary();
		assertEquals(45000, expectedSalary);
	}
	@Test
	public void receptionistShouldHaveDefaultIsOnPhoneFalse() {
		Receptionist underTest = new Receptionist(null, 0);
		boolean expectedIsOnPhone = underTest.getIsOnPhone();
		assertEquals(false, expectedIsOnPhone);
	}
	@Test
	public void receptionistShouldHaveIsOnPhoneTrueWhenPickUpPhone() {
		Receptionist underTest = new Receptionist(null, 0);
		underTest.pickUpPhone();
		boolean expectedIsOnPhone = underTest.getIsOnPhone();
		assertEquals(true, expectedIsOnPhone);
		
	}
}
