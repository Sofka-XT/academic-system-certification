package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.*;

import static co.com.sofka.tasks.hu05.BrowserToCourse.browserToCurso;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hu05StepDefinition extends Setup {
    private static final String ACTOR = "Coach";

    @Given("doy click sobre la opcion Crear nuevo curso")
    public void doy_click_sobre_la_opcion_Crear_nuevo_curso() {
        actorSetupTheBrowser(ACTOR);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );

        theActorInTheSpotlight().attemptsTo(
                browserToCurso()
        );

    }

    @When("llene el formulario con todos los campos y de clic sobre guardar")
    public void llene_el_formulario_con_todos_los_campos_y_de_clic_sobre_guardar() {

    }

    @Then("el sistema debe mostrar el siguiente mensaje: Registro exitoso.")
    public void el_sistema_debe_mostrar_el_siguiente_mensaje_Registro_exitoso() {

    }

}
