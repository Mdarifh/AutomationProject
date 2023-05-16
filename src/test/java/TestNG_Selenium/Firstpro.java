package TestNG_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstpro {
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	
	
	@Test(priority=1,groups="Test")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2,groups="Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		
	}
	@Test(priority=3,groups="Mail")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("Test3");
	}
	@Test(priority=7,groups="Test")
	public void test4() {
		System.out.println("Test4");
	}
	@Test(priority=8,groups="Test")
	public void test5() {
		System.out.println("Test5");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
