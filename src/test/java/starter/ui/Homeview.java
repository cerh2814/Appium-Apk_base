package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Homeview {

    public static Target loginLink = Target.the("login link")
            .located(By.xpath("(//android.view.ViewGroup[@resource-id=\"RNE__LISTITEM__padView\"])[2]"));


}