package starter.stepdefenitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import people.People;

public class PeopleSteps {
    @Steps
    People People;

    @When("I click people button")
    public void clickPeopleButton(){
        People.clickPeopleButton();
    }
    @Then("I can see search feature in people page")
    public void searchFeature(){
        People.searchFeature();
    }
}
