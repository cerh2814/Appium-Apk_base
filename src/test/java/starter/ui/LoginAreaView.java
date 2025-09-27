package starter.ui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class LoginAreaView  {

        public static Target loginArea = Target.the("login area")
                .locatedBy("//android.widget.TextView[contains(@text,'You are logged in')]");

    }

