package StepDefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dayfeature {

	@Given("today is Sunday")
	public void today_is_sunday() {
		System.out.println("Inside step - today is sunday");
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_friday_yet() {
		System.out.println("Inside step -I asked whether it's Friday yet ");
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String string) {
		System.out.println("Inside step - should be told {string}");
	}
}
