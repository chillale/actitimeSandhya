package genericUtility1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		this.driver = driver;
	}
	/*
	 * This is to maximize the window
	 * @author
	 */
	public void maximize() {
		driver.manage().window().maximize();
	}
	/*
	 * This wait is for whole application
	 */
	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/*
	 * This is to selectByIndex
	 * @pradeep
	 */
	public void selectByIndex(WebElement ele, int index) {
		Select select = new Select(ele);
		select.selectByIndex(index);
	}
	/*
	 * This is for selectByvalue
	 * @author sravan
	 */
	public void selectByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}
	/*
	 * This is for select By visibleText
	 * @author vamsi
	 */
	public void selectByVisibleText(WebElement ele, String text) {
		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}
	/*
	 * This is to mouseover
	 * @author Ramesh
	 */
	public void mouseOver(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
	}
	
	/*
	 * This is to handle single window
	 */
	public String switchToParent() {
		String parentWindow = driver.getWindowHandle();
		return parentWindow;
	}
	/*
	 * This is to handle multiple windows
	 * @author sai krishna
	 */
	
	public void allHandles1(String pHandle) {
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> iteratorWindows = allwindows.iterator();
		
		while(iteratorWindows.hasNext()) {
			String window=iteratorWindows.next();
			if(!pHandle.equals(window)){
				driver.switchTo().window(pHandle);
			}
		}
	}
	

}
