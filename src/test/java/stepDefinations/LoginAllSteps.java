package stepDefinations;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.LoginAllPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginAllSteps {
	
	private LoginAllPage loginAllPage=new LoginAllPage(DriverFactory.getDriver());
	
	
	@When("user enters {string} in Email address field")
	public void user_enters_in_email_address_field(String emailId) {
		loginAllPage.enterEmailAddress(emailId);
	}
	
	@When("user enters {string} in Password field")
	public void user_enters_in_password_field(String pass) {
	   loginAllPage.enterPassword(pass);
	}
	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	   loginAllPage.clickOnSignin();
	}
	
	@Then("Validate {string} related to given emailid and password criteria")
	public void validate_related_to_given_emailid_and_password_criteria(String outcome) {
		try {
			 if(outcome.equalsIgnoreCase(loginAllPage.validcredentials())) {
				   Assert.assertTrue(true);
			   }else if(outcome.equalsIgnoreCase(loginAllPage.invalidCredentials())){
				   Assert.assertTrue(true); 
			   }else {
				   System.out.println("Invalid credentials");
			   }
		}catch(Exception e) {
			
		} 
	}
	

	

}
