package sandhyaUtility;

import java.io.IOException;
import java.time.Duration;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	LoginPage loginPage;
	@BeforeClass
	public void launchBrowser() throws IOException, ParseException {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
//	@BeforeMethod
//	public void openApp() throws IOException, ParseException {
//		JsonFile json = new JsonFile();
//		//using Loginpage pom class
//		 loginPage = new LoginPage(driver);
//		driver.get(json.readDataFromJson("url"));
//        loginPage.getuName().sendKeys(json.readDataFromJson("un"));
//        loginPage.getpWd().sendKeys(json.readDataFromJson("pw"));
//        loginPage.getSubmitButton().click();
//
//	}

}
