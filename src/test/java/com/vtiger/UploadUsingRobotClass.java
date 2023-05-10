package com.vtiger;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import genericUtility1.JavaUtility;
import genericUtility1.PropertyFile;
import genericUtility1.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadUsingRobotClass {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		PropertyFile propertyFile = new PropertyFile();
		String uRL=propertyFile.readDataFromPropertyFile("url");
		String uName=propertyFile.readDataFromPropertyFile("username");
		String pWord=propertyFile.readDataFromPropertyFile("password");
		driver.get(uRL);
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		
		String lName = JavaUtility.lastName();
		
		webDriverUtility.maximize();
		webDriverUtility.implicitlyWait();
		
		WebElement userName = driver.findElement(By.name("user_name"));
		userName.sendKeys(uName);
		
		WebElement passWord = driver.findElement(By.name("user_password"));
		passWord.sendKeys(pWord);
		
		WebElement submitBtn = driver.findElement(By.id("submitButton"));
		submitBtn.click();
		
		WebElement contactsBtn = driver.findElement(By.linkText("Contacts"));
		contactsBtn.click();
		
		WebElement createContactBtn = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createContactBtn.click();
		
		WebElement lastNameTf = driver.findElement(By.name("lastname"));
		lastNameTf.sendKeys(lName);
		
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
		javaScriptExecutor.executeScript("window.scrollBy(0,1500);");
		
		WebElement imageFile = driver.findElement(By.name("imagename"));
		Actions actions = new Actions(driver);
		actions.moveToElement(imageFile).click().perform();
		Thread.sleep(2000);
		//Runtime.getRuntime().exec("D:\\ExcelFile\\filepath.au3");
		uploadFile("C:\\Users\\chill\\OneDrive\\Desktop\\Zoo Images\\Bear1.jpg");
		
	}
	public static void setClipBoard(String file) {
		StringSelection stringSelection = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
	}
	public static void uploadFile(String filepath) throws AWTException {
		setClipBoard(filepath);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
