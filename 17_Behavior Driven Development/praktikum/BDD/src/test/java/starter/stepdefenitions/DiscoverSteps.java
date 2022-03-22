package starter.stepdefenitions;

import discover.Discover;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DiscoverSteps {
    @Steps
    Discover Discover;

    @When("I click discover button")
    public void clickDiscoverButton(){
        Discover.clickDiscoverButton();
    }
    @Then("I am on discover page")
    public void onDiscoverPage(){
        Discover.onDiscoverPage();
    }
}
