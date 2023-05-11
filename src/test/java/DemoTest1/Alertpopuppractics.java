package DemoTest1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopuppractics {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@name='alertbox']")).click();

		Alert a = driver.switchTo().alert();

		Thread.sleep(3000);
		String text = a.getText();
		System.out.println("text present inside popup:" + text);
		a.accept();
		System.out.println("click on ok button:");
		System.out.println("---------------------------------------------------------");
		
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		
		Alert a1=driver.switchTo().alert();
		Thread.sleep(3000);
		String b=a1.getText();
		System.out.println("text inside popup:"+b);
		a1.dismiss();
		System.out.println("we click on cancel button:");
		System.out.println("---------------------------------------------------------");
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Alert a2=driver.switchTo().alert();
		Thread.sleep(3000);
		String text1=a2.getText();
		System.out.println("text inside popup:"+text1);
		a2.accept();
		System.out.println("we click on ok button:");
		System.out.println("---------------------------------------------------------");

		
		
		
		
		
		
		driver.close();

	}

}
