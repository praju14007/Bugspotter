package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\rnarode\\eclipse-workspace\\PrajaktaAutomation\\Resources\\chromedriver.exe");
	
         WebDriver driver=new ChromeDriver();
         driver.get("http://www.demo.guru99.com/test/drag_drop.html");
         driver.manage().window().maximize();
         Thread.sleep(3000);
         
         //Actions----> Mouse movement and keyboard movement
         //Mouse hover
         
         
         //move to element and click on that
         
         Actions act=new Actions(driver);
        WebElement selenium= driver.findElement(By.xpath("//a[text()='Selenium']"));
         act.moveToElement(selenium).click().build().perform();
         
         
         
         
         
         
         
         
         
         
         
         
         
	}

}
