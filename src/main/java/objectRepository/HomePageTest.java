package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageTest {
	WebDriver driver;
	
	@FindBy(linkText = "Leads")
	private WebElement leadsBtn;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationsBtn;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsBtn;
	
	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesBtn;
	
	@FindBy(linkText = "Products")
	private WebElement productsBtn;
	
	@FindBy(linkText = "Documents")
	private WebElement documentsBtn;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement troubleTicketsBtn;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutBtn;
	
	public HomePageTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLeadsBtn() {
		return leadsBtn;
	}

	public WebElement getOrganizationsBtn() {
		return organizationsBtn;
	}

	public WebElement getContactsBtn() {
		return contactsBtn;
	}

	public WebElement getOpportunitiesBtn() {
		return opportunitiesBtn;
	}

	public WebElement getProductsBtn() {
		return productsBtn;
	}

	public WebElement getDocumentsBtn() {
		return documentsBtn;
	}

	public WebElement getTroubleTicketsBtn() {
		return troubleTicketsBtn;
	}

	public WebElement getAdminImg() {
		return adminImg;
	}

	public WebElement getSignoutBtn() {
		return signoutBtn;
	}
	
	public void mouseOverAction() {
		Actions actions = new Actions(driver);
		actions.moveToElement(adminImg).perform();
		signoutBtn.click();
		
	}
	

}

