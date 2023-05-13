package actitimePomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(how = How.XPATH, using = "//div[text()='+ New Customer']")
	private WebElement addNewCustomerBtn;
	
	@FindBy(how = How.XPATH, using = "//div[text()='+ New Project']")
	private WebElement addNewProjectBtn;
	
	@FindBy(how = How.XPATH, using = "//div[text()='+ New Tasks']")
	private WebElement addNewTasksBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerNameTf;
	
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement enterCustomerDescriptionTf;
	
	@FindBy(how = How.XPATH, using = "//div[@class='comboboxButton']//ancestor::span[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer']/descendant::div[text()='Our company']")
	private WebElement selectCustomerTf;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	public TasksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getAddNewCustomerBtn() {
		return addNewCustomerBtn;
	}

	public WebElement getAddNewProjectBtn() {
		return addNewProjectBtn;
	}

	public WebElement getAddNewTasksBtn() {
		return addNewTasksBtn;
	}

	public WebElement getEnterCustomerNameTf() {
		return enterCustomerNameTf;
	}

	public WebElement getEnterCustomerDescriptionTf() {
		return enterCustomerDescriptionTf;
	}

	public WebElement getSelectCustomerTf() {
		return selectCustomerTf;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	
	

}
