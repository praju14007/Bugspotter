package Dailymockpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice1 {
	//1. open orangeHRM site
//	2. capture title
//	3. open facebook site
//	4. capture title
//	5. navigate back
//	6. capture title
//	7. navigate forward
//	8. capture title

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rnarode\\eclipse-workspace\\PrajaktaAutomation\\Resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable -extension");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
        String title=driver.getTitle();	
        System.out.println("Get title :" +title);
        
        String url=driver.getCurrentUrl();
        System.out.println("get url :" +url);
        
        driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(3000);

        String FBtitle=driver.getTitle();
        System.out.println("title of fb:" +FBtitle);
		Thread.sleep(3000);
          
		driver.close();
	}

}
