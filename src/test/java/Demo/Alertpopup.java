package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
              WebDriverManager.chromedriver().setup();
              WebDriver driver=new ChromeDriver();
              driver.get("https://demoqa.com/alerts");
              driver.manage().window().maximize();
              Thread.sleep(3000);
              driver.findElement(By.id("alertButton")).click();
              Thread.sleep(3000);
             Alert a= driver.switchTo().alert();
              a.accept();
              Thread.sleep(3000);
              driver.close();
              
              
              
              
              
	}

}
