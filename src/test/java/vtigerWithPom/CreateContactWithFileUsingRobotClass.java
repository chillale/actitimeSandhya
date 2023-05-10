package vtigerWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static collectionsRepository.HashMapTest.*;
import genericUtility1.PropertyFile;
import genericUtility1.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactPageTest;
import objectRepository.ContactsDetailsPageTest;
import objectRepository.LoginPageTest;

public class CreateContactWithFileUsingRobotClass {
	@Test
	public void createContactWithFileTest() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		PropertyFile propertyFile = new PropertyFile();
		String uRL=propertyFile.readDataFromPropertyFile("url");
		String uName=propertyFile.readDataFromPropertyFile("username");
		String pWord=propertyFile.readDataFromPropertyFile("password");
		
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		webDriverUtility.maximize();
		webDriverUtility.implicitlyWait();
		
		driver.get(uRL);
		LoginPageTest loginPageTest = new LoginPageTest(driver);
		loginPageTest.loginPageDetails(uName, pWord);
		
		ContactPageTest contactPageTest = new ContactPageTest(driver);
		contactPageTest.getContactsBtn().click();
		
		ContactsDetailsPageTest contactDetailsPageTest = new ContactsDetailsPageTest(driver);
		contactDetailsPageTest.getCreateContactBtn().click();
		contactDetailsPageTest.getFirstNameType().sendKeys(readDataFromHashMap().get("firstNameType"));
		
	
		
		
	}

}
