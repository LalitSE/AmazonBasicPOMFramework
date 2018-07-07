package com.amazon.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/*
 * First will start form this BaseTest, it will have all common 
 * functionalities and variables of test classes extend this BaseTest*/
public class BaseTest {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
		//create a driver, all test and pages uses this
		driver = new ChromeDriver();
		
		//create a wait. All test and page classes us this wait
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
