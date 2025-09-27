package starter.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.MessageConfirmView;

public class MessageinQuestion implements Question {
    @Override
    public String answeredBy(Actor actor) {
       return MessageConfirmView.mssgConfirm.resolveFor(actor).getText();
    }

    public static MessageinQuestion value() {

        return new MessageinQuestion();
    }
}
