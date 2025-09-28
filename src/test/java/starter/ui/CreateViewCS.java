package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateViewCS {

    public static Target HomeCS = Target.the("Home CS" )
            .located(By.xpath("//android.widget.ImageView[@content-desc=\"Personal\n" +
                    "operaciones a tu nombre\"]"));

    public static Target createuse = Target.the("registrar" )
            .located(AppiumBy.accessibilityId("Regístrate aquí"));


}

