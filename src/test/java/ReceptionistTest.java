import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceptionistTest {

	Receptionist underTestReceptionist = new Receptionist();

	@Test
	public void shouldHaveReceptionistSalaryOf45000() {
		int expectedReceptionistSalary = underTestReceptionist.getReceptionistSalary();
		assertEquals(45000, expectedReceptionistSalary);
		
	}
	@Test
	public void shouldHaveDefaultOnThePhoneAsFalse() {
		Receptionist underTestReceptionist = new Receptionist();
		boolean expectedOnThePhone = underTestReceptionist.getOnThePhone();
		assertEquals(false, expectedOnThePhone);
		
	}
	@Test
	public void shouldBeAbleToPickUpPhoneWhichMakesOnThePhoneTrue() {
		Receptionist underTestReceptionist = new Receptionist();
		underTestReceptionist.onThePhone();
		boolean expectedOnThePhone = underTestReceptionist.getOnThePhone();
		assertEquals(true, expectedOnThePhone);
		
	}
}
