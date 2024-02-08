package co.despegar.com.steps;

import co.despegar.com.pageObjects.homePageObjects;
import net.thucydides.core.annotations.Step;

public class homeSteps {
    homePageObjects homepageobjects = new homePageObjects();

    @Step
    public void openNavegation(){
        homepageobjects.open();
    }
    @Step
    public void writeCity(){
        homepageobjects.getDriver().findElement(homepageobjects.getTxtCity()).sendKeys("Bogota");
        homepageobjects.getDriver().findElement(homepageobjects.getBtnCity()).click();
    }

    @Step
    public void btnEntrace(){
        homepageobjects.getDriver().findElement(homepageobjects.getDateEntrance()).click();
    }

    @Step
    public void btnExit(){
        homepageobjects.getDriver().findElement(homepageobjects.getDateExit()).click();
    }

    @Step
    public void btnSearch(){
        homepageobjects.getDriver().findElement(homepageobjects.getBtnSearch()).click();
    }
}
