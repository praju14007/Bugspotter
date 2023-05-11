package Dailymockpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mock1 {

	public static void main(String[] args) throws InterruptedException {
		// create static table
		// count row,column
		// print data

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/rnarode/Desktop/prajaktadoc/Automation%20Notes/StaticTable.html");
		Thread.sleep(3000);

		List<WebElement> table = driver.findElements(By.name("BookTable"));
		int a = table.size();
		System.out.println("size of table:" + a);
//		String wb = table.getText();
		for (WebElement abc : table) {
			String wb = abc.getText();
			System.out.println("data inside static table" + wb);
		}

		System.out.println("----------------------------------------------------");

		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int b = row.size();
		System.out.println("size of row" + b);
		for (WebElement q : row) {
			String wq = q.getText();
			System.out.println("Data inside row:" + wq);
		}
		System.out.println("----------------------------------------------------");

		List<WebElement> head = driver.findElements(By.tagName("th"));
		int c = head.size();
		System.out.println("head no" + c);
		for (WebElement h : head) {
			String hd = h.getText();
			System.out.println(hd);
		}
		System.out.println("----------------------------------------------------");

		List<WebElement> r = driver.findElements(By.tagName("td"));
		int d = r.size();
		System.out.println("data size:" + d);
		for (WebElement cell : r) {
			String p = cell.getText();
			System.out.println(p);
		}
		System.out.println("----------------------------------------------------");
		driver.close();

	}

}
