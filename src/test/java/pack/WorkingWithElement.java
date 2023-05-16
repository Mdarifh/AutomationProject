package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithElement {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-deno/");
		driver.manage().window().fullscreen();
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.name("firstname")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		driver.findElement(By.xpath("//*[@id=\"field\"]/div/input")).getCssValue("text-transfrom");
		driver.findElement(By.xpath("//*[@id=\"field\"]/div/input")).getSize();
		driver.findElement(By.xpath("//*[@id=\"field\"]/div/input")).getLocation();
		driver.findElement(By.xpath("//*[@id=\"field\"]/div/input")).getText();
		driver.findElement(By.xpath("//*[@id=\"field\"]/div/input")).getTagName();
		driver.findElement(By.xpath("//*[@id=\"field\"]/div/input")).isDisplayed();
		driver.findElement(By.xpath("//*[@id=\"field\"]/div/input")).isEnabled();
		driver.findElement(By.xpath("//*[@id=\"field\"]/div/input")).isSelected();
		
	}

	

}
