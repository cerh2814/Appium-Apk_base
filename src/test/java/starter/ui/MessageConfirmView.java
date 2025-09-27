package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MessageConfirmView {
    public static Target mssgConfirm = Target.the("message confirm")
            .locatedBy("//android.widget.TextView[contains(@text,concat('Here',\"'\",'s what you said before'))]");
}
