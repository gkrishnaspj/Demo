package pktest1;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test(groups="SmokeTest")
	public void createOrgTest() {
		System.out.println("Org created");
	}
	@Test(groups="RegressionTest")
	public void modifyOrgTest() {
		System.out.println("Modify Org");
	}
	@Test(groups="RegressionTest")
	public void deleteOrgTest() {
		System.out.println("Org deleted");
	}

}
