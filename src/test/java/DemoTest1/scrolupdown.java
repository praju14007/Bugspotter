package DemoTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolupdown {

	public static void main(String[] args) throws InterruptedException {
             
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);

		 
		  
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeAsyncScript("window.scrollBy(0,800)", "");
		  System.out.println("down");
		  Thread.sleep(2000);
		  js.executeAsyncScript("window.scrollBy(0,-800)", "");
		  System.out.println("up");
		  Thread.sleep(2000);
          driver.close();

	}

}
