package StepDefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginidfeature {

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		System.out.println("Inside step - I am  on the login page");
	}

	@When("I fill in {string} with {string}")
	public void i_fill_in_with(String string, String string2) {
		System.out.println("Inside step - I fill in {string} with {string}");
	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {
		System.out.println("Inside step - I click on the {string} button");
	}

	@Then("I should see the {string} page")
	public void i_should_see_the_page(String string) {
		System.out.println("Inside step - I should see the {string} page");
	}

}
