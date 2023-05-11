package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopup1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("alertbox")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(" text in alert : "+text);
		a.accept();
		System.out.println("click on alertbox");
		Thread.sleep(3000);
		
		driver.findElement(By.name("confirmalertbox")).click();
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.dismiss();
		System.out.println("click on cancel");
		Thread.sleep(3000);
		
		driver.findElement(By.name("promptalertbox1234")).click();
		Alert a2=driver.switchTo().alert();
		System.out.println(a2.getText());
		Thread.sleep(3000);

		a2.sendKeys("Yes");
		Thread.sleep(1000);

		a2.accept();
		System.out.println("click on button: "+a2);
		Thread.sleep(3000);
         
		
		
		
		driver.close();
	}

}
