package StepDefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calfeature {

	@Given("I have a calculator")
	public void i_have_a_calculator() {
		 System.out.println("Inside step - I have a calculator ");
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
		System.out.println("Inside step - I should add {int} and {int}");
	}

	@Then("the result should be {int}")
	public void the_result_should_be(Integer int1) {
		System.out.println("Inside step - Result should be {int}");
	}
}
