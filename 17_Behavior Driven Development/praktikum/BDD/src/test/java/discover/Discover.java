package discover;

import net.thucydides.core.annotations.Step;

public class Discover {

    @Step("I click discover button")
    public void clickDiscoverButton(){
        System.out.println("click discover button");

    }
    @Step("I am on discover page")
    public void onDiscoverPage(){
        System.out.println("on discover page");
    }
}
