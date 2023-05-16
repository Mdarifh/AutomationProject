package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {
	public static String browser = "FireFox";
		public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		
		
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String sourcePage = driver.getPageSource();
		System.out.println(sourcePage);
		
		driver.navigate().to("https://www.flipkart.com");
		
		
		driver.quit();
	
		
		
		

	}

}
