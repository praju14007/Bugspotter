package iFram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get(
				"https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame(0);
		System.out.println("switching window first topleft");
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		Thread.sleep(3000);
		System.out.println("**click on first url****");

		driver.navigate().refresh();
//  		switch to top frame
		System.out.println("****switching to topframe***");

		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		Thread.sleep(3000);
		System.out.println("switching window to last frame");

		// driver.findElement(By.linkText("Overview")).click();
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(3000);
		System.out.println("click on the first url");

		System.out.println("*****Execution done*****");
		driver.close();

	}

}
