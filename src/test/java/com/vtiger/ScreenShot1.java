package com.vtiger;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShot1 {
	@Test
	public void verifyHomePage(Method met) {
		WebDriver driver = new ChromeDriver();
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScrenShot/Fb.png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
