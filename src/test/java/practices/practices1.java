package practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practices1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement dropdwn=driver.findElement(By.xpath("//p/select"));
		Select sel=new Select(dropdwn);
		
		sel.selectByVisibleText("Argentina");
		WebElement a=sel.getFirstSelectedOption();
		String b=a.getText();
		System.out.println("value inside dropdwn:"+b);
		List<WebElement> list=sel.getOptions();
		int c=list.size();
		System.out.println("Country present inside dropdown"+c);
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
