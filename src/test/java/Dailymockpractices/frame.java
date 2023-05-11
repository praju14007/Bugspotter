package Dailymockpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rnarode\\eclipse-workspace\\PrajaktaAutomation\\Resources\\chromedriver.exe");		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--no-sandbox");
		options.addArguments("--disable -extension");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?help-doc.html");
		driver.manage().window().maximize();

        
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		System.out.println("click on link first child frame");
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
		driver.findElement(By.linkText("By.Remotable")).click();
		System.out.println("click on another link");
        Thread.sleep(3000);
         
        driver.navigate().refresh();
		//Switch to top frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.linkText("AbstractAnnotations")).click();
		System.out.println("click on link of second child frame");
        Thread.sleep(3000);

        driver.navigate().refresh();
		driver.switchTo().defaultContent();
		System.out.println("switch on top frame");
        Thread.sleep(3000);

		WebElement wb=driver.findElement(By.className("rightIframe"));
		driver.switchTo().frame(wb);
		System.out.println("switch to third child frame");
        Thread.sleep(3000);
        
        
		driver.findElement(By.linkText("Overview")).click();
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		System.out.println("click on link of third chil frame");
        Thread.sleep(3000);
          System.out.println("Execution complete");
		driver.close();
		
	}

}
