package actitimeTestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;

public class TestBase {
	public WebDriver driver;
	public static WebDriver sdriver;
	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		sdriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	public static String screnShot(String name)
	{
		TakesScreenshot ts = (TakesScreenshot)TestBase.sdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path = "./ScrenShot/"+name+".PNG";
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
