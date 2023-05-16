package tests;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Project.Base;

public class TestFour extends Base {
	public WebDriver driver;
	@Test
	
	public void testFour() throws IOException, InterruptedException {
		System.out.println("Inside Test Four");
		driver = initializeDriver();
		driver.get("https://bollyflix.blue/download-vagabond-season-1-web-series/");
		Thread.sleep(2000);
		Assert.assertTrue(false);
	}
		
		@AfterMethod
		public void closingBrowser() {
			driver.close();
		}
		
	}


