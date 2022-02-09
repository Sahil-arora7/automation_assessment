package test1;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import main.carrier;

public class basicStep {

	protected WebDriver driver;
	protected static final String URL = "http://www.seleniumframework.com/";
	
	@BeforeClass
	public void startBrowser() {
		Reporter.log("Browser opened", true);
		driver = new carrier().getCarrier();
		driver.get(URL);
		Reporter.log("Application launched",true);
	}
	
	protected static void stepLog(String step) {
		 System.out.println("Step logged -> " + step);
	}
	
	@AfterClass
	public void closeApplication()
	{
		driver.quit();
		Reporter.log("Browser Closed", true);
		
	}
}
