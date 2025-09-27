package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Homeview {

    public static Target loginLink = Target.the("login link")
            .located(By.xpath("(//android.view.ViewGroup[@resource-id=\"RNE__LISTITEM__padView\"])[2]"));

}