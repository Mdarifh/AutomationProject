package Day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG3 {

	
	@BeforeMethod
	public void RegistrationPage() {
		System.out.println("User Registration page");
	}
	
	@Test(priority=2)
	public void ValidLoginCredential() {
		System.out.println("Valid Login Credential page");
	}
	@Test(priority=3,enabled = false)
	public void HomePage() {
		System.out.println("Home Page Visibility");
	}
	@Test(priority=4)
	public void AddBeneficiary() {
		System.out.println("Adding a Beneficiary");
	}
	@Test(priority=5,enabled = false)
	public void CarLoan() {
		System.out.println("Car Loan Facility");
	}
	@Test(priority=6)
	public void HomeLoan() {
		System.out.println("Home Loan Facility");
	}
	@Test(priority=7)
	public void EducationLoan() {
		System.out.println("Education Loan Facility");
	}
	@Test(priority=8)
	public void ValidatingBeneficiary() {
		System.out.println("Validating a Beneficiary");
	}
	@AfterMethod
	public void LogOut() {
		System.out.println("User Logout");
	}
	
}
