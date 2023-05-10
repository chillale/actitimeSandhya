package sandhyaUtility;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrgNameTest extends BaseClass{
	@Test(dataProvider = "readData")
	public void orgNameTest(String org,String ind) {
		loginPage.getOrgBtn().click();
		loginPage.getCreateOrgBtn().click();
		loginPage.getOrgNameTf().sendKeys(org);
		WebElement indDd = loginPage.getIndustryDd();
		Select se = new Select(indDd);
		se.selectByVisibleText(ind);
	}
	@DataProvider
	public Object[][] readData() throws IOException, ParseException{
		JsonFile json = new JsonFile();
		Object[][] obj = new Object[2][2];
		obj[0][0]=json.readDataFromJsonArray("orgname");
		obj[0][1]=json.readDataFromJsonArray("orgname");
		
		obj[1][0]=json.readDataFromJsonArray("orgname");
		obj[1][1]=json.readDataFromJsonArray("orgname");
		
		return obj;
	}

}
