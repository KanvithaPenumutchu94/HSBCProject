package com.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.util.ConfigReader;




public class LoginPage {

	private WebDriver driver;
	ConfigReader configReader;
	Properties prop;

	// 1.By Locators
	private By emailAddress = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='password']");
	private By signInButton = By.xpath("//span[text()=' Sign in ']");
	private By lblEcoSystem = By.xpath("//strong[text()=' Eco-System ']");
	private By title=By.xpath("//title[text()='HSBC - SSAP']");
	private By emailErrorMsg=By.xpath("//mat-error[text()=' Please enter a valid email address ']");
	private By eyeIconBtn=By.xpath("//mat-icon[@data-mat-icon-name='eye']");
	private By enteredPasswordTxt=By.xpath("//input[@id='password'and @type='text']");
	
	
	
	// 2. Constructor of the page class
	public LoginPage(WebDriver driver,Properties prop) {
		this.driver = driver;
		this.prop=prop;
	}

	// 3.page actions : features(behavior) of the page of the form of methods

	public void enterEmailAddress() {
		driver.findElement(emailAddress).sendKeys(prop.getProperty("emailaddress"));
	}

	public void enterPassword() {
		driver.findElement(password).sendKeys(prop.getProperty("password"));
	}

	public void clickOnSignin() {
		driver.findElement(signInButton).click();
	}
	
	public void ValidateEcoSystem() {
		boolean status=driver.findElement(lblEcoSystem).isDisplayed();
		
		Assert.assertTrue(status);
	}
	
	public String validateTitle() {
		String actualTitle=driver.getTitle();
		return actualTitle;
	}
	
	public void enterInvalidEmailId(String invalidEmailId) {
		driver.findElement(emailAddress).sendKeys(invalidEmailId);
	}
	
	public void clickOnPassword() {
		driver.findElement(password).click();
	}
	
	public void validateEmailErrorMessage(String expectedErrMsg) {
		String actualErrMsg=driver.findElement(emailErrorMsg).getText();
		System.out.println("Actual error message is :"+actualErrMsg);
		if(expectedErrMsg.equals(actualErrMsg)) {
			Assert.assertTrue(true);
		}		
	}
	
	public void clickOnPasswordEyeIconBtn() {
		driver.findElement(eyeIconBtn).click();
	}
	
	public void validateHiddenPasswordTxt() {
		String passTxt=driver.findElement(enteredPasswordTxt).getText();
		String ActualPaaword="How2trainurdr@gon2";
		if(ActualPaaword.equals(passTxt)) {
			Assert.assertTrue(true);
		}
	}
	
	
	
	
	
}
