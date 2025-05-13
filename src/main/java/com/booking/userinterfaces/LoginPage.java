package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target CLC_LOGIN = Target.the("login button")
            .locatedBy("[data-testid='header-sign-in-button']");

    public static final Target TXT_EMAIL = Target.the("email")
            .locatedBy("//input[@id='username']");

}
