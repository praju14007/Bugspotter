package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST_Demo {
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.out.println("open Browser");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void testa() {
		System.out.println("Method test A");
	}
	@Test
	public void testb() {
		System.out.println("Method test B");
	}
	@Test
	public void testc() {
		System.out.println("Method test C");
	}
	@AfterMethod
	public void teardown() {
		System.out.println("close browser");
		//driver.close();
	}

}
