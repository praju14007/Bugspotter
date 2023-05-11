package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicit {

	public static void main(String[] args) {
          
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//manage-->option interface in that timeout() is present-->timeout interface in that im[licitlywait is prsent-->timeout interface
		driver.findElement(By.id("email")).sendKeys("prajakta");
		System.out.println("enter name");
		driver.close();
		
		//driver.manage().timeouts().implicitlyWait(Duration.OfSeconds(30));
		
		
				
		
	}

}
