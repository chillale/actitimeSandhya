package actitime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ActitimeBase {
	public WebDriver driver;
	LoginPag loginPag;
	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		loginPag = new LoginPag(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
//	@BeforeMethod
//	public void openApp() {
//		
//	}

}
