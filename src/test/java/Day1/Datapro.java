package Day1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;



public class Datapro {
	
	@DataProvider
	public static Object[][]getData(Method name){
		
		Object[][] data = new Object[4][4];
		System.out.println("Test Case which has the method is: "+name.getName());
		
		data[0][0] = "Username";
		data[0][1] = "Password";
		data[0][2] = 87897528;
		data[0][3] = "Chrome";
	
		data[1][0] = "Username1";
		data[1][1] = "Password1";
		data[1][2] = 87797528;
		data[1][3] = "Opera";
		
		data[2][0] = "Username2";
		data[2][1] = "Password2";
		data[2][2] = 87897500;
		data[2][3] = "Firefox";
		
		data[3][0] = "Username3";
		data[3][1] = "Password3";
		data[3][2] = 87897411;
		data[3][3] = "UC Browser";
		
		return data;
		
	}

}
