package com.booking.stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed
    WebDriver hisDriver;

    @Before
    public void setUP() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }

    @After
    public void setUpFinish()
    {
        hisDriver.close();
    }
}
