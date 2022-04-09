package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class BookstorePage extends PageObject {
    private By featureBookstore(){
        return By.xpath("(//div[@class='card mt-4 top-card'])[6]");
    }
    private By title(){
        return By.xpath("//div[@text()='Book Store']");
    }
    private By book(){
        return By.id("see-book-Git Pocket Guide");
    }
    private By isbn(){
        return By.xpath("(//label[@id='userName-value'])[1]");
    }

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
}
