package excelValidating;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
    public  WebDriver driver;
    public static WebDriver sdriver;
    public  void initialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver=sdriver;
        driver.get("http://www.google.com");
    }
   
    public static String takescreenshot(String name) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)Base.sdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);

		String  path= "./Screnshot/"+name+".PNG";
		
		File dest1 = new File(path);
		try {
			Files.copy(src, dest1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
		
		

			}

}
