package Google_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class google{
	
	public static WebDriver driver;
	
	@BeforeMethod(groups = {"smoke"})
	public void setup() {
		
		System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\91994\\eclipse-workspace\\Nunit_Selenium");
		driver = new ChromeDriver();
	}
	
	@Test(groups = {"smoke"},priority = -2)
	public void test() {
		driver.get("https://www.google.com/");
	}
	@Test(priority = -5,groups = {"smoke"})
	public void testsuccess() {
		System.out.println("victory");
	}
	
	@AfterMethod(groups = {"smoke"})
	public void close(){
		driver.quit();
		//*over
	}

}
