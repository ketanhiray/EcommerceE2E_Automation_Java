package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement txtUserName;

	@FindBy(css = "#password")
	WebElement txtUserPassword;

	public void userName(String uname) {

		txtUserName.sendKeys(uname);

	}

	public void userPassword(String password) {

		txtUserPassword.sendKeys(password);
	}

}
