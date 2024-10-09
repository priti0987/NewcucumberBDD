package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class crmSteps {
	SeleniumDriverInfo sw;
	
	
	
	
	public crmSteps() {
	sw = new SeleniumDriverInfo();	
	
	}

	@Given("user is on Application home page")
	public void user_is_on_application_home_page1() {
	    // Write code here that turns the phrase above into concrete actions
	sw.openApp(); 
	
	}

	@Given("Login button is present on screen")
	public void login_button_is_present_on_screen() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user is show Login screen")
	public void user_is_show_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user clicks Login button")
	public void user_clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Title of home page is {string}")
	public void title_of_home_page_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("User is on Application home page")
	public void user_is_on_application_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user gets login failed error messages")
	public void user_gets_login_failed_error_messages() {
	    // Write code here that turns the phrase above into concrete actions
	}

}
