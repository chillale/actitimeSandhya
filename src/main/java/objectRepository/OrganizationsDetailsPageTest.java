package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsDetailsPageTest {
	WebDriver driver;
	
	@FindBy(name = "accountname")
	private WebElement organizationNameTf;
	
	@FindBy(className = "detailedViewTextBox")
	private WebElement webSiteTf;
	
	@FindBy(xpath = "themes/softed/images/select.gif")
	private WebElement organizationPlusBtn;
	
	@FindBy(name = "search_text")
	private WebElement searchTextTf;
	
	@FindBy(name = "search")
	private WebElement searchNowBtn;
	
	@FindBy(id = "1")
	private WebElement selectOrganization;
	
	public OrganizationsDetailsPageTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationNameTf() {
		return organizationNameTf;
	}

	public WebElement getWebSiteTf() {
		return webSiteTf;
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
	
	

}
