package actitimeTestCases;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import actitime.ActitimeBase;
import actitimePomRepository.HomePage;
import actitimePomRepository.TasksPage;
import freemarker.core.JavaScriptOutputFormat;

public class ActitimeTest1 extends ActitimeBase {
	@Test
	public void createNewCustomer() throws InterruptedException, AWTException {
		HomePage homePage = new HomePage(driver);
		homePage.getTasksBtn().click();
		Thread.sleep(3000);
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.getAddNewBtn().click();
		tasksPage.getAddNewCustomerBtn().click();
		tasksPage.getEnterCustomerNameTf().sendKeys("Rohit" + new Random().nextInt(100));
		tasksPage.getEnterCustomerDescriptionTf().sendKeys("kala");
		WebElement selectCus = tasksPage.getSelectCustomerTf();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", selectCus);
		tasksPage.getCreateCustomerBtn().click();
		Thread.sleep(2000);
		// homePage.getLogOutBtn().click();
		// driver.switchTo().alert().accept();

	}

}
