package StepDefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signupfeature {

	@Given("I am on the signup page")
	public void i_am_on_the_signup_page() {
		System.out.println("Inside step - I am on the signup page");
	}

	@When("I fill out the form with my information")
	public void i_fill_out_the_form_with_my_information() {
		System.out.println("Inside step - fill out the form with my information");
	}

	@Then("I should see a confirmation message")
	public void i_should_see_a_confirmation_message() {
		System.out.println("Inside step - should see a confirmation message");
	}
}
