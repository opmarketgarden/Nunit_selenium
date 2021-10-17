package POM;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Google_Test.FirstPage;

public class AutomationPractisehomepagePOM {
	
	WebDriver driver;
    FirstPage p = new FirstPage();
    
	@FindBy(how = How.XPATH,using ="//input[@id='search_query_top']" )
	public WebElement searchbar;
	
	@FindBy(how = How.XPATH,using = "//*[contains(text(),'Contact us')]")
	public WebElement contactus;
	
	@FindBy(how = How.XPATH,using = "//*[contains(text(),'Women')]")
	public WebElement womenTab;
	
	
	
	
	public AutomationPractisehomepagePOM (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
