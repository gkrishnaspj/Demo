package pktest3;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(groups="SmokeTest")
	public void createContactTest() {
		System.out.println("Contact created");
	}
	@Test(groups="RegressionTest")
	public void modifyContactTest() {
		System.out.println("Modify Contact");
	}
	@Test(groups="RegressionTest")
	public void deleteContactTest() {
		System.out.println("Contact deleted");
	}

}
