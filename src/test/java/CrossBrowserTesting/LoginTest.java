package CrossBrowserTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{

	@Test
	public void verifylogin() {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Prajakta");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

	}
	
}
