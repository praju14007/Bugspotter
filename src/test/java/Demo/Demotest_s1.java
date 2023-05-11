package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s1 {

	public static void main(String[] args) throws InterruptedException {
          WebDriverManager.chromedriver().setup();
          
          ChromeDriver driver=new ChromeDriver();
          driver.get("https://www.redbus.in/online-booking/apsrtc?gclid=EAIaIQobChMI3bOjtfiq_QIV35NmAh1YBwepEAAYASAAEgIyl_D_BwE");
          driver.manage().window().maximize();
          Thread.sleep(3000);
          driver.findElement(By.id("txtSource")).sendKeys("Aurangabad");
          driver.findElement(By.id("txtDestination")).sendKeys("Pune");
          driver.findElement(By.id("txtOnwardCalendar")).sendKeys("24-Feb-2023");
          System.out.println("enter date");
          Thread.sleep(1000);
          driver.findElement(By.xpath("//button[@class='D120_search_btn searchBuses']")).click();
          System.out.println("click on search button");
          Thread.sleep(5000);
           // driver.close();
		
	}

}
