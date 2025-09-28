package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CommentView {
    public static Target comentario = Target.the("ingresar comemtarios")
            .located(AppiumBy.accessibilityId("messageInput"));
    public static Target btnSave = Target.the("boton save")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Save')]"));
}

