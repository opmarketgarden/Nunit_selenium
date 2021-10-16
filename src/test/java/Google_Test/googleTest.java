package Google_Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Google_Page.AdactinhomepagePOM;
import Google_Page.CommonMethods;

public class googleTest {
	FirstPage Fp = new FirstPage();
	WebDriver driver ;
	CommonMethods cm ;
	AdactinhomepagePOM Ap; 
	
	@BeforeSuite
	public void setup() {
 	driver = Fp.initializedriver();
	Ap = new AdactinhomepagePOM(driver);
	cm = new CommonMethods(driver);
	cm.get("http://automationpractice.com/index.php");
	}
	
	@Test(priority = 0)
	public void launchwebsite() throws InterruptedException {
		 
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(Ap.contactus));
		Assert.assertTrue(Ap.contactus.isDisplayed());	
		Ap.searchbar.sendKeys("hello");
		Thread.sleep(3000);
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
