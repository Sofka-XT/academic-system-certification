package co.com.sofka.stepdefinition.hu06;
import co.com.sofka.stepdefinition.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static co.com.sofka.questions.hu06.delete.AssertToDeleteQuestions.assertToDeleteQuestions;
import static co.com.sofka.tasks.hu06.BrowseToList.browseToList;
import static co.com.sofka.tasks.hu06.delete.HU06CrudProgramaEliminarTask.eliminarPrograma;
import static co.com.sofka.tasks.hu06.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu06.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu06.login.DashBoardPage.ROLE_COACH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA002StepDefinition extends Setup {
    private static final String ACTOR_NAME = "Coach";

    @Given("que el coach se encuentra en la seccion de eliminar programa")
    public void que_el_coach_se_encuentra_en_la_seccion_de_eliminar_programa() {
        actorSetupTheBrowser(ACTOR_NAME);
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

        WaitUntil.the(ROLE_COACH, isVisible()).forNoMoreThan(10).seconds();

        theActorInTheSpotlight().attemptsTo(
                browseToList()
        );

    }

    @When("el coah proceda a seleccionar  un programa ya existente y para su eliminacion y pulse el boton de confirmar")
    public void el_coah_proceda_a_seleccionar_un_programa_ya_existente_y_para_su_eliminacion_y_pulse_el_boton_de_confirmar() {
        theActorInTheSpotlight().attemptsTo(
                eliminarPrograma()
        );
    }

    @Then("este cambio se debe guardar exitosamente  y debe notificarse")
    public void este_cambio_se_debe_guardar_exitosamente_y_debe_notificarse() {
        theActorInTheSpotlight().should(
                seeThat(assertToDeleteQuestions()
                        .is(), equalTo(false)
                )
        );
    }


}
