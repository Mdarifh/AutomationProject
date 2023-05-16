package temp.product.cscart.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import temp.product.cscart.po.PageObject;
import temp.product.cscart.utiles.BrowserManager;

public class TCase_HealthCheck {
	String url = "";
	@Test
	public void testCase_01_Cscart_search() {
		WebDriver driver = BrowserManager.getDriver("chrome", url);
		
		
		
		
		PageObject ob = PageFactory.initElements(driver, PageObject.class);
		ob.SearchAProduct("computer");
		
	}
}
