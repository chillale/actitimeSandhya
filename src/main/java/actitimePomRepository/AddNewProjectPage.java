package actitimePomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewProjectPage {
	
	public WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//div[@class='projectSection']//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
    private WebElement enterProjectNameTf;
	
	@FindBy(how = How.XPATH, using = "//div[@class='customerContainer']//descendant::div[@class='searchItemList']/child::div[text()='Big Bang Company']")
	private WebElement customerTf;
	
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescriptionTf;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	public AddNewProjectPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEnterProjectNameTf() {
		return enterProjectNameTf;
	}

	public WebElement getCustomerTf() {
		return customerTf;
	}

	public WebElement getProjectDescriptionTf() {
		return projectDescriptionTf;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}
	
	
	
}
