package sandhyaUtility;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JsonTest extends BaseClass{
	@Test(dataProvider = "readData")
	public void test1(String element2, String element3) {
		//driver.findElement(By.linkText("Organizations")).click();
		loginPage.getOrgBtn().click();
		loginPage.getCreateOrgBtn().click();
		loginPage.getOrgNameTf().sendKeys(element2);
		WebElement indDd = loginPage.getIndustryDd();
		Select se = new Select(indDd);
		se.selectByVisibleText(element3);
	}
	
	@DataProvider
	public Object[][] readData() throws IOException, ParseException {
		JsonFile json = new JsonFile();
		
		Object[][] obj = new Object[1][2];
		obj[0][0]=json.readDataFromJson("element2");
		obj[0][1]=json.readDataFromJson("element3");
		return obj;
		
	}

}
