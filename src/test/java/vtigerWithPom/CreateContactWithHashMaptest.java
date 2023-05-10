package vtigerWithPom;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import collectionsRepository.HashMapTest;
import genericUtility1.PropertyFile;
import genericUtility1.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactPageTest;
import objectRepository.ContactsDetailsPageTest;
import objectRepository.LoginPageTest;

public class CreateContactWithHashMaptest {
	@Test
	public void createContact() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		PropertyFile propertyFile = new PropertyFile();
		String uRL=propertyFile.readDataFromPropertyFile("url");
		String uName=propertyFile.readDataFromPropertyFile("username");
		String pWord=propertyFile.readDataFromPropertyFile("password");
		
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		driver.get(uRL);
		webDriverUtility.maximize();
		webDriverUtility.implicitlyWait();
		LoginPageTest loginPageTest = new LoginPageTest(driver);
		loginPageTest.loginPageDetails(uName, pWord);
		
		ContactsDetailsPageTest contactDetailsPageTest = new ContactsDetailsPageTest(driver);
	    ContactPageTest contactPageTest =  new ContactPageTest(driver);
	    contactPageTest.getContactsBtn().click();
	    contactDetailsPageTest.getCreateContactBtn().click();
	    String firstNameType=HashMapTest.readDataFromHashMap().get("firstNameType");
		String firstName=HashMapTest.readDataFromHashMap().get("firstName");
		String organizationName=HashMapTest.readDataFromHashMap().get("organizationNameSearchTf");
		String leadSrcType=HashMapTest.readDataFromHashMap().get("leadSourceType");
		String titleTf=HashMapTest.readDataFromHashMap().get("titleTf");
		String departmentTf = HashMapTest.readDataFromHashMap().get("department");
		
	    contactDetailsPageTest.getFirstNameType().sendKeys(firstNameType);
	    contactDetailsPageTest.getFirstName().sendKeys(firstName);
	    contactDetailsPageTest.getOrganizationPlusBtn().click();
	    String pWindow=webDriverUtility.switchToParent();
	   
	    contactDetailsPageTest.getSearchTextTf().sendKeys(organizationName);
	    contactDetailsPageTest.getSearchNowBtn().click();
	    
	    
		
		
	}

}
