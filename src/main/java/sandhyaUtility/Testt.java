package sandhyaUtility;

import org.testng.annotations.Test;

public class Testt extends BaseClass{
	@Test(dataProvider = "readDa", dataProviderClass = JsonFile.class)
	public void test(String url, String un, String pwd) {
		driver.get(url);
		loginPage.getuName().sendKeys(un);
		loginPage.getpWd().sendKeys(pwd);
		loginPage.getSubmitButton().click();
	}

}
