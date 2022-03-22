package people;

import net.thucydides.core.annotations.Step;

public class People {

    @Step("I click people button")
    public void clickPeopleButton(){
        System.out.println("click people button");
    }
    @Step("I can see search feature in people page")
    public void searchFeature(){
        System.out.println("can see search feature");
    }
}
