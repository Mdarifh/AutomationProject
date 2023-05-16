package Day1;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class IContact {
	@Test(priority=1)
	public void SetUp(ITestContext context) {
		System.out.println("This is the Setup of Our New Laptop");
		context.setAttribute("Window10", "Dell");
	}
	
	@Test(priority=2,dependsOnMethods = "SetUp")
	public void Logic(ITestContext context) {
		System.out.println("This is the logical function of our new laptop");
		String OperatingSystem = (String)context.getAttribute("Window10");
		System.out.println("The SetUp for the Operating System for Dell Laptop is:" +OperatingSystem);
		context.setAttribute("Complex", "DevOps + Agile");
		
	}
	@Test(priority=3,dependsOnMethods = {"SetUp","Logic"})
	public void exit(ITestContext context) {
		System.out.println("This is exit of new Laptop");
		String OperatingSystem = (String)context.getAttribute("Window10");
		System.out.println("The SetUp for the Operating System for Dell Laptop is:" +OperatingSystem);
		String LogicComplexcity = (String)context.getAttribute("Complex");
		System.out.println("The Logic Complexcity even at the exit point is: "+LogicComplexcity);
	}

}
