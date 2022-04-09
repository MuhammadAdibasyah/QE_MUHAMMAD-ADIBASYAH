package starter.stepdefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BookstorePage;

public class BookstoreSteps {
    @Steps
    BookstorePage bookstorePage;

    @Given("i am on the bookstore page")
    public void onBookstorePage(){
        bookstorePage.clickFeatureBookstore();
        bookstorePage.validationOnBookstorePage();

    }
    @When("i click one of existing book")
    public void clickBookExisting(){
        bookstorePage.clickExistingBook();

    }
    @Then("i can see about this book")
    public void seeAboutBook(){
        bookstorePage.validationOnBook();
    }
}
