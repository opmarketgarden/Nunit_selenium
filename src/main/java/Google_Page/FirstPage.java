package Google_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FirstPage {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\91994\\eclipse-workspace\\Nunit_Selenium");
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() {
		driver.get("https://www.google.com/");
	}
	
	@AfterTest
	public void close(){
		driver.quit();
	}
	
	

}
