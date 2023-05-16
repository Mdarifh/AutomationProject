package Day2;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class CookiesHeader {
	
	@Test(priority=1)
	
	void testcookies() {
		given()
			
			
		.when()
			.get("https://www.google.com/")
			
		
		.then()
			.cookie("AEC","")
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority=2)
	void testcookiesinfo() {
		
		Response res=given()
				
			
			
		.when()
			.get("https://www.google.com/");
			
			String cookies_value=res.getCookie("AEC");
			System.out.println("Value of Cookies is===>"+cookies_value);
			
		
	}


}
