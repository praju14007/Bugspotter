package Dailymockpractices;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class practices {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rnarode\\eclipse-workspace\\PrajaktaAutomation\\Resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable -extension");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// to handle current window
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.xpath("//button[@name='145newbrowsertab234']")).click();
		Thread.sleep(3000);

		driver.switchTo().window(parent);
		Thread.sleep(3000);

		driver.findElement(By.linkText("New Browser Tab Link")).click();
		Thread.sleep(3000);

		driver.switchTo().window(parent);
		Thread.sleep(3000);

		Set<String> AllWindow = driver.getWindowHandles();
		int a = AllWindow.size();
		System.out.println(a);

		driver.findElement(By.linkText("Demo Sites")).click();

		driver.findElement(By.xpath("(//*[text()='Practice Automation'])[2]")).click();

		driver.findElement(By.xpath("(//*[text()='Demo Site – Registration Form'])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("vfb-5")).sendKeys("prajakta");
		driver.findElement(By.name("vfb-7")).sendKeys("satpute");
		Thread.sleep(3000);

		driver.switchTo().window(parent);
		Thread.sleep(3000);
		System.out.println("Execution completed");
		driver.close();

	}

}
