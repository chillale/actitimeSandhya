package popularWebsites;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Amazon2 extends BaseTest{
	@Test
	public void test1() {
		driver.findElement(By.xpath("//span[text()='All']//parent::a[@id='nav-hamburger-menu']")).click();
		List<WebElement> allItems = driver.findElements(By.xpath("//div[@id='hmenu-content']/ul[@class='hmenu hmenu-visible']/child::li/child::a/div"));
		for(int i=0;i<allItems.size();i++) {
			System.out.println(allItems.get(i).getText());
		}
	}
	

}
