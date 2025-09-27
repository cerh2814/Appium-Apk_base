package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.LoginView;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("alice").into(starter.ui.LoginView.usernameField),
                SendKeys.of("mypassword").into(starter.ui.LoginView.passwordField),
                Click.on(LoginView.buttom)
        );

    }
}
