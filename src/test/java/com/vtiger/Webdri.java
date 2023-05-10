package com.vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdri {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#top");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mouse = driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Reload']")).click();
	}

}
