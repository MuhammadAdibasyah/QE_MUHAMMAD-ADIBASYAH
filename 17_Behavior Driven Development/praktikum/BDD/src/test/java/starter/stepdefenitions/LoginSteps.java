package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.Login;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.onTheLoginPage();

    }
    @When("I enter my valid username and password")
    public void enterUsernameAndPassword(){
        login.enterUsernameAndPassword();

    }
    @And("I click login button")
    public void clickLoginButton(){
        login.clickLoginButton();

    }
    @Then("I am on the home page")
    public void onTheHomrPage(){
        login.onTheHomrPage();

    }
}
