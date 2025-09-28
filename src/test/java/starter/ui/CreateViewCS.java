package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CreateViewCS {

    public static Target HomeCS = Target.the("Home CS" )
            .locatedBy("//android.widget.ImageView[@content-desc=\"Personal\n" +
                    "operaciones a tu nombre\"]");
}
