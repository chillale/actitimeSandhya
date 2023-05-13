package actitimeTestCases;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitime.ActitimeBase;
import actitime.ActitimeListners;
import actitime.WebDriverUtils;
import actitimePomRepository.AddNewProjectPage;
import actitimePomRepository.HomePage;
import actitimePomRepository.TasksPage;

@Listeners(ActitimeListners.class)
public class ActitimeTest2 extends ActitimeBase {
	@Test
	public void actitime() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		driverUtils = new WebDriverUtils(driver);
		homePage.getTasksBtn().click();
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.getAddNewBtn().click();
		tasksPage.getAddNewProjectBtn().click();
		int n = new Random().nextInt(100);
		AddNewProjectPage addNewProjectPage = new AddNewProjectPage(driver);
		addNewProjectPage.getEnterProjectNameTf().sendKeys("asha" + n);
		WebElement customerDd = addNewProjectPage.getCustomerTf();
		driverUtils.javaScript(customerDd);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", customerDd);
		// Assert.assertEquals(false, true);
		addNewProjectPage.getProjectDescriptionTf().sendKeys("This project is for E- Commerce");
		addNewProjectPage.getCreateProjectBtn().click();
		Thread.sleep(2000);
		// driver.switchTo().alert().accept();
	}

}
