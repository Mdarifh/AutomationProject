package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project.Base;

public class TestThree extends Base {
	public WebDriver driver;
	@Test
	public void testThree() throws IOException, InterruptedException {
		System.out.println("Inside Test Three");
		driver = initializeDriver();
		driver.get("https://www.netflix.com/browse");
		Thread.sleep(2000);
		driver.close();
	}

}
