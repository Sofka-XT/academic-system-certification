package co.com.sofka.stepdefinition.hu03;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationApprentice.fillGoogleAutenticationApprentice;
import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu01.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.hu03.DoApprenticeList.doApprenticeList;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ListarEstudianteTrainingActivo extends Setup {

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
                doApprenticeList()
        );
    }

    @Then("debera visualizar la lista de estudiantes")
    public void deberaVisualizarLaListaDeEstudiantes() {
        System.out.println("Validación");
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
