package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest {
	WebDriver driver;
	
	@FindBy(name = "user_name")
	private WebElement userName;
	
	@FindBy(name = "user_password")
	private WebElement passWord;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;

	public LoginPageTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginPageDetails(CharSequence uName, CharSequence pWord) {
		userName.sendKeys(uName);
		passWord.sendKeys(pWord);
		loginBtn.click();
	}
	
	

}
