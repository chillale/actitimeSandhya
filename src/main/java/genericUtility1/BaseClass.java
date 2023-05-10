package genericUtility1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePageTest;
import objectRepository.LoginPageTest;

import static genericUtility1.PropertyFile.*;

import java.io.File;
import java.io.IOException;
public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	
	
	@BeforeSuite
	public void connectToDB() {
		System.out.println("===> connect to DataBase ===>");
	}
	@AfterSuite
	public void disconnectToDB() {
		System.out.println("===> Disconnect to DataBase ===>");
	}
	@BeforeClass
	public void launchTheBrowser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		sdriver = driver;
		driver.get(readDataFromPropertyFile("url"));
		WebDriverUtility webdriverUtility = new WebDriverUtility(driver);
		webdriverUtility.maximize();
		webdriverUtility.implicitlyWait();	
	}
	@AfterClass
	public void closeTheBrowser() {
		driver.close();
	}
    @BeforeMethod
    public void loginIntoApp() throws Throwable {
    	LoginPageTest loginPageTest = new LoginPageTest(driver);
    	loginPageTest.getUserName().sendKeys(readDataFromPropertyFile("username"));
    	loginPageTest.getPassWord().sendKeys(readDataFromPropertyFile("password"));
    	loginPageTest.getLoginBtn().click();
    }
    @AfterMethod
    public void logoutFromApp() {
    	HomePageTest homePageTest = new HomePageTest(driver);
    	homePageTest.mouseOverAction();
    }
    public static String takeScreenSht1(String name) {
    	TakesScreenshot takeScreenShot = (TakesScreenshot)BaseClass.sdriver;
    	File source = takeScreenShot.getScreenshotAs(OutputType.FILE);
    	String path = "./ScrenShot"+name+".PNG";
    	File destination = new File(path);
    	try {
			Files.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return path;
    }
	
    
}
