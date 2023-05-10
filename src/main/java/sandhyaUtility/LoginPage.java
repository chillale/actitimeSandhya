package sandhyaUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	@FindBy(name = "user_name")
	private WebElement uName;
	
	@FindBy(name = "user_password")
	private WebElement pWd;
	
	@FindBy(id = "submitButton")
	private WebElement submitButton;
	
	@FindBy(linkText = "Organizations")
	private WebElement orgBtn;
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement createOrgBtn;
	
	@FindBy(name = "accountname")
	private WebElement orgNameTf;
	
	@FindBy(name = "industry")
	private WebElement industryDd;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getuName() {
		return uName;
	}


	public WebElement getpWd() {
		return pWd;
	}


	public WebElement getSubmitButton() {
		return submitButton;
	}


	public WebElement getCreateOrgBtn() {
		return createOrgBtn;
	}


	public WebElement getOrgNameTf() {
		return orgNameTf;
	}


	public WebElement getIndustryDd() {
		return industryDd;
	}


	public WebElement getOrgBtn() {
		return orgBtn;
	}
	
}
