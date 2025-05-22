package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookingPage {
    public static final Target DESTINATION_INPUT = Target.the("destination input")
            .locatedBy("//input[@name='ss']");
    public static Target  suggestionOptionWith(String value) {
        return Target.the("suggested destination")
                .locatedBy("//div[contains(@class, 'b08850ce41') and contains(normalize-space(),'" + value + "')]");
    }
    public static Target CALENDAR = Target.the("open calendar")
            .locatedBy("//button[@class='de576f5064 dc15842869 e84058595b f1f96fdf10 d10abb4e59']");
    public static Target PEOPLES = Target.the("peoples")
            .locatedBy("//button[@data-testid='occupancy-config']");

    public static Target calendarDate(String date) {
        return Target.the("calendar date " + date)
                .locatedBy("//span[@data-date='" + date + "']");
    }
    public static Target ADULTS_INCREMENT_BUTTON = Target.the("increase adults button")
            .locatedBy("(//button[@type='button'])[8]");
    public static Target CHILDREN_INCREMENT_BUTTON = Target.the("increase children button")
            .locatedBy("(//button[@type='button'])[10]");
    //public static final Target CHILD_AGE_DROPDOWN =  Target.the("age dropdown for child number {0}")
    //       .locatedBy("(//select[contains(@name, 'age')])[{0}]");
    public static Target CHILD_AGE_DROPDOWN1 = Target.the("first child age dropdown")
              .locatedBy("(//select[@name='age'])[1]");
    public static Target CHILD_AGE_DROPDOWN2 = Target.the("second child age dropdown")
            .locatedBy("(//select[@name='age'])[2]");
    public static Target ROOMS_INCREMENT_BUTTON = Target.the("increase rooms button")
            .locatedBy("(//button[@type='button'])[12]");
    public static Target BUTTON_READY = Target.the("button ready")
            .locatedBy("//button[span[normalize-space()='Listo']]");
    public static Target BUTTON_SEARCH = Target.the("button search")
            .locatedBy("//button[span[normalize-space()='Buscar']]");
    public static Target THREE_STARS_FILTER = Target.the("3 stars filter")
            .locatedBy("//input[@name='class=3']");
    public static Target SORT_DROPDOWN = Target.the("sort dropdown")
            .locatedBy("//span[contains(text(), 'Ordenar por')]");
    public static Target LOWEST_PRICE_OPTION = Target.the("lowest price sort option")
            .locatedBy("//button[@data-id='price']");
    public static Target FIRST_HOTEL_AVAILABILITY_BUTTON = Target.the("first hotel availability button")
            .locatedBy("(//div[@data-testid='property-card'])[1]//a[@data-testid='availability-cta-btn']");
    public static Target RESERVE_BUTTON = Target.the("button reserve")
            .located(By.id("hp_book_now_button"));





}
