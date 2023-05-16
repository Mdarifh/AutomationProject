package temp.product.cscart.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

public class PageObject {
	WebDriver driver;
	
	public PageObject(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.NAME,using = "hint_q")
	private WebElement  textbox_search;
	@FindBy(how = How.NAME,using = "ty-search-magnifier" )
	private WebElement btn_search;
	
	//Method
	public void SetSearchTextBox(String arg) {
		textbox_search.sendKeys(arg);
		Reporter.log("Product entered in search Box:" +arg,true);
	}
	public void ClickSearchButton() {
		btn_search.click();
		Reporter.log("Search Box Button Clicked:",true);
	}
	//Business Method
	public void SearchAProduct(String arg) {
		SetSearchTextBox(arg);
		ClickSearchButton();
		String actual = driver.getTitle();
		String expected = "Search results";
		Reporter.log("Able to search for the product Successfully.Product:" +arg,true);
		Assert.assertEquals(actual, expected,"Application is not able to search product:" + arg);
		
		
	}
	
	
}
