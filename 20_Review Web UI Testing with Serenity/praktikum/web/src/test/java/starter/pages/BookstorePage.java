package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class BookstorePage extends PageObject {
    //element
    private By featureBookstore(){
        return By.xpath("(//div[@class='card mt-4 top-card'])[6]");
    }

    private By title(){
        return By.className("main-header");
    }

    private By book(){
        return By.xpath("(//div[@class='action-buttons'])[1]");
    }

    private By isbn(){
        return By.xpath("(//label[@id='userName-value'])[1]");
    }
    private By searchBox(){
        return By.xpath("(//input[@class='form-control'])");
    }

    //function
    @Step
    public void clickFeatureBookstore(){
        $(featureBookstore()).click();
    }

    @Step
    public boolean validationOnBookstorePage(){
        return $(title()).isDisplayed();
    }

    @Step
    public void clickExistingBook(){
        $(book()).click();
    }

    @Step
    public boolean validationOnBook(){
        return $(isbn()).isDisplayed();
    }

    @Step
    public void inputValidKeyword(String keyword){
        $(searchBox()).type(keyword);
    }

    @Step
    public boolean validationKeyword(){
        return $(searchBox()).isDisplayed();
    }
}
