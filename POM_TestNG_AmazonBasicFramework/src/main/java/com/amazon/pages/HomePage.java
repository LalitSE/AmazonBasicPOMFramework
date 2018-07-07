package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	//**************Page Variables**********
	String url = "https://www.amazon.in";
	
	//**************Web Elements***********
	String signInButtonClass = "btnSignIn";
	
	
	//**************Page Methods***********
	
	//Go to HomePage
	public void goToHomePage() {
		driver.get(url);
	}
	
	//Go to LoginPage
	public void goToLoginPage() {
		click(By.className(signInButtonClass));
	}
	
}
