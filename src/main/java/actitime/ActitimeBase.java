package actitime;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import actitimePomRepository.HomePage;
import actitimePomRepository.LoginPag;

public class ActitimeBase {
	public static WebDriver driver;

	DriverFactory driverFactory = new DriverFactory();
	
	//public static WebDriver sdriver;
	
	LoginPag loginPag;
	public WebDriverUtils driverUtils = new WebDriverUtils(driver);
    @BeforeClass
    public void launchBrowser() {
    	driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    }
    @AfterClass
    public void closeBrowser() {
    	driver.close();
    }
    @BeforeMethod
    public void openApp() throws IOException {
    	ActitimePropertyFile actitimePropertyFile = new ActitimePropertyFile();
		loginPag = new LoginPag(driver);
		driver.get(actitimePropertyFile.readDataFromPropertyFile("url"));
		loginPag.getuName().sendKeys(actitimePropertyFile.readDataFromPropertyFile("username"));
		loginPag.getpWd().sendKeys(actitimePropertyFile.readDataFromPropertyFile("password"));
		loginPag.getLoginBtn().click();
    }
    @AfterMethod
    public void closeApp() {
         HomePage homePage = new HomePage(driver);
         WebElement logoutBtn = homePage.getLogOutBtn();
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].click();", logoutBtn);
        // driverUtils.javaScript(logoutBtn);
    	System.out.println("log out successfully");
    }
    public static String takeScreenShott(String name) {
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	String path ="./ScrenShot/"+name+".PNG"; 
    	File dest = new File(path);
    	try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return path;
    }
}
