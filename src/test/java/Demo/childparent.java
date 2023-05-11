package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childparent {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
				
		////parent window id
		String parentID=driver.getWindowHandle();
		System.out.println("parents window ID:"+parentID);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		 
		//parent and child ID
		Set<String> AllID=driver.getWindowHandles();
		
		System.out.println("AllID parent and child window ID:"+AllID);
		List<String> list=new ArrayList(AllID);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		driver.switchTo().window(list.get(1));
		
		
		System.out.println(list.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("praju@123gmail.com");
		Thread.sleep(3000);

		
		driver.switchTo().window(list.get(0));
	//	driver.close();
		
	}

}
