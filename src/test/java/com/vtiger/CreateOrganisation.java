package com.vtiger;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganisation {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userName = driver.findElement(By.name("user_name"));
		userName.sendKeys("admin");
		
		WebElement passWord = driver.findElement(By.name("user_password"));
		passWord.sendKeys("admin");
		
		WebElement loginButton = driver.findElement(By.id("submitButton"));
		loginButton.click();
		
		WebElement organizationsButton = driver.findElement(By.linkText("Organizations"));
		organizationsButton.click();
		
		WebElement createOrganizationButton = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
	    createOrganizationButton.click();
	    
	    WebElement organizationName = driver.findElement(By.name("accountname"));
	    organizationName.sendKeys("Fortune11");
	    
	    WebElement webSiteTf = driver.findElement(By.name("website"));
	    webSiteTf.sendKeys("www.fortune9.com");
	    
	    WebElement organizationPlusButton = driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
	    organizationPlusButton.click();
	    
	    String parentWindow=driver.getWindowHandle();
	    System.out.println(parentWindow);
	    Set<String> allwindows = driver.getWindowHandles();
	    for(String singleWindow:allwindows) {
	    	System.out.println(singleWindow);
	    	if(!singleWindow.equals(parentWindow)) {
	    		driver.switchTo().window(singleWindow);
	    	}
	    }
	    WebElement searchTf = driver.findElement(By.name("search_text"));
	    searchTf.sendKeys("Testyantra");
	    
	    WebElement searchNowButton = driver.findElement(By.name("search"));
	    searchNowButton.click();
	    
	    WebElement organizationNameclick = driver.findElement(By.id("1"));
	    organizationNameclick.click();
	    
	    Alert alert=driver.switchTo().alert();
	    alert.accept();
	    
	    driver.switchTo().window(parentWindow);
	    
	    WebElement saveButton = driver.findElement(By.name("button"));
	    saveButton.click();
	    Thread.sleep(3000);
	    
	    WebElement movingElement = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(movingElement).perform();
	    
	    WebElement signOutButton = driver.findElement(By.linkText("Sign Out"));
	    signOutButton.click();
	    
	}

}
