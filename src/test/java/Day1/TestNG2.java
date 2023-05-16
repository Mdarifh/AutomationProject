package Day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@BeforeMethod
	public void UserRegistration() {
		System.out.println("User is getting registered");
		
	}
	@BeforeMethod
	public void UserRegistration1() {
		System.out.println("User is getting registered1");
		
	}
	@BeforeMethod
	public void UserRegistration2() {
		System.out.println("User is getting registered2");
		
	}
	
	@Test
	public void UserLogin() {
		System.out.println("User is able to Login");
	}
	@Test
	public void UserMoneyControl() {
		System.out.println("User is able to transfer found to another account");
	}
	@Test
	public void UserWithdrawalMoney() {
		System.out.println("User able to Withdrawl the Money");
	}
	
	@AfterMethod
	public void UserLogout() {
		System.out.println("User is able to LogOut");
	}
	@AfterMethod
	public void UserLogout1() {
		System.out.println("User is able to LogOut1");
	}
	@AfterMethod
	public void UserLogout2() {
		System.out.println("User is able to LogOut2");
	}
}
