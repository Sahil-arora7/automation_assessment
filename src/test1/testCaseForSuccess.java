package test1;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import main.pages.contactUs;
import main.pages.homePage;


@Test
@Epic("epic 1")
public class testCaseForSuccess extends basicStep {

	contactUs conobject;
	homePage homeobject;
	
	 @Test
	 @Description("creating objects of contactus page and home page")
	 public void initiate() {
//		 conobject = new contactUs(driver);
		 homeobject = new homePage(driver);
	 }
	 
	 
	 @Test(dependsOnMethods = "initiate")
	 @Feature("success message")
	 @Story("Automation assessment")
	 @Owner("Sahil Arora")
	 public void testCase1forSuccess() {
		 
		 stepLog("Verifying that correct site is opened");
		 homeobject.verifyhome();
		 
		 stepLog("click contact button");
		 conobject = homeobject.clickcontact();
		 
		 stepLog("Enter details in form");
		 conobject.enterName("XYZ");
		 conobject.enterMail("xyz@gmail.com");
		 conobject.enterPhone("99999999");
		 conobject.clickSubmit();
		 
		 stepLog("Verifying success message");
		 conobject.successmsg(); 
		 
		 
	 }
}

