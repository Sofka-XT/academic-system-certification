package co.com.sofka.stepdefinition.hu04;

import co.com.sofka.exceptions.hu02.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static co.com.sofka.exceptions.hu02.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.questions.hu04.PerfilarAprendizEsquemaQuestions.perfilarAprendizEsquemaQuestions;
import static co.com.sofka.questions.hu04.PerfilarAprendizFalloQuestions.perfilarAprendizFalloQuestions;
import static co.com.sofka.questions.hu04.PerfilarRendimientoAprendizQuestions.perfilarRendimientoAprendizQuestions;
import static co.com.sofka.tasks.hu02.Login.login;
import static co.com.sofka.tasks.hu02.LoginGoogle.loginGoogle;
import static co.com.sofka.tasks.hu04.BrowseToListarAprendices.browseToListarAprendices;
import static co.com.sofka.tasks.hu04.BrowseToListarAprendicesFallido.browseToListarAprendicesFallido;
import static co.com.sofka.tasks.hu04.FindRendimientoAprendiz.findRendimientoAprendiz;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class PerfilarRendimientoAprendizStepDefinition extends Setup {

    protected static final String ACTOR_NAME_APRENDIZ = "aprendiz";
    protected static final String ACTOR_NAME_COACH = "coach";
    protected static final String ASSERTION_MENSAJE_ALERTA = "No se ha encontrado un aprendiz asociado a este correo";
    protected static final String ASSERTION_NAME_APRENDIZ = "Daniela";
    protected static final String ASSERTION_CELULAR_APRENDIZ = "12345678";
    protected static final String ASSERTION_EMAIL_APRENDIZ = "Daniela@gmail.com";
    protected static final String ASSERTION_ESQUEMA_DATOS = "Estados de calificaciones";
    protected static final String MESSAGE_ERROR = "Los datos mostrados en pantalla no corresponden a los del aprendiz consultado";

    protected static String originalWindow;

    @Given("el usuario \\(coach o aprendiz) se encuentra autenticado en el sistema y en la pagina principal del mismo")
    public void elUsuarioCoachOAprendizSeEncuentraAutenticadoEnElSistemaYEnLaPaginaPrincipalDelMismo() {
        actorSetupTheBrowser(ACTOR_NAME_COACH);
        loginWithGmail(ACTOR_NAME_COACH);
    }

    @When("el coach solicita ver el perfil del aprendiz de un training activo")
    public void elCoachSolicitaVerElPerfilDelAprendizDeUnTrainingActivo() {
        theActorInTheSpotlight().attemptsTo(
                browseToListarAprendices()
        );
        //driver.get("https://academic-system-sofkau.web.app/#/dashboard/profile/Daniela@gmail.com");

        theActorInTheSpotlight().attemptsTo(
                findRendimientoAprendiz()
        );
    }

    @Then("el sistema debe mostrar el perfil del aprendiz en una nueva seccion")
    public void elSistemaDebeMostrarElPerfilDelAprendizEnUnaNuevaSeccion() {
        theActorInTheSpotlight().should(
                seeThat(perfilarRendimientoAprendizQuestions()
                        .wasFilledWithNameAprendiz(ASSERTION_NAME_APRENDIZ)
                        .wasFilledWithCelularAprendiz(ASSERTION_CELULAR_APRENDIZ)
                        .wasFilledWithEmailAprendiz(ASSERTION_EMAIL_APRENDIZ)
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, MESSAGE_ERROR)
                        )
        );

        theActorInTheSpotlight().should(
                seeThat(perfilarAprendizEsquemaQuestions()
                        .wasFilledWithNameEsquema(ASSERTION_ESQUEMA_DATOS)
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, MESSAGE_ERROR)
                        )
        );
    }


    @When("el coach solicita ver el perfil del aprendiz de un training activo con correo desactualizado")
    public void elCoachSolicitaVerElPerfilDelAprendizDeUnTrainingActivoConCorreoDesactualizado() {
        theActorInTheSpotlight().attemptsTo(
                browseToListarAprendicesFallido()
        );
        //driver.get("https://academic-system-sofkau.web.app/#/dashboard/profile/noemail@gmail.com");

    }

    @Then("el sistema debe mostrar un mensaje manifestadno que no se encuentra informacion vinculada a dicho correo")
    public void elSistemaDebeMostrarUnMensajeManifestadnoQueNoSeEncuentraInformacionVinculadaADichoCorreo() {
        theActorInTheSpotlight().should(
                seeThat(
                        perfilarAprendizFalloQuestions()
                                .wasFilledWithMessage(ASSERTION_MENSAJE_ALERTA)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, MESSAGE_ERROR)
                        )
        );
    }



    protected void loginWithGmail(String user) {

        String email = "pruebasautomatizacionqa@gmail.com";
        theActorInTheSpotlight().attemptsTo(
                openLandingPage(),
                login()
        );

        originalWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for (String window : allWindows) {
            if (!window.contentEquals(originalWindow)) {
                getDriver().switchTo().window(window);
                break;
            }
        }

        if(user.equalsIgnoreCase(ACTOR_NAME_APRENDIZ)){
            email = "aprendizqapruebas@gmail.com";
        }

        theActorInTheSpotlight().attemptsTo(
                loginGoogle().usingUserName(email)
                        .usingPassword("Admin123!")
        );

        getDriver().switchTo().window(originalWindow);
    }

}
