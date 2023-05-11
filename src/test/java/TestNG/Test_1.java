package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_1 {
	@BeforeMethod
	public void setup() {
		System.out.println("open browser");
		
		
	}
	
	@Test()
	public void testcasez() {
		System.out.println("Execute testcasez:");
	}
	
	@Test(priority=-1)
	public void testcaseb() {
		System.out.println("Execute testcaseb:");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods ="testcasez")
	public void testcasec() {
		System.out.println("Execute testcasec:");
	}
	
	@AfterMethod
	public void Teardown() {
		System.out.println("close browser");
		
	}
	

}
