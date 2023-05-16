package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import Project.Base;

import pageObject.AccountPage;
import pageObject.LandingPage;
import pageObject.LoginPage;



public class LoginTest extends Base {
	Logger log;
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void OpenApplication() throws IOException {
		log = LogManager.getLogger(LoginTest.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");
	}
	
	@Test(dataProvider = "getLoginData")
	public void Login(String email, String password, String expectedResult) throws IOException, InterruptedException {
		
		
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		log.debug("Clicked on My Account dropdown");
		landingPage.loginOption().click();
		log.debug("Clicked on login option");
		
		Thread.sleep(3000);
		
		LoginPage loginPage= new LoginPage(driver);
		loginPage.emailAddressField().sendKeys(email);
		log.debug("Email addressed got entered");
		loginPage.passwordField().sendKeys(password);
		log.debug("password got entered");
		loginPage.loginButton().click();
		log.debug("Click on login Button");
		
		
		
		AccountPage accountPage = new AccountPage(driver);
		String actualResult = null;
		try {
			if(accountPage.editAccountinfomationOption().isDisplayed()) {
				log.debug("User got logged in");
				actualResult="Success";
			
			}
		} catch (Exception e) {
			
			log.debug("User didn't log in");
			actualResult="Failure";
		}
		if(actualResult.equals(expectedResult)) {
			
			log.info("Login Test got passed");
			
		}else {
			
			log.error("Login Test got failed");
			}
		}

	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		log.debug("Browser got closed");
		
	}
	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data = {{"mdimranzama3110@gmail.com","Huss@1narif","Successful"},{"mdarifhussain3210@gmail.com","Hussainarif","Failure"}};
		return data;
	}
}
