package stepDefinations;

import java.io.IOException;

import com.factory.DriverFactory;
import com.pages.QueueManagementPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueManagementSteps {

	QueueManagementPage queueManagementPage = new QueueManagementPage(DriverFactory.getDriver());

	@When("user clicks on Upload Statement button")
	public void user_clicks_on_upload_statement_button() {
		queueManagementPage.clickOnUploadStatementBtn();
	}

	@When("user clicks on Upload Statement PDF button")
	public void user_clicks_on_upload_statement_pdf_button() {
		queueManagementPage.clickOnUploadStatementPDFBtn();
	}

	@When("user picks customer from pick customer dropdown")
	public void user_picks_customer_from_pick_customer_dropdown() {
		queueManagementPage.pickCustomerFromDrpdwn();
	}

	@Then("user clicks on upload statement button below the dropdown")
	public void user_clicks_on_upload_statement_button_below_the_dropdown() throws IOException, InterruptedException {
		queueManagementPage.clickOnUploadStatementBtnBelowDrpdwn();
	}

	@When("user uploads Pdf Statement")
	public void user_uploads_pdf_statement() throws IOException, InterruptedException {
		queueManagementPage.uploadPdfFile();
	}

	@When("user clicks on Upload button")
	public void user_clicks_on_upload_button() throws InterruptedException {
		Thread.sleep(2000);
		queueManagementPage.clickOnUploadBtn();
	}
	
	@Then("validate Attention alert on top right corner")
	public void validate_attention_alert_on_top_right_corner() {
		queueManagementPage.attentionAlert();
	}

	@Then("validate Success alert on top right corner")
	public void validate_success_alert_on_top_right_corner() throws InterruptedException {
		queueManagementPage.successAlert();
	}


	@Then("validate new result added in customerId data table")
	public void validate_new_result_added_in_customer_id_data_table() throws InterruptedException {
		queueManagementPage.validateCustomerResultAddedInDataTable();
		//queueManagementPage.check();
	}
	
	@When("user clicks on new result in customer table")
	public void user_clicks_on_new_result_in_customer_table() throws InterruptedException {
		queueManagementPage.clickonNewResult();
	}

	@Then("user should see Recompute button in Stock Information page")
	public void user_should_see_recompute_button_in_stock_information_page() {
		queueManagementPage.validateVisiblityOfReComputeBtn();
	}







}
