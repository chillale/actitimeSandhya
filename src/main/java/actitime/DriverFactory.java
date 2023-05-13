package actitime;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitimePomRepository.HomePage;
import actitimePomRepository.LoginPag;

public class DriverFactory {

	public WebDriver driver;
	LoginPag loginPag;

	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void closeBrowser() {
		driver.close();
	}

	public void openApplication() throws IOException {
		
	}

	public void closeApplication() {
		HomePage homePage = new HomePage(driver);
		homePage.getLogOutBtn().click();
	}

}
