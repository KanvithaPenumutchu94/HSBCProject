package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginAllPage {
	
	WebDriver driver;

	private By emailAddress = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='password']");
	private By signInButton = By.xpath("//span[text()=' Sign in ']");
	private By lblEcoSystem = By.xpath("//strong[text()=' Eco-System ']");
	private By unpwErrMsg=By.xpath("//div[text()=' Invalid Username and Password ']");
	private By emailErrMsg=By.xpath("//mat-error[text()=' Email address is required ']");
	private By passwordErrMsg=By.xpath("//mat-error[text()=' Password is required ']");
	
	
	public LoginAllPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterEmailAddress(String emailid) {
		driver.findElement(emailAddress).sendKeys(emailid);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnSignin() {
		driver.findElement(signInButton).click();
	}
	
	public String validcredentials() {
		Assert.assertTrue(driver.findElement(lblEcoSystem).isDisplayed());
		String actualOutcome="valid";
		return actualOutcome;
	}
	
	public String invalidCredentials() {
		String actual_msg=driver.findElement(unpwErrMsg).getText();
		String expected_msg=" Invalid Username and Password ";
		Assert.assertEquals(actual_msg, expected_msg);
		String actualOutcome="invalid";
		return actualOutcome;
	}
	
	public String blankCredentials() {
		driver.findElement(emailAddress).sendKeys("");
		driver.findElement(password).sendKeys("");
		driver.findElement(signInButton).click();
		String actualErrMsg=driver.findElement(emailErrMsg).getText();
		String expectedErrMsg=" Email address is required ";
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
		String actualOutcome="invalid";
		return actualOutcome;
	}
	
	

	
}
