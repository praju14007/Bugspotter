package DemoTest1;



import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {

	public static void main(String[] args) throws InterruptedException {
		
		//open browser and url navigate back refresh close 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("maximise window");


		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("bcak window");


		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.close();
		System.out.println("close window");
	}

}
