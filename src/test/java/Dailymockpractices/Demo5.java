package Dailymockpractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException, IOException {
         
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ixigo.com/trains");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.findElement(By.id("ixiLogoImg")).click();
		Thread.sleep(3000);

	     Alert a= driver.switchTo().alert();
	     a.accept();
		 System.out.println("handle alert popup");
		
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]")).sendKeys("Pune");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[2]")).sendKeys("Nashik");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='31 Mar, Fri']")).sendKeys("31 Mar, Fri");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='u-ripple']")).click();
		Thread.sleep(3000);

		
		System.out.println("To Take Screenshot");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File decs=new File("C:\\Users\\rnarode\\eclipse-workspace\\bugspotter\\Screenshot\\busbooking.png");
	    FileUtils.copyFile(src, decs);
		Thread.sleep(3000);

	    System.out.println("End Execution");

	}

}
