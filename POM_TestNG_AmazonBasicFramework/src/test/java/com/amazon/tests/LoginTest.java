package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;

public class LoginTest extends BaseTest {
	// Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    //    Homepage homepage = new HomePage(driver,wait);
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	//********************Start Test Scripts*************
	@Test(priority=0)
	public void invalidLoginTest_InvalidUsernameInvalidPassword() throws InterruptedException {
		//****************Page Instantiations*************
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		
		//****************Page Methods********************
		//Open Amazon
		homePage.goToHomePage();
		//Go to LoginPage
		homePage.goToLoginPage();
		//Login to Amazon
		loginPage.loginToAmazon("xyz@gmail.com", "password");
		
		//Assertions
		Thread.sleep(500);
		loginPage.verifyLoginUserName("User name is incorrect");
		
	}
	
	public void invalidLoginTest_EmptyUsernameEmptyPassowrd() throws InterruptedException {
		//**************Page Instantiations************
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		
		//*************Page Methods****************
		homePage.goToHomePage();
		homePage.goToLoginPage();
		loginPage.loginToAmazon("", "");
		
		//Assertions
		Thread.sleep(500);
		loginPage.verifyLoginUserName("Please Enter Username");
		loginPage.verifyLoginPassword("Please Enter Password");
	}
}
