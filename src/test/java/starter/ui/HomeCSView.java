package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomeCSView {
    public static Target Aceptar = Target.the("Aceptar")
            .located(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));

    public static Target HomeCS = Target.the("Home CS" )
            .locatedBy("//android.widget.ImageView[@content-desc=\"Personal\n" +
                    "operaciones a tu nombre\"]");
}
