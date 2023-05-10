package vtigerWithPom;

import org.testng.annotations.Test;
import static collectionsRepository.HashMapTest.*;
import genericUtility1.BaseClass;
import objectRepository.ContactPageTest;
import objectRepository.ContactsDetailsPageTest;

public class CreateContactTest extends BaseClass{
	@Test
	public void createContact() throws Throwable {
		ContactPageTest contactPageTest = new ContactPageTest(driver);
		contactPageTest.getContactsBtn().click();
		ContactsDetailsPageTest contactDetailsPageTest = new ContactsDetailsPageTest(driver);
		contactDetailsPageTest.getCreateContactBtn().click();
		contactDetailsPageTest.getFirstNameType().sendKeys(readDataFromHashMap().get("firstNameType"));
		contactDetailsPageTest.getFirstName().sendKeys(readDataFromHashMap().get("firstName"));
		contactDetailsPageTest.getLastName().sendKeys("chillale");
		contactDetailsPageTest.getSaveBtn().click();
		Thread.sleep(2000);
	}

}
