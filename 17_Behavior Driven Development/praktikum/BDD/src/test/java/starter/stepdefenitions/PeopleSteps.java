package starter.stepdefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import people.People;

public class PeopleSteps {
    @Steps
    People People;

    @Given("I am on the home page")
    public void onHomePage(){
        People People;
    }

    @When("I click people button")
    public void clickPeopleButton(){
        People People;
    }
    @Then("I can see search feature in people page")
    public void searchFeature(){
        People People;
    }
}
