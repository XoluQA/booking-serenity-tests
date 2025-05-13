package com.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
//import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class AdjustPriceSliderTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // Encuentra el slider izquierdo (mínimo)
        WebElement sliderMin = driver.findElement(By.xpath("(//input[@type='range'])[1]"));

        // Acción de arrastre (mover hacia la derecha)
        Actions actions = new Actions(driver);
        actions.clickAndHold(sliderMin)
                .moveByOffset(27, 0)  // Ajusta según resolución del navegador
                .release()
                .perform();

        // Espera opcional para efectos de UI
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    public static AdjustPriceSliderTask toCOP200K() {
        return new AdjustPriceSliderTask();
    }
}