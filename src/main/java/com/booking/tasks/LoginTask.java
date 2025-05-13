package com.booking.tasks;

import com.booking.interactions.WaitElement;
import com.booking.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.untilAppears(LoginPage.CLC_LOGIN),
                Click.on(LoginPage.CLC_LOGIN),
                Enter.theValue("email@gmail.com").into(LoginPage.TXT_EMAIL)
        );
            }

    public static LoginTask enter(){
    return Tasks.instrumented(LoginTask.class);
    }
}
