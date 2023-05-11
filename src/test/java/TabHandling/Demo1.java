package TabHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

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

		Set<String> AllWindow = driver.getWindowHandles();

		int a = AllWindow.size();
		System.out.println(a);

		driver.switchTo().window(parent);
		System.out.println("window handled--switch to parent");

		driver.findElement(By.name("fname")).sendKeys("prajakta");
		Thread.sleep(3000);

		WebElement child = driver.findElement(By.linkText("Visit Facebook"));
		child.click();
		Thread.sleep(3000);
		ArrayList<String> abc = new ArrayList<String>(AllWindow);
		Thread.sleep(3000);

		driver.switchTo().window(abc.get(0));
		Thread.sleep(3000);
		driver.switchTo().window(abc.get(1));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		driver.switchTo().window(abc.get(0));
		Thread.sleep(3000);

		driver.findElement(By.name("fname")).sendKeys("rahul");
		driver.findElement(By.name("lname")).sendKeys("patil");
		driver.findElement(By.name("address")).sendKeys("pune");
		// driver.findElement(By.id("login")).click();
		System.out.println("Enter data.");
		Thread.sleep(3000);
		System.out.println("Execution Successful");
		
		driver.switchTo().window(abc.get(2));
		Thread.sleep(3000);

	}

}
