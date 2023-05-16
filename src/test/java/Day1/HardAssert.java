package Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void Cretical() {
		 String ExpectedOutput = "We are learning Automation Testing in English";
		 String ActualOutput = "We are learning Automation Testing in English and Hindi";
		 Assert.assertEquals(ActualOutput, ExpectedOutput);
	}
	
	@Test
	public void High() {
		boolean b1 = 1<2;
		boolean b2 = 3>2;
		Assert.assertTrue(b1!=b2,"2 is never greater than 3");
	}
	
	@Test
	public void Medium() {
		
	}
	
	@Test
	public void Low() {
		
	}
		
	
}
