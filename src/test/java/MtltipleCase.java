import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MtltipleCase {
	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();
	
	@Test(priority=1,dataProvider = "NinjaData",dataProviderClass = Data.class)
	
	public static void LoginTest(String username,String password)  {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.tutorialsninja.com/demo/");
		
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
		softassert.assertAll();
		
		driver.quit();
		
	}
	@Test(priority=2, dataProvider = "RediffData",dataProviderClass = Data.class)
	public static void rediffLoginTest(String username,String password)  {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.rediff.com/cgi-btn/login.cgi");
		
		
		driver.findElement(By.id("login1")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		softassert.assertTrue(driver.findElement(By.linkText("a.rd_logout")).isDisplayed());
		
		softassert.assertAll();
		
		driver.quit();
		
	}
}
