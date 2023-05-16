package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Parallel2 {
	WebDriver driver;
	@Test(threadPoolSize = 1,invocationCount = 1)
	public void TestCase1() {
		System.out.println("This is Output For TestCase1: "+Thread.currentThread().getName());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void TestCase2() {
		System.out.println("This is Output for TestCase2: "+Thread.currentThread().getId());
		System.out.println("This is Output For TestCase1: "+Thread.currentThread().getName());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
	}
	@Test
	public void TestCase3() {
		System.out.println("This is Output for TestCase3: "+Thread.currentThread().getId());
		System.out.println("This is Output for TestCase2: "+Thread.currentThread().getId());
		System.out.println("This is Output For TestCase1: "+Thread.currentThread().getName());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
	}
}
