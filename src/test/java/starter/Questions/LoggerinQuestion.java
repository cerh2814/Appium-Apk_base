package starter.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.LoginAreaView;

public class LoggerinQuestion implements Question {

    @Override
    public String answeredBy(Actor actor) {

        return LoginAreaView.loginArea.resolveFor(actor).getText();
    }

    public static LoggerinQuestion value() {
        return new LoggerinQuestion();
    }
}
