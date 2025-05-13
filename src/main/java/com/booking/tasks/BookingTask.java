package com.booking.tasks;

import com.booking.interactions.WaitElement;
import com.booking.userinterfaces.BookingPage;
//import com.booking.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
//import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
//import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookingTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String destino = "Santa Marta";
        //Calcular fechas dinámicas
        LocalDate today = LocalDate.now();
        LocalDate checkInDate = today.plusDays(2);
        LocalDate checkOutDate = today.plusDays(7);

        // Formatear fechas al formato que Booking espera (yyyy-MM-dd)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String checkIn = checkInDate.format(formatter);
        String checkOut = checkOutDate.format(formatter);

        actor.attemptsTo(
                WaitElement.untilAppears(BookingPage.DESTINATION_INPUT),
                Enter.theValue(destino).into(BookingPage.DESTINATION_INPUT),

                WaitUntil.the(BookingPage.suggestionOptionWith(destino), isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BookingPage.suggestionOptionWith(destino)),
                // Abrir calendario
                // Doble clic necesario: el primer clic abre brevemente el calendario, el segundo lo mantiene abierto
                Click.on(BookingPage.CALENDAR),
                Click.on(BookingPage.CALENDAR),

                // Seleccionar fechas
                WaitUntil.the(BookingPage.calendarDate(checkIn), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BookingPage.calendarDate(checkIn)),

                WaitUntil.the(BookingPage.calendarDate(checkOut), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BookingPage.calendarDate(checkOut)),

                //Seleccionar personas
                Click.on(BookingPage.PEOPLES),
                // Aumentar adultos de 2 → 3
                Click.on(BookingPage.ADULTS_INCREMENT_BUTTON),
                // Aumentar niños de 0 → 2
                Click.on(BookingPage.CHILDREN_INCREMENT_BUTTON),
                Click.on(BookingPage.CHILDREN_INCREMENT_BUTTON),
               // WaitUntil.the(BookingPage.CHILD_AGE_DROPDOWN1, isVisible()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byValue("4").from(BookingPage.CHILD_AGE_DROPDOWN1),
                Click.on(BookingPage.PEOPLES),
                //WaitUntil.the(BookingPage.CHILD_AGE_DROPDOWN2, isVisible()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byValue("6").from(BookingPage.CHILD_AGE_DROPDOWN2),
                Click.on(BookingPage.PEOPLES),
                // Aumentar habitaciones de 1 → 2
                Click.on(BookingPage.ROOMS_INCREMENT_BUTTON),
                Click.on(BookingPage.BUTTON_READY),
                Click.on(BookingPage.BUTTON_SEARCH),
                AdjustPriceSliderTask.toCOP200K(),
                Click.on(BookingPage.THREE_STARS_FILTER),
                Click.on(BookingPage.SORT_DROPDOWN),
                WaitUntil.the(BookingPage.LOWEST_PRICE_OPTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BookingPage.LOWEST_PRICE_OPTION),
                Click.on(BookingPage.FIRST_HOTEL_AVAILABILITY_BUTTON)

        //WaitElement.untilAppears(BookingPage.SUGGESTION_OPTION),
                //Click.on(BookingPage.SUGGESTION_OPTION)
               //Hit.the(Keys.ARROW_DOWN).into(BookingPage.DESTINATION_INPUT),
               //Hit.the(Keys.ENTER).into(BookingPage.DESTINATION_INPUT)


                //Click.on(LoginPage.CLC_LOGIN)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static BookingTask search(){

        return Tasks.instrumented(BookingTask.class);
    }

}
