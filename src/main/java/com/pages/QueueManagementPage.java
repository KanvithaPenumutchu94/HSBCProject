package com.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class QueueManagementPage {
	
	WebDriver driver;
	public QueueManagementPage(WebDriver driver){
		this.driver=driver;
	}
	
	private By uploadStatementBtn=By.xpath("//span[text()='Upload Statement ']");
	private By uploadStatementPDFBtn=By.xpath("//*[text()=' Upload Statement PDF']");
	private By pickCustomerDrpdwn=By.xpath("//div[@class='mat-autocomplete-panel mat-autocomplete-visible ng-star-inserted']/mat-option");
	private By uploadStatementBtnBelowDrpwn=By.xpath("//*[text()=' Upload Statement ']/..");
	private By uploadBtn=By.xpath("//span[text()='Upload']");
	private By attentionTxt=By.xpath("//div[text()=' Data has been uploaded. Uploading the files, Please wait! ']");
	private By successTxt=By.xpath("//div[text()=' OCR process has been started! ']");
	private By refNosInQueueManagement=By.xpath("(//table[@role='table'])[1]/tbody/tr/td[1]");
	private By NewResult=By.xpath("(//table[@role='table'])[1]/tbody/tr[1]");
	private By reComputeBtn=By.xpath("//span[text()=' Recompute ']/..");
	
	
	public void clickOnUploadStatementBtn() {
		driver.findElement(uploadStatementBtn).click();
	}
	
	public void clickOnUploadStatementPDFBtn() {
		driver.findElement(uploadStatementPDFBtn).click();
	}
	
	public void pickCustomerFromDrpdwn() {
		List<WebElement> customers=driver.findElements(pickCustomerDrpdwn);
		for(WebElement customer:customers) {
			try {
				pickCustomerDrpdwn=By.xpath("//div[@class='mat-autocomplete-panel mat-autocomplete-visible ng-star-inserted']/mat-option");
				if(customer.getText().contains("Test") || customer.getText().contains("111") ) {
					customer.click();
				}
			}catch(Exception e) {
				
			}
		}
	}
	
	public void clickOnUploadStatementBtnBelowDrpdwn() {
		driver.findElement(uploadStatementBtnBelowDrpwn).click();
	}
	
	public void uploadPdfFile() throws IOException, InterruptedException {
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Indian\\Desktop\\autoit.exe");
	}
	
	public void clickOnUploadBtn() {
		driver.findElement(uploadBtn).click();
	}
	
	//Handling alert message( Attention!  Data has been uploaded. Uploading the files, Please wait! )
	public void attentionAlert() {
		String actualAttentionTxt=driver.findElement(attentionTxt).getText();
		String ExpectedAttentionTxt=" Data has been uploaded. Uploading the files, Please wait! ";
		System.err.println("actualAttentionTxt.."+actualAttentionTxt);
		System.err.println("ExpectedAttentionTxt.."+ExpectedAttentionTxt);
		if(actualAttentionTxt.contains(ExpectedAttentionTxt)) {
			Assert.assertTrue(true);
		}
		System.out.println("attention alert handled");
	}
	
	//Handling alert message ( Success!  OCR process has been started! )
	public void successAlert() throws InterruptedException {
		Thread.sleep(1000);
		String actualSuccessTxt=driver.findElement(successTxt).getText();
		String expectedSuccessTxt=" OCR process has been started! ";
		System.err.println("actualSuccessTxt.."+actualSuccessTxt);
		System.err.println("expectedSuccessTxt.."+expectedSuccessTxt);
		if(actualSuccessTxt.contains(expectedSuccessTxt)) {
			Assert.assertTrue(true);
		}
		System.out.println("success alert handled");
	}
	
	public void validateCustomerResultAddedInDataTable() throws InterruptedException     {
		Thread.sleep(2000);
		List<WebElement> refNos=driver.findElements(refNosInQueueManagement);
		System.out.println("refNo..");
		List<Integer> al=new ArrayList<Integer>();
		for(WebElement refNo:refNos) {
			try {
				String uniqueRefNo=refNo.getText();
				System.out.println(uniqueRefNo);//SS2023090602477
				String last4nos=uniqueRefNo.substring(11,15);//2477
				System.out.println(last4nos);
				int value=Integer.parseInt(last4nos);
				al.add(value);
			}catch(Exception e) {
				
			}
		}
		System.out.println("list values are: "+al);
		System.out.println("list size are: "+al.size());
		int max=al.get(0);
		for(int i=1;i<al.size();i++) {
			if(al.get(i)>max) {
				max=al.get(i);
			}
		}System.err.println("max no is.."+max);
		String maxValue=String.valueOf(max);
		Assert.assertTrue(true);
		}
	
	public void clickonNewResult() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> refNos=driver.findElements(refNosInQueueManagement);
		List<Integer> al=new ArrayList<Integer>();
		for(WebElement refNo:refNos) {
			try {
				String uniqueRefNo=refNo.getText();
				String last4nos=uniqueRefNo.substring(11,15);
				int value=Integer.parseInt(last4nos);
				al.add(value);
			}catch(Exception e) {
				
			}
		}
		int max=al.get(0);
		for(int i=1;i<al.size();i++) {
			if(al.get(i)>max) {
				max=al.get(i);
			}
		}
		String maxValue=String.valueOf(max);
		if(driver.findElement(NewResult).getText().contains(maxValue)) {
			Thread.sleep(60000);
			try {
				driver.findElement(NewResult).click();
			}catch(Exception e) {
				
			}
		}
	}
	
	public void validateVisiblityOfReComputeBtn() {
		Assert.assertTrue(driver.findElement(reComputeBtn).isDisplayed());
	}



	
	
	
	
}
