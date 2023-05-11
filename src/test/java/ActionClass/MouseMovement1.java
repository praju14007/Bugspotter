package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement1 {

	public static void main(String[] args) throws InterruptedException {
            
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/campaign/landing.php?campaign_id");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  
		  WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
		  
		  Actions act=new Actions(driver);
		  
		  act.keyDown(name, Keys.SHIFT).sendKeys("prajakta").build().perform();
		  Thread.sleep(3000);
		  
		 
		  act.keyDown(name,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		  act.sendKeys(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@name='lastname']")).click();
		  act.keyDown( Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		  Thread.sleep(3000);

		  
		  
		  
		  
		  
	}

}
