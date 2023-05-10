package excelValidating;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotTest extends Base
{
    @BeforeMethod
    public void setUp() {
    	initialization();
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
    @Test
    public void takeScrnShot() {
    	Assert.assertEquals(false, true);
    }
    @org.testng.annotations.Test
	public void con() 
	{
		Assert.assertEquals(false, true);
	}
//	@org.testng.annotations.Test
//	public void contacting() 
//	{
//		Assert.assertEquals(false, true);
//	}
//	@org.testng.annotations.Test
//	public void contact() 
//	{
//		Assert.assertEquals(false, true);
//	}

}
