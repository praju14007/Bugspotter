package ActionClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropAndDrag {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement box1 = driver.findElement(By.id("box1"));
		WebElement box2 = driver.findElement(By.id("box2"));
		WebElement box3 = driver.findElement(By.id("box3"));
		WebElement box4 = driver.findElement(By.id("box4"));
		WebElement box5 = driver.findElement(By.id("box5"));
		WebElement box6 = driver.findElement(By.id("box6"));
		WebElement box7 = driver.findElement(By.id("box7"));

		WebElement box01 = driver.findElement(By.id("box101"));
		WebElement box02 = driver.findElement(By.id("box102"));
		WebElement box03 = driver.findElement(By.id("box103"));
		WebElement box04 = driver.findElement(By.id("box104"));
		WebElement box05 = driver.findElement(By.id("box105"));
		WebElement box06 = driver.findElement(By.id("box106"));
		WebElement box07 = driver.findElement(By.id("box107"));

		Actions action = new Actions(driver);

		action.dragAndDrop(box1, box01).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box2, box02).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box3, box03).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box4, box04).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box5, box05).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box6, box06).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box7, box07).build().perform();
		Thread.sleep(3000);

		System.out.println("Execution End");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rnarode\\eclipse-workspace\\bugspotter\\Screenshot\\dropdrag2.png");

		FileUtils.copyFile(src, destination);
		System.out.println("ScreenShot capture:1");

		WebElement capitals = driver.findElement(By.id("capitals"));

		action.dragAndDrop(box1, capitals).build().perform();
		Thread.sleep(1000);

		action.dragAndDrop(box2, capitals).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box3, capitals).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box4, capitals).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box5, capitals).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box6, capitals).build().perform();
		Thread.sleep(1000);
		action.dragAndDrop(box7, capitals).build().perform();
		Thread.sleep(3000);

		System.out.println("Excecution end");

		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\rnarode\\eclipse-workspace\\bugspotter\\Screenshot\\drags2.png");

		FileUtils.copyFile(src1, dest);
		Thread.sleep(3000);
		System.out.println("ScreenShot capture:2");

		driver.close();

	}

}
