package TestCase;

import org.testng.annotations.Test;

import Day1.Datapro;

public class MultipleTestCase {
	
	@Test(priority=1,dataProviderClass =Datapro.class,dataProvider = "getData")
	public void launchurl(String username,String password,int mobile,String Browser) {
		System.out.println(username + "--------" + password +"--------" + mobile +"--------" + Browser);
	}
	
	@Test(priority=2,dataProviderClass =Datapro.class,dataProvider = "getData")
	public void enterCredentials(String username,String password,int mobile,String Browser) {
		System.out.println(username + "--------" + password +"--------" + mobile +"--------" + Browser);
		
	}
	@Test(priority=3,dataProviderClass =Datapro.class,dataProvider = "getData")
	public void validateHomePage(String username,String password,int mobile,String Browser) {
		System.out.println(username + "--------" + password +"--------" + mobile +"--------" + Browser);
		
	}
	@Test(priority=4,dataProviderClass =Datapro.class,dataProvider = "getData")
	public void logout(String username,String password,int mobile,String Browser) {
		System.out.println(username + "--------" + password +"--------" + mobile +"--------" + Browser);
		
	}

}
