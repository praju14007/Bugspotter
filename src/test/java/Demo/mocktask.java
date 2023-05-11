package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mocktask {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		// open snapchat get title and url fill all details
		// clear the firstname
		// click on sign up close browser .

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.snapchat.com/accounts/signup?client_id=snapkit");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("prajakta");
		 firstname.isDisplayed();
		System.out.println("first name is displayed"+firstname);
		System.out.println("we enter the firstname");
		Thread.sleep(3000);
          
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("satpute");
		System.out.println("we enter the lastname");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("praju@123");
		System.out.println("we enter the username");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("234567");
		System.out.println("we enter the password");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prajakta@123");
		System.out.println("we enter the email");

		String wb = driver.getTitle();
		System.out.println(wb);
		firstname.clear();
		Thread.sleep(3000);
		System.out.println("clear the firstname");
		System.out.println("we capture all data");
		Thread.sleep(3000);
		driver.close();

	}

}
