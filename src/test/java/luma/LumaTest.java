package luma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtils.LumaPage;

public class LumaTest {
	@Test
	public void luma() {
		WebDriver driver = new ChromeDriver();
		LumaPage lumaPage = new LumaPage(driver);
		
	}

}
