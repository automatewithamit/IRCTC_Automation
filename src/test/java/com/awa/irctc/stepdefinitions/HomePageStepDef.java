package com.awa.irctc.stepdefinitions;

import com.awa.framework.core.BrowserManager;
import com.awa.framework.core.ElementUtil;
import com.awa.framework.webelements.TextBox;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageStepDef {




    @Given("^User navigates to \"([^\"]*)\"$")
    public void userNavigatesTo(String url) {

    }

    @When("^user enters \"([^\"]*)\" Station in From field$")
    public void userEntersStationInFromField(String fromStation) {


    }

    @And("^user enters \"([^\"]*)\" Station in To field$")
    public void userEntersStationInToField(String toStation) {

    }

    @And("^Click on Search$")
    public void clickOnSearch() {

    }

    @Then("^User should be presented with train list from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userShouldBePresentedWithTrainList(String fromStation, String toStation) {

    }
}
