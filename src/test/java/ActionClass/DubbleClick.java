package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DubbleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Element --->Double Click

		Actions act1 = new Actions(driver);

		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		// act1.doubleClick(doubleclick).build().perform();
		Thread.sleep(3000);
		// right click

		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));

		WebElement quit = driver.findElement(By.xpath("//span[text()='Quit']"));
		act1.contextClick(rightclick).click(quit).build().perform();
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		String str = alert.getText();
		System.out.println(" " + str);

		alert.accept();
		Thread.sleep(3000);
		System.out.println("operation complete");

		driver.close();

	}

}
