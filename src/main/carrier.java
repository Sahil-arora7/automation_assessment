package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class carrier {

//	System.setProperty("webdriver.chrome.driver","C:\\Users\\sahil.arora\\eclipse-workspace\\automationAssessment\\chromedriver.exe");
	private WebDriver driver;
	
	public carrier() {
		this.driver = new ChromeDriver();
	}
	
	public WebDriver getCarrier() {
		return driver;
	}
}
