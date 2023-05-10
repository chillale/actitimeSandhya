package genericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Men']")
	private WebElement menBtn;
	
	
	
	public LumaPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
