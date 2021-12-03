package co.com.sofka.stepdefinition.hu03;

import co.com.sofka.stepdefinition.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationApprentice.fillGoogleAutenticationApprentice;
import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu01.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.hu03.DoApprenticeListApprentice.doApprenticeListApprentice;
import static co.com.sofka.tasks.hu03.DoApprenticeListCoach.doApprenticeListCoach;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu03.TrainingPage.APPRENTICE_TABLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ListarEstudianteTrainingActivo extends SetUp {

    private static final String ACTOR_NAME = "User";
    String currentWindow = "";

    @Given("el apprentice ingresa a la pagina de training activos")
    public void elApprenticeIngresaALaPaginaDeTrainingActivos() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
        theActorInTheSpotlight().attemptsTo(
                loginWithGoogle()
        );
        cambiarAGoogleLogin();
        theActorInTheSpotlight().attemptsTo(
                fillGoogleAutenticationApprentice()
        );
        volverAPaginaLogin();
    }

    @When("selecciona un training activo")
    public void seleccionaUnTrainingActivo() {
        theActorInTheSpotlight().attemptsTo(
                doApprenticeListApprentice()
        );
    }

    @Given("el coach ingresa a la pagina de training activos")
    public void elCoachIngresaALaPaginaDeTrainingActivos() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
        theActorInTheSpotlight().attemptsTo(
                loginWithGoogle()
        );
        cambiarAGoogleLogin();
        theActorInTheSpotlight().attemptsTo(
                fillAutenticationForm()
        );
        volverAPaginaLogin();
    }

    @When("escoge uno al azar")
    public void escogeUnoAlAzar() {
        theActorInTheSpotlight().attemptsTo(
                doApprenticeListCoach()
        );
    }

    @Then("debera visualizar la lista de estudiantes")
    public void deberaVisualizarLaListaDeEstudiantes() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(APPRENTICE_TABLE, isVisible()).forNoMoreThan(20).seconds(),
                Ensure.that(APPRENTICE_TABLE).isDisplayed()
        );
    }

    public void cambiarAGoogleLogin() {
        try {
            currentWindow = getDriver().getWindowHandle();
            Set<String> allWindows = getDriver().getWindowHandles();
            for (String window : allWindows) {
                if (!window.contentEquals(currentWindow)) {
                    getDriver().switchTo().window(window);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void volverAPaginaLogin() {
        getDriver().switchTo().window(currentWindow);
    }
}
