package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageTest {
	public WebDriver driver;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsBtn;
	
	public ContactPageTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactsBtn() {
		return contactsBtn;
	}
	

}
