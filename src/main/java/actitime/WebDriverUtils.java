package actitime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtils {
	public WebDriver driver;
	public WebDriverUtils(WebDriver driver) {
		this.driver = driver;
	}
	//This method is to use javascript Executor
	public void javaScript(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}

}
