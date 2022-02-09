package main.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import main.actions.coreActions;

public class contactUs extends coreActions{

	public contactUs(WebDriver driver) {
		super(driver);
	}
	//finding elements on contact page
	public static final By NAME = By.xpath("//span[@class='form-name']//input");
	public static final By MAIl = By.xpath("//span[@class='form-mail']//input");
	public static final By PHONE = By.xpath("//span[@class='form-telephone']//input");
	public static final By submitbtn = By.xpath("//a[text()='Send message']");
	public static final By successful = By.xpath("//div[contains(text(),'Feedback has been sent to the administrator')]");
	public static final By failure = By.xpath("//div[contains(text(),'Invalid email address')]");
	
	
	//implementations to be performed
	@Step("enter name")
	public void enterName(String name) {
		enterText(NAME, name);
	}
	
	@Step("enter e-mail")
	public void enterMail(String mail) {
		enterText(MAIl, mail);
	}
	
	@Step("enter phone")
	public void enterPhone(String num) {
		enterText(PHONE,num);
	}
	
	@Step("click submit button")
	public void clickSubmit() {
		click(submitbtn);
	}
	
	@Step("check success msg")
	public void successmsg() {
		waitForVisibility(successful);
		Assert.assertTrue(present(successful));
	}
	
	@Step("check failure msg")
	public void failuremsg() {
		sleep(2);
		Assert.assertTrue(present(failure));
	}
}
