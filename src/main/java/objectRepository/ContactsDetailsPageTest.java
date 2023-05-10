package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsDetailsPageTest {
	WebDriver driver;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createContactBtn;
	
	@FindBy(name = "salutationtype")
	private WebElement firstNameType;
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement organizationPlusBtn;
	
	@FindBy(name = "search_text")
	private WebElement searchTextTf;
	
	@FindBy(name = "search")
	private WebElement searchNowBtn;
	
	@FindBy(id = "1")
	private WebElement selectOrganization;
	
	@FindBy(name = "leadsource")
	private WebElement leadSourceType;
	
	@FindBy(name = "title")
	private WebElement titleTf;
	
	@FindBy(name = "department")
	private WebElement departmentTf;
	
	@FindBy(name = "email")
	private WebElement emailTf;
	
	@FindBy(name = "assistant")
	private WebElement assistantTf;
	
	@FindBy(name = "imagename")
	private WebElement imageFile;
	
	@FindBy(name = "button")
	private WebElement saveBtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	

	public ContactsDetailsPageTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateContactBtn() {
		return createContactBtn;
	}

	public WebElement getFirstNameType() {
		return firstNameType;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getOrganizationPlusBtn() {
		return organizationPlusBtn;
	}

	public WebElement getSearchTextTf() {
		return searchTextTf;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}

	public WebElement getSelectOrganization() {
		return selectOrganization;
	}

	public WebElement getLeadSourceType() {
		return leadSourceType;
	}

	public WebElement getTitleTf() {
		return titleTf;
	}

	public WebElement getDepartmentTf() {
		return departmentTf;
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getAssistantTf() {
		return assistantTf;
	}

	public WebElement getImageFile() {
		return imageFile;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	

}
