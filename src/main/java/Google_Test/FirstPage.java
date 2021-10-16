package Google_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPage{
	
	public WebDriver initializedriver() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
