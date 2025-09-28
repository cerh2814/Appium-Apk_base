package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.Questions.MessageinQuestion;
import starter.task.Comment;
import starter.ui.NavigateCommentTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class EchoCommentStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("User is on the input comments page")
    public void user_is_on_the_input_comments_page() {
        theActorCalled("Jhon").attemptsTo(

                Click.on(NavigateCommentTo.urlComments)
        );



    }
    @When("User enters the comments")
    public void user_enters_the_comments() {
        theActorCalled("Jhon").attemptsTo(
                new Comment()

        );

    }

    @Then("valid the comments")
    public void valid_the_comments() {
        String expectedMessge = "Here's what you said before:";
        theActorCalled("Jhon").should(
                seeThat("the Welcome text", MessageinQuestion.value(),
                        equalTo(expectedMessge))
        );
    }

}
