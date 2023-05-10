package actitime;

import org.testng.annotations.Test;

public class ActitimeTest extends ActitimeBase{
	@Test(dataProvider = "data", dataProviderClass = ActitimeDataProvider.class)
	public void test(String url, String un, String pwd) {
		driver.get(url);
		loginPag.getuName().sendKeys(un);
		loginPag.getpWd().sendKeys(pwd);
		loginPag.getLoginBtn().click();
	}

}
