package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.stepdefinition.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu01.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.hu05.FillCourseForm.fillCourseForm;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.util.hu005.User.COACH;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class Hu05CreateCourseStepDefinition extends SetUp {
    private static final String ACTOR = COACH.getValue();

    @Given("doy click sobre la opcion Crear curso")
    public void doy_click_sobre_la_opcion_Crear_nuevo_curso() {
        actorSetupTheBrowser(ACTOR);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );


        theActorInTheSpotlight().attemptsTo(
                loginWithGoogle()
        );
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow)){
                getDriver().switchTo().window(window);
                break;
            }
        }


        theActorInTheSpotlight().attemptsTo(
                fillAutenticationForm()

        );
        getDriver().switchTo().window(currentWindow);
        theActorInTheSpotlight().attemptsTo(
                fillCourseForm()
        );





    }

    @When("llene el formulario con todos los campos y doy clic sobre el boton crear")
    public void llene_el_formulario_con_todos_los_campos_y_de_clic_sobre_guardar() {

    }

    @When("no llene el formulario con todos los campos y de clic sobre el boton crear")
    public void no_llene_el_formulario_con_todos_los_campos_y_de_clic_sobre_guardar() {

    }


    @Then("^el sistema debe mostrar el siguiente mensaje: (.+)$")
    public void el_sistema_debe_mostrar_el_siguiente_mensaje_Registro_exitoso(String message) {

    }

}
