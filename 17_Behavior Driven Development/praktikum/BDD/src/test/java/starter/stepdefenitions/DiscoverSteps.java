package starter.stepdefenitions;

import discover.Discover;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DiscoverSteps {
    @Steps
    discover.Discover Discover;

    @Given("I am on the home page")
    public void onHomePage(){
        Discover.onHomePage();
    }
    @When("I click discover button")
    public void clickDiscoberButton(){
        Discover.clickDiscoverButton();
    }
    @Then("I am on discover page")
    public void onDiscoverPage(){
        Discover.onDiscoverPage();
    }
}
