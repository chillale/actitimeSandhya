package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPageTest {
	WebDriver driver;
	
	@FindBy(xpath = "themes/softed/images/btnL3Add.gif")
	private WebElement createOrganizationBtn;
	
	public OrganizationsPageTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrganizationBtn() {
		return createOrganizationBtn;
	}
	

}
