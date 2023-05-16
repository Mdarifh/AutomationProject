package stepDefination;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Project.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AccountPage;
import pageObject.LandingPage;
import pageObject.LoginPage;


public class Login extends Base {
	WebDriver driver;
	LandingPage landingPage;
	LoginPage loginPage;
	AccountPage accountPage;
	
		@Given("^Open Any Browser$")
		public void open_any_browser() throws IOException  {
			driver = initializeDriver();
		}
		
		@And("^Navigate to Login Page$")
	    public void navigate_to_login_page() throws InterruptedException {
			driver.get(prop.getProperty("url"));
			landingPage = new LandingPage(driver);
			landingPage.myAccountDropdown().click();
			landingPage.loginOption().click();
			Thread.sleep(3000);
	       
	    }
	
	 	@When("^User enter username as \"([^\"]*)\" and password as \"([^\"]*)\" into the feilds$")
	    public void user_enter_username_as_something_and_password_as_something_into_the_feilds(String email, String password) {
	 		loginPage = new LoginPage(driver);
	 		loginPage.emailAddressField().sendKeys(email);
	 		loginPage.passwordField().sendKeys(password);
	    }
	 	
	 	@And("^User Click on login button$")
	    public void user_click_on_login_button() {
	 		
	    	loginPage.loginButton().click();
	    }

	    @Then("^Verify user is able to Successfully Login$")
	    public void verify_user_is_able_to_successfully_login() {
	    	accountPage = new AccountPage(driver);
	    	Assert.assertTrue(accountPage.editAccountinfomationOption().isDisplayed());
	    }

	    
	    @After
	    public void closeBrowser() {
	    	driver.close();
	    }
	    


}
