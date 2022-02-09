package main.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import main.actions.coreActions;

public class homePage extends coreActions{

	public homePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static final By contactUs = By.xpath("//span[text()='CONTACT']");

	public contactUs clickcontact() {
		click(contactUs);
		return new contactUs(driver);
	}
	
	public void verifyhome() {
		Assert.assertEquals(pageTitle(),"Selenium Framework | Selenium, Cucumber, Ruby, Java et al.");
		
	}
	
	
	
}
