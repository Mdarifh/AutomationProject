package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project.Base;

public class TestTwo extends Base{
	public WebDriver driver;
	@Test
	public void testTwo() throws IOException, InterruptedException {
		System.out.println("Inside Test Two");
		driver = initializeDriver();
		driver.get("https://www.youtube.com/watch?v=tXo2vO5QNAw&t=4490s");
		Thread.sleep(2000);
		driver.close();
		
	}

}
