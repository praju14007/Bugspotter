import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\rnarode\\eclipse-workspace\\PrajaktaAutomation\\Resources\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.get("file:///C:/Users/rnarode/Desktop/prajaktadoc/Automation%20Notes/StaticTable.html");
		Thread.sleep(3000);
		
	      List<WebElement> table=driver.findElements(By.tagName("table"));
	      
	      int ls=table.size();
	      System.out.println(ls);
	      
	      for(WebElement abc : table) {
	    	  String b=abc.getText();
	    	  System.out.println(b);
	      }
	      System.out.println("------------------------------------------");
	      
	      
	      List<WebElement> ls1=driver.findElements(By.tagName("tr"));
	      
	      int c=ls1.size();
	      System.out.println(c);
	       for(WebElement row : ls1) {
	    	   String d=row.getText();
	    	   System.out.println(d);
	       }
	       System.out.println("------------------------------------------");
	      
	      
	      driver.close();
		
		
		
		
		
		
		
		

	}

}
