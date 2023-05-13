package actitimeTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListners.class)
public class GroupExecution{
	@Test(groups = "smoke")
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertEquals("Google", driver.getTitle());

	}
	@Test(groups = "integration", dependsOnMethods = "test3")
	public void test2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		Assert.assertEquals("http://www.amazon.com", driver.getCurrentUrl());
	}
	@Test(groups = "regression", dependsOnGroups = "smoke")
	public void test3() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Assert.assertEquals("http://www.flipkart", driver.getCurrentUrl());
	}

}
