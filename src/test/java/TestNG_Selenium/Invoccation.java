package TestNG_Selenium;

import org.testng.annotations.Test;

public class Invoccation {
	@Test(invocationCount = 10)
	public void PrintName() {
		System.out.println("Md Arif Hussain");
	}

}
