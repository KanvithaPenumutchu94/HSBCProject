package stepDefinations;

import java.io.IOException;

import com.factory.DriverFactory;
import com.pages.QM_OCR_Page;

import io.cucumber.java.en.When;

public class QM_OCR_Steps {
	
	QM_OCR_Page qmOcrPage=new QM_OCR_Page(DriverFactory.getDriver());
	
	@When("user selects date on statement")
	public void user_selects_date_on_statement() {
		qmOcrPage.clickOnCalenderBtn();
		qmOcrPage.clickOnPreviousMonthBtn();
		qmOcrPage.clickOnAnyDate();
	}

	@When("user enters HSBC sanctioned fund based limit")
	public void user_enters_hsbc_sanctioned_fund_based_limit() {
		qmOcrPage.enterValueInHSBCSanctionedFundBasedLimit();
	}

	@When("user clicks on details section")
	public void user_clicks_on_details_section() {
		qmOcrPage.clickOnDetailsTab();
	}

	@When("user clicks on stock value details and enters the values")
	public void user_clicks_on_stock_value_details_and_enters_the_values() throws IOException {
		  qmOcrPage.clickOnStockValueDetails();
		  qmOcrPage.enterValuesInStockValueDetails();
	}
	
	@When("user clicks on creditors value details and enters the values")
	public void user_clicks_on_creditors_value_details_and_enters_the_values() throws IOException {
		qmOcrPage.clickOnCreditorsValueDetails();
		qmOcrPage.enterValuesInCreditorsValueDetails();
	}
	
	@When("user clicks on post margin deductions value details and enters the values")
	public void user_clicks_on_post_margin_deductions_value_details_and_enters_the_values() throws IOException {
	    qmOcrPage.clickOnPostMarginDeductionsValueDetails();
	    qmOcrPage.enterValuesInPostMarginDeductionsValueDetails();
	}
	
	@When("user clicks on ageing details-domestic and enters the values")
	public void user_clicks_on_ageing_details_domestic_and_enters_the_values() throws IOException {
	   qmOcrPage.clickOnAgeingDetailsDomestic();
	   qmOcrPage.enterValuesOnAgeingDetailsDomestic();
	}
	
	@When("user clicks on ageing details-export and enter the values")
	public void user_clicks_on_ageing_details_export_and_enter_the_values() {
	    
	}

}
