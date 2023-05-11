package Dailymockpractices;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi.withSha224;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mock2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();// converting webdriver into current browser
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement wb = driver.findElement(By.id("day"));

		
		Select select = new Select(wb);
		List<WebElement> ls = select.getOptions();
		int a = ls.size();
		System.out.println("value inside day:" + a);
		System.out.println("---------------------------------------");

		WebElement wb1 = driver.findElement(By.id("month"));
		Select s = new Select(wb1);
		List<WebElement> ls1 = s.getOptions();
		int b = ls1.size();
		System.out.println("value inside month:"+b);
		System.out.println("---------------------------------------");

		WebElement wb2 = driver.findElement(By.id("year"));
		Select s1 = new Select(wb2);
		List<WebElement> ls2 = s1.getOptions();
		int c = ls2.size();
		System.out.println("value inside year:"+c);
		System.out.println("---------------------------------------");

		System.out.println("Execution done");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\rnarode\\eclipse-workspace\\bugspotter\\Screenshot\\fb4.png");
		FileUtils.copyFile(src, desc);
		driver.close();
		System.out.println("we take Screenshot of fb page");
		
		
		
		
		
		
		
		
		
		
		
	}

}
