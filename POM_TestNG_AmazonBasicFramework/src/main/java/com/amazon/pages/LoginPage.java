package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/*Here will have three methods, one does the login operation, 
 * other one do assertion.
 * Check the login messages as expected or not and set Test fail or pass.*/
public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//**********Web Elements**************
	String username = "";
	String password = "";
	String loginBtn = "";
	String errorMessageUsernameXpath = "";
	String errorMessagePasswordXpath = "";
	
	//*********Page Methods*******************
	public void loginToAmazon(String uname, String pwd) {
		//Enter username(Email)
		writeText(By.name(username), uname);
		//Enter password
		writeText(By.name(password), pwd);
		//Click on Login Button
		click(By.name(loginBtn));
	}
	
	//*********Verify Username*********
	public void verifyLoginUserName(String expectedText) {
		Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedText);
	}
	
	//*********Verify Password**********
	public void verifyLoginPassword(String expectedText) {
		Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
	}

}
