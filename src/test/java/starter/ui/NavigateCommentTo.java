package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavigateCommentTo {
    public static Target urlComments = Target.the("url de comentarios")
            .located(By.xpath("(//android.view.ViewGroup[@resource-id=\"RNE__LISTITEM__padView\"])[1]"));
}
