package testCase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {

	public WebDriver driver;
	public Properties p;
	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String br) throws IOException {

		FileReader file = new FileReader("C://Users//ketanh//eclipse-workspace//EcommerceE2E//src//test//resources//config.properties");
		p = new Properties();
		p.load(file);

		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.print("Brower name is invalid");
			return;
		}

		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//driver.get(p.getProperty("url"));
		driver.manage().window().maximize();

	}

	@AfterClass
	public void teardown() {
		// driver.close();
	}

}
