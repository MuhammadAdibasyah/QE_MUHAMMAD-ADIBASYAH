package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    //scenario 1
    @And("i click login button in bookstore page")
    public void clickLoginButtonInBookstore(){
        loginPage.clickLoginButtonOnBookstore();
    }

    @Given("i am on the login page")
    public void onLoginPage(){
        loginPage.validationOnLoginPage();
    }

    @When("i input valid username")
    public void inputValidUsername(){
        loginPage.inputUsername("dedebb");
    }

    @And("i input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("Password!2");
    }

    @And("i click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("i success login")
    public void successLogin(){
        loginPage.validationAfterLogin();
    }

    //scenario 2
    @When("i input invalid password")
    public void inputInvalidPassword(){
        loginPage.inputInvalidPassword("dedeb140700");
    }

    @Then("i failed to login and get error message")
    public void appearErrorMessage(){
        loginPage.appearErrorMessage();
    }

    //scenario 3
    @When("i not input username and password")
    public void notInputUsernamePassword(){
        loginPage.inputPassword("");
        loginPage.inputUsername("");
    }

    @Then("i get error message")
    public void iGetErrorMessage() {
        loginPage.getErrorMessage();
    }
}
