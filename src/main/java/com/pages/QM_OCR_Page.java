package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.util.ExcelReader;


public class QM_OCR_Page {
	
	WebDriver driver;
	
	public QM_OCR_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	By calenderBtn=By.xpath("(//button[@aria-label='Open calendar'])[1]");
	By previousMonthbtn=By.xpath("(//button[@aria-label='Previous month'])[1]");
	By calenderDates=By.xpath("//table[@class='mat-calendar-table']/tbody/tr/td");
	By HSBCSanctionedFundBasedLimit=By.xpath("//ssap-input[@formcontrolname='stockInformationHsbcSanctionedFundBasedLimit']");
	By DetailsTab=By.xpath("//strong[text()='Details']");
	
	By StockValueDetailsBtn=By.xpath("//mat-panel-title[text()=' Stock Value Details ']");
	By rmGrossValue_txt=By.xpath("//ssap-input[@formcontrolname='stockRmGrossValue']/..");
	By fgGrossValue_txt=By.xpath("//ssap-input[@formcontrolname='stockFgGrossValue']/../..");
	By wipGrossValue_txt=By.xpath("//ssap-input[@formcontrolname='stockWipGrossValue']/../..");
	By cunsumablesGrossValue=By.xpath("//ssap-input[@formcontrolname='stockConsumablesGrossValue']/../..");
	By stockAgainstLcGrossValue=By.xpath("//ssap-input[@formcontrolname='stockStockAgainstLcGrossValue']/../..");
	By stockInTransitGrossValue=By.xpath("//ssap-input[@formcontrolname='stockStockInTransitGrossValue']/../..");
	By stockWithThirdPartyGrossValue=By.xpath("//ssap-input[@formcontrolname='stockStockWithThirdPartyGrossValue']/../..");
	By scrapStockGrossValue=By.xpath("//ssap-input[@formcontrolname='stockScrapStockGrossValue']/../..");
	
	By creditorsValueDetails_tab=By.xpath("//mat-panel-title[text()=' Creditors Value Details ']/../..");
	By creditorsUnderLcCreditorsValue=By.xpath("//ssap-input[@formcontrolname='creditorsCreditorsUnderLc']/../..");
	By creditorsOthersCreditorsValue=By.xpath("//ssap-input[@formcontrolname='creditorsCreditorsOthers']/../..");
	By advancePaidToSuppliersCreditorsValue=By.xpath("//ssap-input[@formcontrolname='creditorsAdvancePaidToSuppliers']/../..");

	By postMarginDeductionsValueDetails_tab=By.xpath("//mat-panel-title[text()=' Post Margin Deductions Value Details ']");
	By buyersCreditDeductionsValue=By.xpath("//ssap-input[@formcontrolname='postMarginDeductionsBuyerCredit']/../..");
	By commercialPaperDeductionsValue=By.xpath("//ssap-input[@formcontrolname='postMarginDeductionsCommercialPaper']/../..");
	
	By  ageingDetailsDomestic_tab=By.xpath("//mat-panel-title[text()=' Ageing Details - Domestic ']/../.."); 
	By ageingDetailsDomestic030DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic030DaysDomesticDebitors']/../..");
	By ageingDetailsDomestic3060DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic3060DaysDomesticDebitors']/../..");
	By ageingDetailsDomestic6090DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic6090DaysDomesticDebitors']/../..");
	By ageingDetailsDomestic3090DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic3090DaysDomesticDebitors']/../..");
	By ageingDetailsDomestic045DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic045DaysDomesticDebitors']/../..");
	By ageingDetailsDomestic4590DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic4590DaysDomesticDebitors']/../..");
	By ageingDetailsDomestic91120DaysDomesticDebtors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic91120DaysDomesticDebtors']/../..");
	By ageingDetailsDomestic121150DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic121150DaysDomesticDebitors']/../..");
	By ageingDetailsDomestic151180DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic151180DaysDomesticDebitors']/../..");
	By ageingDetailsDomestic121180DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic121180DaysDomesticDebitors']/../..");
	By ageingDetailsDomestic181365DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic181365DaysDomesticDebitors']/../..");
	By ageingDetailsDomesticAbove365DaysDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomesticAbove365DaysDomesticDebitors']/../..");
	By ageingDetailsDomesticOthersDomestic=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomesticOthersDomestic']/../..");
	By ageingDetailsDomesticBillDiscountedDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomesticBillDiscountedDomesticDebitors']/../..");
	By ageingDetailsDomesticAdvanceFromCustomersDomesticDebitors=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomesticAdvanceFromCustomersDomesticDebitors']/../..");
	
	By AgeindDetailsExport=By.xpath("//mat-panel-title[text()=' Ageing Details - Export ']/../..");
	By ageingDetailsExport030Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport030Days']/../..");
	By ageingDetailsExport3060Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport3060Days']/../..");
	By ageingDetailsExport6090Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport6090Days']/../..");
	By ageingDetailsExport3090Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport3090Days']/../..");
	By ageingDetailsExport045Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport045Days']/../..");
	By ageingDetailsExport4590Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport4590Days']/../..");
	By ageingDetailsExport91120Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport91120Days']/../..");
	By ageingDetailsExport121150Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport121150Days']/../..");
	By ageingDetailsExport151180Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport151180Days']/../..");
	By ageingDetailsExport121180Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport121180Days']/../..");
	By ageingDetailsExport181365Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport181365Days']/../..");
	By ageingDetailsExportAbove365Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExportAbove365Days']/../..");
	By ageingDetailsExportOthers=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExportOthers']/../..");
	
	
	
	public void clickOnCalenderBtn() {
		driver.findElement(calenderBtn).click();
	}
	
	public void clickOnPreviousMonthBtn() {
		driver.findElement(previousMonthbtn).click();;
	}
	
	public void clickOnAnyDate() {
		List<WebElement> allDates=driver.findElements(calenderDates);
		for(WebElement date:allDates) {
			String d=date.getText();
			if(d.equals(" 20 ")) {
				date.click();
			}
		}
	}
	
	public void enterValueInHSBCSanctionedFundBasedLimit() {
		driver.findElement(HSBCSanctionedFundBasedLimit).click();
		driver.findElement(HSBCSanctionedFundBasedLimit).clear();
		driver.findElement(HSBCSanctionedFundBasedLimit).sendKeys("100");
	}
	
	public void clickOnDetailsTab() {
		driver.findElement(DetailsTab).click();
	}
	
	public void clickOnStockValueDetails() {
		driver.findElement(StockValueDetailsBtn).click();
	}
	
	public void enterValuesInStockValueDetails() throws IOException
	{
		//String rM=(String) ExcelReader.getData("GN_Marketing","Details","RM").get(1);
		String rmValue=(String) ExcelReader.getData("GN_Marketing", "Details", "RM").get(1);
		driver.findElement(rmGrossValue_txt).clear();
		driver.findElement(rmGrossValue_txt).sendKeys(rmValue);
		
		String fgValue=(String) ExcelReader.getData("GN_Marketing", "Details", "FG").get(1);
		driver.findElement(fgGrossValue_txt).clear();
		driver.findElement(fgGrossValue_txt).sendKeys(fgValue);
		
		String wipValue=(String) ExcelReader.getData("GN_Marketing", "Details", "WIP").get(1);
		driver.findElement(wipGrossValue_txt).clear();
		driver.findElement(wipGrossValue_txt).sendKeys(wipValue);
		
		String consumablesValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Consumables").get(1);
		driver.findElement(cunsumablesGrossValue).clear();
		driver.findElement(cunsumablesGrossValue).sendKeys(consumablesValue);
		
		String stockAgainstLCValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Stock against LC").get(1);
		driver.findElement(stockAgainstLcGrossValue).clear();
		driver.findElement(stockAgainstLcGrossValue).sendKeys(stockAgainstLCValue);
		
		String stockInTransitValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Stock in Transit").get(1);
		driver.findElement(stockInTransitGrossValue).clear();
		driver.findElement(stockInTransitGrossValue).sendKeys(stockInTransitValue);
		
		String stockWithThirdPartyValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Stock with third party").get(1);
		driver.findElement(stockWithThirdPartyGrossValue).clear();
		driver.findElement(stockWithThirdPartyGrossValue).sendKeys(stockWithThirdPartyValue);
		
		String scrapStockValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Scrap Stock").get(1);
		driver.findElement(scrapStockGrossValue).clear();
		driver.findElement(scrapStockGrossValue).sendKeys(scrapStockValue);
		
	}
	
	public void clickOnCreditorsValueDetails() {
		driver.findElement(creditorsValueDetails_tab).click();
	}
	
	public void enterValuesInCreditorsValueDetails() throws IOException {
		String creditorsUnderLCValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Creditors Under LC").get(1);
		driver.findElement(creditorsUnderLcCreditorsValue).clear();
		driver.findElement(creditorsUnderLcCreditorsValue).sendKeys(creditorsUnderLCValue);
		
		String creditorsOthersValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Creditors Others").get(1);
		driver.findElement(creditorsOthersCreditorsValue).clear();
		driver.findElement(creditorsOthersCreditorsValue).sendKeys(creditorsOthersValue);
		
		String advancePaidToSuppliersValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Advance paid to Suppliers").get(1);
		driver.findElement(advancePaidToSuppliersCreditorsValue).clear();
		driver.findElement(advancePaidToSuppliersCreditorsValue).sendKeys(advancePaidToSuppliersValue);
	}
	
	public void clickOnPostMarginDeductionsValueDetails() {
		driver.findElement(postMarginDeductionsValueDetails_tab).click();
	}
	
	public void enterValuesInPostMarginDeductionsValueDetails() throws IOException {
		String buyersCreditValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Buyer's Credit").get(1);
		driver.findElement(buyersCreditDeductionsValue).clear();
		driver.findElement(buyersCreditDeductionsValue).sendKeys(buyersCreditValue);
		
		String commercialPaperValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Commercial Paper").get(1);
		driver.findElement(commercialPaperDeductionsValue).clear();
		driver.findElement(commercialPaperDeductionsValue).sendKeys(commercialPaperValue);
		
	}
	
	public void clickOnAgeingDetailsDomestic() {
		driver.findElement(ageingDetailsDomestic_tab).click();
	}
	
	public void enterValuesOnAgeingDetailsDomestic() throws IOException {
		String ageingDetailsDomestic030DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "0-30 Days").get(1);
		driver.findElement(ageingDetailsDomestic030DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic030DaysDomesticDebitors).sendKeys(ageingDetailsDomestic030DaysValue);
		
		String ageingDetailsDomestic3060DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_31-60 Days / 0-60 days / upto 60 Days").get(1);
		driver.findElement(ageingDetailsDomestic3060DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic3060DaysDomesticDebitors).sendKeys(ageingDetailsDomestic3060DaysValue);
		
		String ageingDetailsDomestic6090DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_61-90 Days / Above 60 Days").get(1);
		driver.findElement(ageingDetailsDomestic6090DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic6090DaysDomesticDebitors).sendKeys(ageingDetailsDomestic6090DaysValue);
		
		String ageingDetailsDomestic3090DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_31-90 Days / 0-90 Days / upto 90 Days").get(1);
		driver.findElement(ageingDetailsDomestic3090DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic3090DaysDomesticDebitors).sendKeys(ageingDetailsDomestic3090DaysValue);
		
		String ageingDetailsDomestic045DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_0-45 Days / upto 45 Days").get(1);
		driver.findElement(ageingDetailsDomestic045DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic045DaysDomesticDebitors).sendKeys(ageingDetailsDomestic045DaysValue);
		
		String ageingDetailsDomestic4590DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_46-90 Days / Above 45 Days").get(1);
		driver.findElement(ageingDetailsDomestic4590DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic4590DaysDomesticDebitors).sendKeys(ageingDetailsDomestic4590DaysValue);
		
		String ageingDetailsDomestic91120DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_91-120 Days / Above 90 Days / upto 120 Days / 61-120 days").get(1);
		driver.findElement(ageingDetailsDomestic91120DaysDomesticDebtors).clear();
		driver.findElement(ageingDetailsDomestic91120DaysDomesticDebtors).sendKeys(ageingDetailsDomestic91120DaysValue);
		
		String ageingDetailsDomestic121150DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_121-150 Days / Above 120 Days / 61-150 Days / 91-150 Days / upto 150 Days").get(1);
		driver.findElement(ageingDetailsDomestic121150DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic121150DaysDomesticDebitors).sendKeys(ageingDetailsDomestic121150DaysValue);
		
		String ageingDetailsDomestic151180DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_151-180 Days / Above 150 Days").get(1);
		driver.findElement(ageingDetailsDomestic151180DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic151180DaysDomesticDebitors).sendKeys(ageingDetailsDomestic151180DaysValue);
		
		String ageingDetailsDomestic121180DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_121-180 Days / upto 180 Days / 61-180 days / 91-180 days").get(1);
		driver.findElement(ageingDetailsDomestic121180DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic121180DaysDomesticDebitors).sendKeys(ageingDetailsDomestic121180DaysValue);
		
		String ageingDetailsDomestic181365DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_181-365 Days / Above 180 Days / upto 270 Days / upto 1 year").get(1);
		driver.findElement(ageingDetailsDomestic181365DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomestic181365DaysDomesticDebitors).sendKeys(ageingDetailsDomestic181365DaysValue);
		
		String ageingDetailsDomesticAbove365DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_Above 365 Days / Above 270 Days").get(1);
		driver.findElement(ageingDetailsDomesticAbove365DaysDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomesticAbove365DaysDomesticDebitors).sendKeys(ageingDetailsDomesticAbove365DaysValue);
		
		String ageingDetailsDomesticOthersValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_Others (Eligible Debtors in case of Debtors days 'Others')").get(1);
		driver.findElement(ageingDetailsDomesticOthersDomestic).clear();
		driver.findElement(ageingDetailsDomesticOthersDomestic).sendKeys(ageingDetailsDomesticOthersValue);
		
		String ageingDetailsDomesticBillDiscountedValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Bill Discounted").get(1);
		driver.findElement(ageingDetailsDomesticBillDiscountedDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomesticBillDiscountedDomesticDebitors).sendKeys(ageingDetailsDomesticBillDiscountedValue);
		
		String ageingDetailsDomesticAdvanceFromCustomersValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Advance from Customers").get(1);
		driver.findElement(ageingDetailsDomesticAdvanceFromCustomersDomesticDebitors).clear();
		driver.findElement(ageingDetailsDomesticAdvanceFromCustomersDomesticDebitors).sendKeys(ageingDetailsDomesticAdvanceFromCustomersValue);
	}
	
	public void clickOnAgeingDetailsExport() {
		driver.findElement(AgeindDetailsExport).click();
	}
	
	public void enterValusInAgeingDetailsExport() throws IOException {
		String Export030DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_0-30 Days").get(1);
		driver.findElement(ageingDetailsExport030Days).click();
		driver.findElement(ageingDetailsExport030Days).sendKeys(Export030DaysValue);
				
		String Export3060DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_31-60 Days / 0-60 days / upto 60 Days").get(1);
		driver.findElement(ageingDetailsExport3060Days).clear();
		driver.findElement(ageingDetailsExport3060Days).sendKeys(Export3060DaysValue);
		
		String Export6090DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_61-90 Days / Above 60 Days").get(1);
		driver.findElement(ageingDetailsExport6090Days).clear();
		driver.findElement(ageingDetailsExport6090Days).sendKeys(Export6090DaysValue);
		
		
		String Export3090DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_31-90 Days / 0-90 Days / upto 90 Days").get(1);
		driver.findElement(ageingDetailsExport3090Days).clear();
		driver.findElement(ageingDetailsExport3090Days).sendKeys(Export3090DaysValue);
		
		
		String Export045DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_0-45 Days / upto 45 Days").get(1);
		driver.findElement(ageingDetailsExport045Days).clear();
		driver.findElement(ageingDetailsExport045Days).sendKeys(Export045DaysValue);
		
		String Export4590DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_46-90 Days / Above 45 Days").get(1);
		driver.findElement(ageingDetailsExport4590Days).clear();
		driver.findElement(ageingDetailsExport4590Days).sendKeys(Export4590DaysValue);
		
		String Export91120DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_91-120 Days / Above 90 Days / upto 120 Days / 61-120 days").get(1);
		driver.findElement(ageingDetailsExport91120Days).clear();
		driver.findElement(ageingDetailsExport91120Days).sendKeys(Export91120DaysValue);
		
		String Export121150DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_121-150 Days / Above 120 Days / 61-150 Days / 91-150 Days / upto 150 Days").get(1);
		driver.findElement(ageingDetailsExport121150Days).clear();
		driver.findElement(ageingDetailsExport121150Days).sendKeys(Export121150DaysValue);
		
		String Export151180DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_151-180 Days / Above 150 Days").get(1);
		driver.findElement(ageingDetailsExport151180Days).clear();
		driver.findElement(ageingDetailsExport151180Days).sendKeys(Export151180DaysValue);
				
		String Export121180DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_121-180 Days / upto 180 Days / 61-180 days / 91-180 days").get(1);
		driver.findElement(ageingDetailsExport121180Days).clear();
		driver.findElement(ageingDetailsExport121180Days).sendKeys(Export121180DaysValue);
		
		String Export181365DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_181-365 Days / Above 180 Days / upto 270 Days / upto 1 year").get(1);
		driver.findElement(ageingDetailsExport181365Days).clear();
		driver.findElement(ageingDetailsExport181365Days).sendKeys(Export181365DaysValue);
		
		String ExportAbove365DaysValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_Above 365 Days / Above 270 Days").get(1);
		driver.findElement(ageingDetailsExportAbove365Days).clear();
		driver.findElement(ageingDetailsExportAbove365Days).sendKeys(ExportAbove365DaysValue);
		
		String ExportOthersValue=(String) ExcelReader.getData("GN_Marketing", "Details", "Export_Others (Eligible Debtors in case of Debtors days 'Others')").get(1);
		driver.findElement(ageingDetailsExportOthers).clear();
		driver.findElement(ageingDetailsExportOthers).sendKeys(ExportOthersValue);
	
	}
	
	////div[@id='cdk-accordion-child-5']//mat-list-item//ssap-input/../..
	//for(int i=0;i<)
	
	
	
	
}
