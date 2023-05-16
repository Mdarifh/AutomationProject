package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class RegistrationPage {

	
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
		    
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Arif");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Hussain");
			driver.findElement(By.xpath("//textarea[contains(@ng-model,'Adress')]")).sendKeys("Hello How Are You Dear!.");
			driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("mdimranzama3110@gmail.com");
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7061651398");
			driver.findElement(By.xpath("//input[@value='Male']")).click();
			driver.findElement(By.id("checkbox1")).click();
			
			driver.findElement(By.xpath("//div[@id='msdd']")).click();
			driver.findElement(By.xpath("//div[@id='msdd']/../div[2]/ul/li/a[contains(text(),'Danish')]")).click();
			
			Select skill = new Select(driver.findElement(By.id("Skills")));
			skill.selectByVisibleText("CSS");
			
			Select country = new Select (driver.findElement(By.id("countries")));
			country.selectByVisibleText("India");
			
			
			Select year = new Select(driver.findElement(By.id("yearbox")));
			year.selectByVisibleText("1999");
			
			
			Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
			month.selectByVisibleText("septemper");
			
			Select day = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
			day.selectByVisibleText("20");
			
			driver.findElement(By.id("firstpassword")).sendKeys("Huss@1n");
			driver.findElement(By.id("secondpassword")).sendKeys("Huss@1n");
			driver.findElement(By.id("imagesrc")).click();
			//driver.findElement(By.id("Botton1")).click();
			driver.findElement(By.id("submitbtn")).submit();
			
		}

	}


