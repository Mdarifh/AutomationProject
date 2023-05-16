package Day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG4 {
	
	public static String browser = "Chrome";
	public static WebDriver driver;
	
	@BeforeTest
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mycarhelpline.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		}
	
	@Test(priority=1,enabled = true)
	public void LandingPage() {
		System.out.println(driver.getCurrentUrl());
		String CurrentURL = "https://www.mycarhelpline.com/";
		if (CurrentURL.equals("https://www.mycarhelpline.com/")) {
			System.out.println("Test Case Landing Page is PASS");
		}
		else {
			System.out.println("Test Case is FAIL");
		}
		Assert.fail("Deliberately Failing");
	}
	@Test(priority=2,enabled = true,dependsOnMethods = "LandingPage",alwaysRun = true)
	public void Calculator() throws InterruptedException {
		driver.findElement(By.linkText("Calculator")).click();
		Thread.sleep(2000);
	}
	@Test(priority=3,dependsOnMethods ={"LandingPage","Calculator"})
	public void Reviews() throws InterruptedException {
		driver.findElement(By.linkText("Reviews")).click();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = "LandingPage")
	public void ReturnToHome() {
		driver.findElement(By.linkText("Home")).click();

	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}

}
