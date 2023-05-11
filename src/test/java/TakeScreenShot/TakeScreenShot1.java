package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class TakeScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
          
	    String Rm=	RandomString.make(6);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destn = new File("C:\\Users\\rnarode\\eclipse-workspace\\bugspotter\\Screenshot\\"+Rm+".png");
		FileUtils.copyFile(src, destn);
		
		//capture Screenshot of element
//		WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
//		File src1=logo.getScreenshotAs(OutputType.FILE);
//		File destn1=new File("C:\\Users\\rnarode\\eclipse-workspace\\bugspotter\\Screenshot\\logo.png");
//		FileUtils.copyFile(src1, destn1);
//		System.out.println("successfuly capture Screnshot of fb logocap");
		driver.close();
		
		
		
	

	}

}
