package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class relativexpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       // Thread.sleep(3000);
        
      WebElement above= driver.findElement(RelativeLocator.with(By.id("pass")).above(By.id("email")));
      //driver.findElement(By.id("pass")).sendKeys("praju@123");
       above.sendKeys("praju@234");
        Thread.sleep(3000);
          driver.close();
        
        
        
        
        
        
	}

}
