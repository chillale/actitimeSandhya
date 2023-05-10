package vtigerWithPom;

import static collectionsRepository.HashMapTest.readDataFromHashMap;

import org.testng.annotations.Test;

import genericUtility1.BaseClass;
import objectRepository.ContactPageTest;
import objectRepository.ContactsDetailsPageTest;

public class CreateContact3Test extends BaseClass{
	@Test
	public void createCon() throws Throwable {
		ContactPageTest contactPageTest = new ContactPageTest(driver);
		contactPageTest.getContactsBtn().click();
		ContactsDetailsPageTest contactDetailsPageTest = new ContactsDetailsPageTest(driver);
		contactDetailsPageTest.getCreateContactBtn().click();
		contactDetailsPageTest.getFirstNameType().sendKeys(readDataFromHashMap().get("firstNameType"));
		contactDetailsPageTest.getFirstName().sendKeys(readDataFromHashMap().get("firstName"));
		contactDetailsPageTest.getLastName().sendKeys("Sakaray");
		contactDetailsPageTest.getSaveBtn().click();
		Thread.sleep(2000);
	}

}
