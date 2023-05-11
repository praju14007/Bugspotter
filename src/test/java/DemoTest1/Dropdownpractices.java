package DemoTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownpractices {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));

		Select sel = new Select(day);
		sel.selectByVisibleText("1");
		Thread.sleep(3000);
		WebElement wb = sel.getFirstSelectedOption();
		String a = wb.getText();
		System.out.println(" day selected inside dropdown: " + a);
		List<WebElement> ls = sel.getOptions();
		int b = ls.size();
		System.out.println("total Day inside Dropdown are:- " + b);
		System.out.println("--------------------------------------------------------- ");

		// for month
		WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));

		Select sel1 = new Select(Month);
		sel1.selectByValue("5");
		Thread.sleep(3000);
		WebElement wb1 = sel1.getFirstSelectedOption();
		String c = wb1.getText();
		System.out.println("Month selected inside dropdown:" + c);
		List<WebElement> ls1 = sel1.getOptions();
		int d = ls1.size();
		System.out.println("total month present inside dropdown:" + d);
		System.out.println("------------------------------------------------");
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select sel2=new Select(year);
		sel2.selectByVisibleText("2000");
		Thread.sleep(3000);
		WebElement wb2=sel2.getFirstSelectedOption();
		String e=wb2.getText();
		System.out.println("year selected in dropdown:"+e);
		
		List<WebElement> ls2=sel2.getOptions();
		int f=ls2.size();
		System.out.println("total year inside dropdown:"+f);
		System.out.println("------------------------------------------------");

		
		
		
		
		
		
		
		

		driver.close();
	}

}
