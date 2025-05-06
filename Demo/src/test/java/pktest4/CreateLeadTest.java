package pktest4;

import org.testng.annotations.Test;

public class CreateLeadTest {
	@Test(groups="SmokeTest")
	public void createLeadTest() {
		System.out.println("Lead created");
	}
	@Test(groups="RegressionTest")
	public void modifyLeadTest() {
		System.out.println("Modify Lead");
	}
	@Test(groups="RegressionTest")
	public void deleteLeadTest() {
		System.out.println("Lead deleted");
	}
}
