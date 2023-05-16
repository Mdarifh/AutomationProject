package Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project {
	

		@BeforeSuite
		public void beforesuite() {
			System.out.println("This is Before Suite Annotation");
		}
		
		@BeforeTest
		public void beforetest() {
			System.out.println("This is Before test Annotation");
		}
		
		@BeforeClass
		public void beforeclass() {
			System.out.println("This is Before class Annotation");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("This is Before Method Annotation");
		}
		
		@Test
		public void test() {
			System.out.println("This is Test Annotation");
		}
		@AfterMethod
		public void aftermethod() {
			System.out.println("This is After Method Annotation");
		}
		@AfterClass
		public void afterclass() {
			System.out.println("This is After class Annotation");
		}
		
		@AfterTest
		public void aftertest() {
			System.out.println("This is After Test Annotation");
		}
		
		@AfterSuite
		public void aftersuite() {
			System.out.println("This is After Suite Annotation");
		}

		

	}


