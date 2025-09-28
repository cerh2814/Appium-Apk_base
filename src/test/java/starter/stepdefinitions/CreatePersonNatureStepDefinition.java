package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.ui.CreateViewCS;
import starter.ui.HomeCSView;
import starter.ui.Homeview;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;




public class CreatePersonNatureStepDefinition {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que estoy en la pagina de registro")
    public void que_estoy_en_la_pagina_de_registro() {
        Serenity.takeScreenshot();
        theActorCalled("Usuario").attemptsTo(
                //Click.on(HomeCSView.Aceptar)
                Click.on(HomeCSView.Aceptar),
                Click.on(CreateViewCS.HomeCS)
        );
    }

    @Cuando("acepto los terminos y condiciones")
    public void acepto_los_terminos_y_condiciones() {
        Serenity.takeScreenshot();
        theActorCalled("Usuario").attemptsTo(
               // Click.on(CreateViewCS.HomeCS)

        );

    }

    @Cuando("registro todos mis datos personales validos y completos")
    public void registro_todos_mis_datos_personales_validos_y_completos() {

    }


//
//    @Cuando("registro mis datos personales válidos")
//    public void registro_mis_datos_personales_válidos() {
//
//    }
//
//    @Cuando("hago clic en el botón de {string}")
//    public void hago_clic_en_el_botón_de(String string) {
//
//    }
//
//    @Entonces("debería ver un mensaje de confirmación de registro exitoso")
//    public void debería_ver_un_mensaje_de_confirmación_de_registro_exitoso() {
//
//    }
}


