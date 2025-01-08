package testCase;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC001_UserLoginTest extends BaseClass {

	
	@Test

	public void Verify_Login() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		
		homePage.userName("rahulshettyacademy");
		homePage.userPassword("learning");
	


	}
	
}
