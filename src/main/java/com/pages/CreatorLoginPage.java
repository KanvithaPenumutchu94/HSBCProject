package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CreatorLoginPage {
	
	WebDriver driver;
	
	private By creatorLoginBtn=By.xpath("//span[text()='Creator Login ']");
	private By homeLbe=By.xpath("//*[text()=' Home ']");
	private By searchCustomer=By.xpath("//input[@data-placeholder='Search Customer' and @id='mat-input-2']");
	private By customerIdData=By.xpath("(//tbody[@role='rowgroup'])[1]/tr/td[3]");
	
	public CreatorLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnCreatorLogin() {
		driver.findElement(creatorLoginBtn).click();
	}
	
	public void validateHomeLable() {
		Assert.assertTrue(driver.findElement(homeLbe).isDisplayed());
	}
	
	public void enterCustomerId() {
		driver.findElement(searchCustomer).sendKeys("111");
	}
	
	public void clickOnEnterKey() {
		driver.findElement(searchCustomer).sendKeys(Keys.ENTER);
	}
	
	public void validateCustomerIdResults() {
		List<WebElement> customerIDs=driver.findElements(customerIdData);
		for(WebElement customerId:customerIDs) {
			String id=customerId.getText();
			if(id.equals("111")) {
				Assert.assertTrue(true);
			}
		}
	}

}
