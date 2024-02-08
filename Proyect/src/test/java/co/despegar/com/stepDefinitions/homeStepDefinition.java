package co.despegar.com.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import co.despegar.com.steps.homeSteps;

public class homeStepDefinition {

    @Steps
    homeSteps homeSteps;

    @Given("^the user stay in the page despegar$")
    public void theUserStayInThePageDespegar() {
        homeSteps.openNavegation();
    }


    @When("^the user fills out the form$")
    public void theUserFillsOutTheForm() {

    }

    @And("^choose rooms and pay$")
    public void chooseRoomsAndPay() {

    }

    @Then("^the user validation that he purchased the flight$")
    public void theUserValidationThatHePurchasedTheFlight() {

    }
}
