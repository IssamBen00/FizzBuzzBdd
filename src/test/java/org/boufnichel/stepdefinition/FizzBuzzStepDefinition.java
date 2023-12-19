package org.boufnichel.stepdefinition;



import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.boufnichel.FizzBuzz;

public class FizzBuzzStepDefinition {

  private FizzBuzz fizzBuzz;
  private String result;

  @Given("^Create a FizzBuzz game play$")
  public void createAFizzBuzzGamePlay() {
    fizzBuzz = new FizzBuzz();
  }

  @When("^I play with number (\\d+)$")
  public void iPlayWithNumber(int num) {
    result=fizzBuzz.play(num);
  }

  @Then("^The result is \"([^\"]*)\"$")
  public void theResultIs(String resultString) throws Throwable {
    assertThat(result).isEqualTo(resultString);
  }
}


