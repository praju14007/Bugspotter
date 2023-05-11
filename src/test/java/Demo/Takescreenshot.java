package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
           WebDriverManager.chromedriver().setup();
           WebDriver driver =new ChromeDriver();
           driver.get("https://www.flipkart.com/");
           driver.manage().window().maximize();
           Thread.sleep(3000);
           // for full page ScreenShot 
           TakesScreenshot ts=(TakesScreenshot)driver;
           File src=ts.getScreenshotAs(OutputType.FILE);
           File destination =new File("C:\\Users\\rnarode\\Desktop\\prajaktadoc\\filpkart.png");
           FileUtils.copyFile(src, destination);
           System.out.println("Screenshot Captured");
           driver.close();
           
	}

}
