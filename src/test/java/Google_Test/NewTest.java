package Google_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.AutomationPractisehomepagePOM;

import java.sql.Driver;
import java.util.PriorityQueue;


public class NewTest extends RunnerTest {
	
  
	@Test(priority = 0)
	public void launchwebsite() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(Ap.contactus));
		Assert.assertTrue(Ap.contactus.isDisplayed());	
		wait.until(ExpectedConditions.elementToBeClickable(Ap.searchbar));
		Ap.searchbar.sendKeys("hello");
		Thread.sleep(3000);
		//comment
	}
	@Test
	public void womenstab() {
    cm.click(Ap.womenTab);
    
	}
 
  
 }
