package ActionClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovement {

	public static void main(String[] args) throws InterruptedException, IOException {
                
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rnarode\\eclipse-workspace\\PrajaktaAutomation\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		action.keyDown(email, Keys.SHIFT).sendKeys("prajaktasatpute").keyUp(Keys.SHIFT).build().perform();
		
		//ctrl=a  and ctrl+c
		action.keyDown(email, Keys.CONTROL).sendKeys("a").keyUp(Keys.SHIFT).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(1000);
		
		//ctrl+v
		 driver.findElement(By.id("pass")).click();
		
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		
		WebElement eye=driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']"));
		
		action.moveToElement(eye).click().build().perform();
		Thread.sleep(3000);
		System.out.println("Exceustion end");
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\rnarode\\eclipse-workspace\\bugspotter\\Screenshot\\mouse.png");
		
		FileUtils.copyFile(src, dest);
		
		System.out.println("Screenshot capture1:");
		
		
		// specifice element Screenshot
	      WebElement logo=driver.findElement(By.xpath("//div[@class='_4-u5 _30ny']"));
		File src1=logo.getScreenshotAs(OutputType.FILE);
		File dest1=new File("C:\\Users\\rnarode\\eclipse-workspace\\bugspotter\\Screenshot\\logo.png");
		FileUtils.copyFile(src1, dest1);
		System.out.println("Screenshot logo capture:");
		
		
		
		
		
		//
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
