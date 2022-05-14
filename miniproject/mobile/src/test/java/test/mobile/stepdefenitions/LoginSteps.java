package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.mobile.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    //scenario1
    @Given("android user on landing screen")
    public void onLandingPage(){
        loginPage.clickIconLogin();
        boolean actual = loginPage.onLoginPage();
        Assert.assertTrue(actual);
    }

    @When("android user input valid email")
    public void inputValidEmail(String email){
        loginPage.inputValidEmail("debbb@gmail.com");
    }

    @And("android user input valid password")
    public void inputValidPassword(String password){
        loginPage.inputValidPassword("123");
    }

    @And("android user click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("android user see homepage")
    public void seeHomepage(){
        boolean actual = loginPage.onHomePage();
        Assert.assertTrue(actual);
    }

    //scenario2
    @When("android user input unregistered email")
    public void androidUserInputUnregisteredEmail(String email) {
        loginPage.inputInValidEmail("ucok123@gmail.com");
    }

    @And("android user input password")
    public void androidUserInputPassword(String password) {
        loginPage.inputInValidPassword("123");
    }

    @And("android user tap login button")
    public void androidUserTapLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("android user see {string} message")
    public void androidUserSeeMessage(String message) {
        String actual = loginPage.getErrorMessage();
        Assert.assertEquals(actual,message);
    }
}
