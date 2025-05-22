package com.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwitchToNewTab implements Task {

@Override
public <T extends Actor> void performAs(T actor) {
    WebDriver driver = BrowseTheWeb.as(actor).getDriver();
    String currentTab = driver.getWindowHandle();

    // Esperar hasta que se abra una nueva pestaña
    new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(d -> d.getWindowHandles().size() > 1);

    // Cambiar a la nueva pestaña
    for (String tab : driver.getWindowHandles()) {
        if (!tab.equals(currentTab)) {
            driver.switchTo().window(tab);
            break;
        }
    }
}

    public static SwitchToNewTab now() {
        return Tasks.instrumented(SwitchToNewTab.class);
    }
}
