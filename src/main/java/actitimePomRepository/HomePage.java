package actitimePomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Enter Time-Track']")
	private WebElement enterTimeTrackBtn;
	
	@FindBy(how = How.XPATH, using = "//a[text()='View Time-Track']")
	private WebElement viewtimeTrackBtn;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Lock Time-Track']")
	private WebElement lockTimeTrackBtn;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Approve Time-Track']")
	private WebElement approveTimeTrackBtn;
	
	@FindBy(how = How.ID, using = "logoutLink")
	private WebElement logOutBtn;
	
	
	@FindBy(how = How.XPATH,using = "//div[text()='Tasks']")
	private WebElement tasksBtn;
	
	@FindBy(xpath = "//div[text()='Time-Track']")
	private WebElement timeTrackBtn;
	
	@FindBy(xpath = "//div[text()='Reports']")
	private WebElement reportsBtn;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Users']")
	private WebElement usersBtn;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTimeTrackBtn() {
		return timeTrackBtn;
	}

	public WebElement getViewtimeTrackBtn() {
		return viewtimeTrackBtn;
	}

	public WebElement getLockTimeTrackBtn() {
		return lockTimeTrackBtn;
	}

	public WebElement getApproveTimeTrackBtn() {
		return approveTimeTrackBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public WebElement getEnterTimeTrackBtn() {
		return enterTimeTrackBtn;
	}

	public WebElement getTasksBtn() {
		return tasksBtn;
	}

	public WebElement getReportsBtn() {
		return reportsBtn;
	}

	public WebElement getUsersBtn() {
		return usersBtn;
	}
	
	

}
