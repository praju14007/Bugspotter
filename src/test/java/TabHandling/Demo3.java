package TabHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/rnarode/Desktop/prajaktadoc/Automation%20Notes/WindowHandle%20(2).html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// parent window
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.linkText("Orange HRM")).click();
		Thread.sleep(3000);
		String org = driver.getWindowHandle();

		

		driver.switchTo().window(parent);
		System.out.println("window handled--switch to parent");

		driver.findElement(By.name("fname")).sendKeys("prajakta");
		Thread.sleep(3000);

		driver.findElement(By.linkText("Visit Facebook"));
		Thread.sleep(3000);
		String fb = driver.getWindowHandle();
		
		driver.switchTo().window(parent);
//		Set<String> AllWindow = driver.getWindowHandles();
//
//		int a = AllWindow.size();
//		System.out.println("no of window:-"+a);
//		
//		Thread.sleep(3000);
//		ArrayList<String> abc = new ArrayList<String>(AllWindow);
//		Thread.sleep(3000);

		
		driver.switchTo().window(org);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		driver.switchTo().window(parent);
		Thread.sleep(3000);

		driver.findElement(By.name("fname")).sendKeys("rahul");
		driver.findElement(By.name("lname")).sendKeys("patil");
		driver.findElement(By.name("address")).sendKeys("pune");
		// driver.findElement(By.id("login")).click();
		System.out.println("Enter data.");
		Thread.sleep(3000);
		System.out.println("Execution Successful");
		
		driver.switchTo().window(fb);
		Thread.sleep(3000);

	}

}
