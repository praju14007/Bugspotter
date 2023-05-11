package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demomock {
	WebDriver driver;
	@BeforeMethod()
	public void setup() throws InterruptedException {
		System.out.println("open browser");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test()
		public void verifylogin() throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);

        driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		Thread.sleep(3000);

//        Alert a=driver.switchTo().alert();
//        a.accept();
//		System.out.println("close alert popup");
//		
		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("firstName")).sendKeys("prajakta");
		Thread.sleep(1000);

		driver.findElement(By.name("middleName")).sendKeys("satpute");
		Thread.sleep(1000);
	}
	
	@AfterMethod
	public void Teardown() {
		System.out.println("close browser");
		driver.close();
	}

}
