package main.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class coreActions {

	protected final WebDriver driver;
	protected final WebDriverWait waiter;
	
	protected coreActions(WebDriver driver) {
		this.driver = driver;
		this.waiter = new WebDriverWait(driver,10);
	}
	
	protected boolean waitForVisibility(By element) {
		boolean flag = true;
		try {
			waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
		} catch (TimeoutException te) {
			flag = false;
		}
		return flag;
	}
	
	protected String pageTitle() {
		return driver.getTitle();
	}
	
	
	protected boolean present(By element) {
		if(driver.findElement(element) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	protected void click(By element) {
		driver.findElement(element).click();
	}
	
	protected void enterText(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }
	
	public static void sleep(double sec) {
        try {
            Thread.sleep((long) (sec * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
}
