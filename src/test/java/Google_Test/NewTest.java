package Google_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.PriorityQueue;


public class NewTest {
	
  @Test(groups = {"smoke"})
  public void googlelaunch() {
	  System.out.println("hi");
  }
  
  @Test(groups = {"smoke"})
  public void launch() {
	  System.out.println("hi1");
  }
  
  @Test(groups = {"smoke"})
  public void launch2() {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://google.com");
  }
}
