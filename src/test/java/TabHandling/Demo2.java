package TabHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/rnarode/Desktop/prajaktadoc/Automation%20Notes/WindowHandle%20(2).html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Orange HRM")).click();
		Thread.sleep(3000);
		
//		Set<String> allWindow = driver.getWindowHandles();
		
		driver.switchTo().window(parent);
		Thread.sleep(3000);

		driver.findElement(By.linkText("Visit Facebook")).click();
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		Set<String> allWindow = driver.getWindowHandles();
		
		ArrayList<String> abc = new ArrayList<String>(allWindow);
		Thread.sleep(3000);
		System.out.println("Array list size =>>" +abc.size());

		driver.switchTo().window(abc.get(0));
		
		Thread.sleep(3000);

		driver.switchTo().window(abc.get(1));
		Thread.sleep(3000);
		
		driver.switchTo().window(abc.get(0));
		
		driver.switchTo().window(abc.get(2));
		Thread.sleep(3000);
		
		
		
		System.out.println("Execution Successful");
		driver.close();
	}

}
