package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {

    public static Target usernameField = Target.the("username field")
            .located(AppiumBy.accessibilityId("username"));
    public static Target passwordField = Target.the("password field")
            .located(AppiumBy.accessibilityId("password"));
    public static Target buttom  = Target.the("btn login")
            .located(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
}
