package com.booking.questions;

import com.booking.userinterfaces.BookingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ReserveButtonIsVisible implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BookingPage.RESERVE_BUTTON.resolveFor(actor).isVisible();
    }

    public static ReserveButtonIsVisible isDisplayed() {
        return new ReserveButtonIsVisible();
    }
}

