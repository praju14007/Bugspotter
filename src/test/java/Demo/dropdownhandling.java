package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownhandling {
	
	public static void main(String args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://js.devexpress.com/Demos/WidgetsGallery/Demo/DropDownBox/MultipleSelection/jQuery/Light/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();          
	}

}

