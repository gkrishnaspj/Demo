package pktest2;

import org.testng.annotations.Test;

public class CreateProductTest {
	@Test(groups="SmokeTest")
	public void createProductTest() {
		System.out.println("Product created");
	}
	@Test(groups="RegressionTest")
	public void modifyProductTest() {
		System.out.println("Product modify");
	}
	@Test(groups="RegressionTest")
	public void deleteProductTest() {
		System.out.println("Product deleted");
	}

}
