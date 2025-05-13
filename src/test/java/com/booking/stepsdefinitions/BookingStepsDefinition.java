package com.booking.stepsdefinitions;
import com.booking.tasks.BookingTask;
import com.booking.tasks.LoginTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.model.util.EnvironmentVariables;


public class BookingStepsDefinition {

    private EnvironmentVariables environmentVariables;

    @Given("the user opens the Booking website")
    public void theUserOpensTheBookingWebsite() {
        String webServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("environments.default.webdriver.base.url");

        String URL = webServiceEndpoint.toString();
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }
    @When("the user logs in with valid credentials")
    public void theUserLogsInWithValidCredentials() {
    //    OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.enter());

    }
    @When("the user searches for hotels using predefined filters")
    public void theUserSearchesForHotelsUsingPredefinedFilters() {
        OnStage.theActorInTheSpotlight().attemptsTo(BookingTask.search());

    }
    @Then("the user selects the cheapest hotel and saves its information")
    public void theUserSelectsTheCheapestHotelAndSavesItsInformation() {

    }
}
