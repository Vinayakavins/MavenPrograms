package StepDefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pasfeature {

	@When("the Maker starts a game")
	public void the_maker_starts_a_game() {
		System.out.println("Inside step - User starts a game ");
	}

	@Then("the Maker waits for a Breaker to join")
	public void the_maker_waits_for_a_breaker_to_join() {
		System.out.println("Inside step - Maker waits for a Breaker to join ");
	}

	@Given("the Maker has started a game with the word {string}")
	public void the_maker_has_started_a_game_with_the_word(String string) {
		System.out.println("Inside step - Maker starts a game with the word {string}");
	}

	@When("the Breaker joins the Maker's game")
	public void the_breaker_joins_the_maker_s_game() {
		System.out.println("Inside step - Breaker joins the Maker's game");
	}

	@Then("the Breaker must guess a word with {int} characters")
	public void the_breaker_must_guess_a_word_with_characters(Integer int1) {
		System.out.println("Inside step - Breaker should guess a word with {int} characters ");
	}
	
}
