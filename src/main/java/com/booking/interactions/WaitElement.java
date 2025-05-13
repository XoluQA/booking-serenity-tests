package com.booking.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitElement implements Interaction {
    private Target target;
    private  String state;

    public WaitElement(Target target, String state) {
        this.target = target;
        this.state = state;
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        switch (state){
            case "Visible":
                waitAs(actor).until(ExpectedConditions.visibilityOf(target.resolveFor(actor)));
                break;
            case "Invisible":
                waitAs(actor).until(ExpectedConditions.invisibilityOf(target.resolveFor(actor)));
                break;
            case "Enabled":
                waitAs(actor).until(ExpectedConditions.elementToBeClickable(target.resolveFor(actor)));

        }

    }

    private WebDriverWait waitAs(Actor actor)
    { return new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(8000));}


    public static WaitElement untilAppears(Target target){
        return Tasks.instrumented(WaitElement.class,target,"Visible");

    }

    public static WaitElement untilDisappears(Target target){
        return Tasks.instrumented(WaitElement.class,target,"Invisible");
    }

    public static WaitElement untilBeEnable(Target target){
        return Tasks.instrumented(WaitElement.class,target,"Enabled");
    }

}
