package com.test.proj;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericFunction {
	
	public WebElement waitForElement(By by) {
		WebDriverWait wait = new WebDriverWait(DriverClass.driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
		return element;
	}
	
	public WebElement waitForElement(By by, int timeout) {
		WebDriverWait wait = new WebDriverWait(DriverClass.driver, timeout);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
		return element;
	}
	
	public void waitForTextPresentInElement(By by, String text) {
		WebDriverWait wait = new WebDriverWait(DriverClass.driver, 20);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
	}
	
	public void clickOnButtonHavingXpath(By xpath) {
		waitForElement(xpath).click();
	}
	
	public void clickOnButtonHavingName(By name) {
		waitForElement(name).click();
	}

	public void typeValueIntoInputFieldHavingXpath(String text, String xpath){
		waitForElement(By.xpath(xpath)).sendKeys(text);
	}
	public void navigate_forward() {
		DriverClass.driver.navigate().forward();
	}

	public void navigate_back() {
		DriverClass.driver.navigate().back();
	}


	public void switch_to_frame(String frameName) {
		DriverClass.driver.switchTo().frame(frameName);

}
	
	public void get_url(String url ) {
		DriverClass.driver.get(url);
	}

}