package com.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility1.JavaUtility;
import genericUtility1.PropertyFile;
import genericUtility1.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactImage {
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
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\chill\\OneDrive\\Desktop\\Zoo Images\\GermanRotWheeler.jpeg");
		
		
		
	}

}
