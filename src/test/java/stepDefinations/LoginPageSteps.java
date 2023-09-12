package stepDefinations;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;
import com.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver(),ConfigReader.init_prop());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://ssap.myidos.com/sign-in");
	}

	@When("user enters Email address")
	public void user_enters_email_address() {
		loginPage.enterEmailAddress();
	}
	
	@When("user enters Password")
	public void user_enters_password() {
	    loginPage.enterPassword();
	}

	@When("user clicks on Signin button")
	public void user_clicks_on_signin_button() {
		loginPage.clickOnSignin();
	}

	@Then("user should see Eco-System Management Portal")
	public void user_should_see_eco_system_management_portal() {
		loginPage.ValidateEcoSystem();
		System.out.println("Test Case passed successfully");
	}
	
	
	@Then("title should be {string}")
	public void title_should_be(String expectedTitle) {
		if(expectedTitle.equals(loginPage.validateTitle()))
		{
			Assert.assertTrue(true);
			System.out.println("Test Case passed successfully");
		}
	}
	
	@When("user enters invalid {string} in Email address")
	public void user_enters_invalid_in_Email_address(String inValidEmailId) {
	   loginPage.enterInvalidEmailId(inValidEmailId);
	}

	@When("user clicks on password field")
	public void user_clicks_on_password_field() {
	   loginPage.clickOnPassword();
	}

	@Then("user should able see {string} error message below the Email address text box")
	public void user_should_able_see_error_message_below_the_Email_address_text_box(String ExpectedErrMsg) {
	  loginPage.validateEmailErrorMessage(ExpectedErrMsg);
	}
	
	@When("user clicks on eye icon in password field")
	public void user_clicks_on_eye_icon_in_password_field() {
	   loginPage.clickOnPasswordEyeIconBtn();
	}


	@Then("user should able to see hidden password")
	public void user_should_able_to_see_hidden_password() {
	  loginPage.validateHiddenPasswordTxt();
	}




	

}
