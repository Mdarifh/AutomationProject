package temp.product.cscart.utiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;


public class BrowserManager {
	
	public static WebDriver getDriver(String Type,String url) {
		WebDriver driver;
		if(Type.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(Type.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else if(Type.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}else {
			Assert.assertTrue(false,"No Browser Type Sent");
		}
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("Navigated to Browser:" + Type + "URL:" +url,true);
		driver.get(url);
		return driver;
		
	

	
	}

	
}
