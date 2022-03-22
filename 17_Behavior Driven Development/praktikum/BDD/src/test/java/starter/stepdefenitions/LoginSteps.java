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
    @When("I enter invalid username and valid password")
    public void enterInvalidUsernameAndValidPassword(){
        login.enterInvalidUsernameAndValidPassword();

    }
    @Then("I am fail to login")
    public void failToLogin(){
        login.failToLogin();

    }
    @And("I get a notifications")
    public void getNotifications(){
        login.getNotifications();

    }
    @When("I enter valid username and invalid password")
    public void enterValidUsernameAndInvalidPassword(){
        login.enterValidUsernameAndInvalidPassword();

    }
    @When("I enter invalid username and password")
    public void enterInvalidUsernameAndPassword(){
        login.enterInvalidUsernameAndPassword();

    }
}
