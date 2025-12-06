package starter.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.Questions.LoggerinQuestion;
import starter.task.Login;
import starter.task.NavigateTo;
import starter.ui.LoginAreaView;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class LogInStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void afterScenario() {
        Serenity.takeScreenshot();
    }


    @Given("John Wick wants to create a new post")
    public void john_want_to_create_a_new_post() {
        theActorCalled("Jhon")
                .attemptsTo(
                        new NavigateTo()
                );
    }

    @When("he send his credentials")
    public void he_send_his_credentials() {
        theActorCalled("Jhon").attemptsTo(
                new Login()
        );
    }

    @Then("he should see the dashboard")
    public void he_should_see_the_dashboard() {
       String expectedWelcomeMessage = "You are logged in as alice";
       theActorCalled("Jhon").should(
            seeThat("the Welcome text", LoggerinQuestion.value(),
                    equalTo(expectedWelcomeMessage))

       );

    }

}
