package Google_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Google_Test.FirstPage;

public class CommonMethods {
	
	WebDriver driver;
		
	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}
		
		
	public void get(String url) {
		driver.get(url);		
	}
	
	public void click(WebElement element) {
		element.click();
	}
    
	
}
