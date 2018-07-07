package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*BasePage will have all common actions which will be extended by all pages*/
public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	//Constructor
	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	//Click Method
	public void click(By elementLocation) {
		driver.findElement(elementLocation).click();
	}
	
	public void writeText(By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(text);
	}
	
	public void readText(By elementLocation) {
		driver.findElement(elementLocation).getText();
	}
}
