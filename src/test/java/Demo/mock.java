package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mock {

	public static void main(String[] args) throws InterruptedException, IOException {
		// https://nxtgenaiacademy.com/alertandpopup/

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Actions act= new Actions(driver);
		WebElement wb = driver.findElement(By.id("box1"));
		WebElement wb1 = driver.findElement(By.id("box101"));
		Actions act = new Actions(driver);

		act.dragAndDrop(wb, wb1).build().perform();
		Thread.sleep(3000);

		WebElement box2 = driver.findElement(By.id("box2"));
		WebElement wb2 = driver.findElement(By.id("box102"));

		act.dragAndDrop(box2, wb2).build().perform();
		System.out.println("Execution end");

		WebElement box3 = driver.findElement(By.id("box3"));
		WebElement wb3 = driver.findElement(By.id("box103"));

		act.dragAndDrop(box3, wb3).build().perform();
		System.out.println("Execution end");

		WebElement ad = driver.findElement(By.id("dropContent"));

		act.dragAndDrop(wb, ad).build().perform();
		System.out.println("Execution end");

		act.dragAndDrop(box2, ad).build().perform();
		System.out.println("Execution end");

		act.dragAndDrop(box3, ad).build().perform();

		System.out.println("Execution end");
		
		TakesScreenshot ts=(TakesScreenshot)driver;

		File src=ts.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\rnarode\\eclipse-workspace\\bugspotter\\Screenshot\\dragdrop4.png");
		FileUtils.copyFile(src,desc );
		//act.clickAndHold("box3").release("ad").build().perform();
        //act.keyDown(Keys.CONTROL).sendKeys(keys.home).build().perform();  
		//act.keyDown(Keys.CONTROL).sendKeys(keys.end).build().perform();
		 driver.close();

	}

}
