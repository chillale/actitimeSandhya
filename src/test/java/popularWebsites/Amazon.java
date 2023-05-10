package popularWebsites;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/child::div[@data-component-type='s-search-result']/descendant::span[2]"));
//		for(int i=0;i<elements.size();i++) {
//			String iphoneName = elements.get(i).getText();
//			System.out.println(iphoneName);
//		}
		
		List<WebElement> discount = driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//child::div[@data-component-type=\"s-search-result\"]/descendant::span[@class='a-offscreen']/parent::span[@class='a-price']"));
	    for(int i=0;i<discount.size();i++) {
	    	System.out.println(discount.get(i).getText());
	    }
	
	}

}
