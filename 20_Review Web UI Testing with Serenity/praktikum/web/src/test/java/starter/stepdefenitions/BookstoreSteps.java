package starter.stepdefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BookstorePage;
import starter.pages.HomePage;

public class BookstoreSteps {
    @Steps
    BookstorePage bookstorePage;

    @Steps
    HomePage homePage;

    @Given("i am on the home page")
    public void onBookstorePage(){
        homePage.openPage();
        homePage.validationHomePage();

    }
    @When("i click feature bookstore")
    public void clickFeatureBookstore(){
        bookstorePage.clickFeatureBookstore();

    }
    @Then("i can see bookstore page")
    public void seeBookstorePage(){
        bookstorePage.validationOnBookstorePage();
    }

    @Given("i am on the bookstore page")
    public void onTheBookstorePage(){
        bookstorePage.validationOnBookstorePage();

    }
    @When("i chose one of existing book")
    public void choseExistingBook(){
        bookstorePage.clickExistingBook();

    }
    @Then("i can see about book")
    public void seeAboutBook(){
        bookstorePage.validationOnBook();
    }
}
