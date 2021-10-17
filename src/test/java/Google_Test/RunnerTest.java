package Google_Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.html5.AddApplicationCache;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM.*;
import Google_Page.CommonMethods;
import POM.AutomationPractisehomepagePOM;

public class RunnerTest {
	FirstPage Fp = new FirstPage();
	WebDriver driver ;
	CommonMethods cm ;
	AutomationPractisehomepagePOM Ap; 
	
	@BeforeSuite
	public void setup() {
 	driver = Fp.initializedriver();
	Ap = new AutomationPractisehomepagePOM(driver);
	cm = new CommonMethods(driver);
	cm.get("http://automationpractice.com/index.php");
	}
	
	
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
