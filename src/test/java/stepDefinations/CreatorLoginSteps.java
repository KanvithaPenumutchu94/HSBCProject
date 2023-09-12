package stepDefinations;

import com.factory.DriverFactory;
import com.pages.CreatorLoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatorLoginSteps {

	CreatorLoginPage creatorLoginPage = new CreatorLoginPage(DriverFactory.getDriver());

	@When("user clicks on Creator Login button")
	public void user_clicks_on_creator_login_button() {
		creatorLoginPage.clickOnCreatorLogin();
	}

	@Then("user should able to see creator home page")
	public void user_should_able_to_see_creator_home_page() {
		creatorLoginPage.validateHomeLable();
	}

	@Then("user enters CustomerId in Search Customer box")
	public void user_enters_customer_id_in_search_customer_box() {
		creatorLoginPage.enterCustomerId();
	}

	@Then("user press ENTER key")
	public void user_press_enter_key() {
		creatorLoginPage.clickOnEnterKey();
	}

	@Then("validate results based on customerId in data table")
	public void validate_results_based_on_customer_id_in_data_table() {
		creatorLoginPage.validateCustomerIdResults();
		System.out.println("done");
	}

}
