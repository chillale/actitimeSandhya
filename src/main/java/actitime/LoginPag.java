package actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPag {
	WebDriver driver;
	
	@FindBy(name = "username")
	private WebElement uName;
	
	@FindBy(name = "pwd")
	private WebElement pWd;
	
	@FindBy(id = "loginButton")
	private WebElement loginBtn;
	
	public LoginPag(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getuName() {
		return uName;
	}

	public WebElement getpWd() {
		return pWd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}
