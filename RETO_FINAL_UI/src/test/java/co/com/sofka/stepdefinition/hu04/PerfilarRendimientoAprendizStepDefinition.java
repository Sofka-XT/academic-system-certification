package co.com.sofka.stepdefinition.hu04;

import co.com.sofka.exceptions.hu02.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.SetUp;
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
import static co.com.sofka.tasks.hu04.BrowseToListarAprendices.aprendiz;
import static co.com.sofka.tasks.hu04.BrowseToListarAprendices.browseToListarAprendices;
import static co.com.sofka.tasks.hu04.FindRendimientoAprendiz.findRendimientoAprendiz;
import static co.com.sofka.tasks.hu04.PerfilarAprendiz.perfilarAprendiz;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class PerfilarRendimientoAprendizStepDefinition extends SetUp {

    protected static final String ACTOR_NAME_APRENDIZ = "aprendiz";
    protected static final String ACTOR_NAME_COACH = "coach";
    protected static final String ASSERTION_MENSAJE_ALERTA = "No se ha encontrado un aprendiz asociado a este correo";
    protected static final String ASSERTION_ESQUEMA_DATOS = "Estados de calificaciones";
    protected static final String MESSAGE_ERROR = "Los datos mostrados en pantalla no corresponden a los del aprendiz consultado";
    protected static String originalWindow;

    @Given("el coach se encuentra autenticado en el sistema y en la pagina principal del mismo")
    public void elCoachSeEncuentraAutenticadoEnElSistemaYEnLaPaginaPrincipalDelMismo() {
        actorSetupTheBrowser(ACTOR_NAME_COACH);
        loginWithGmail(ACTOR_NAME_COACH);
    }

    @When("el coach solicita ver el perfil del aprendiz de un training activo")
    public void elCoachSolicitaVerElPerfilDelAprendizDeUnTrainingActivo() {
        navegarHastaPerfil();
    }

    @Then("el sistema debe mostrar el perfil del aprendiz en una nueva seccion")
    public void elSistemaDebeMostrarElPerfilDelAprendizEnUnaNuevaSeccion() {
        assertionPerfilarAprendiz();
    }

    @Given("el coach se encuentra logueado en el sistema y en la pagina principal del mismo")
    public void elCoachEncuentraLogueadoEnElSistemaYEnLaPaginaPrincipalDelMismo() {
        actorSetupTheBrowser(ACTOR_NAME_COACH);
        loginWithGmail(ACTOR_NAME_COACH);
    }

    @When("el coach solicita ver el perfil del aprendiz de un training activo con correo desactualizado")
    public void elCoachSolicitaVerElPerfilDelAprendizDeUnTrainingActivoConCorreoDesactualizado() {
        theActorInTheSpotlight().attemptsTo(
                browseToListarAprendices()
        );
        driver.get("https://academic-system-sofkau.web.app/#/dashboard/profile/noemail@gmail.com");

    }

    @Then("el sistema debe mostrar un mensaje manifestando que no se encuentra informacion vinculada a dicho correo")
    public void elSistemaDebeMostrarUnMensajeManifestandoQueNoSeEncuentraInformacionVinculadaADichoCorreo() {
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

    @Given("el aprendiz se encuentra autenticado en el sistema y en la pagina principal del mismo")
    public void elAprendizSeEncuentraAutenticadoEnElSistemaYEnLaPaginaPrincipalDelMismo() {
        actorSetupTheBrowser(ACTOR_NAME_APRENDIZ);
        loginWithGmail(ACTOR_NAME_APRENDIZ);
    }

    @When("el aprendiz solicita ver su perfil en un training activo")
    public void elAprendizSolicitaVerSuPerfilEnUnTrainingActivo() {
        navegarHastaPerfil();
    }

    @Then("el sistema debe mostrar su perfil con su rendimiento en una nueva seccion")
    public void elSistemaDebeMostrarSuPerfilConSuRendimientoEnUnaNuevaSeccion() {
        assertionPerfilarAprendiz();
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

    public void assertionPerfilarAprendiz(){
        theActorInTheSpotlight().should(
                seeThat(perfilarRendimientoAprendizQuestions()
                        .wasFilledWithNameAprendiz(aprendiz.getName())
                        .wasFilledWithCelularAprendiz(aprendiz.getMobile())
                        .wasFilledWithEmailAprendiz(aprendiz.getEmail())
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

    public void navegarHastaPerfil(){
        theActorInTheSpotlight().attemptsTo(
                browseToListarAprendices(),
                perfilarAprendiz()
        );

        theActorInTheSpotlight().attemptsTo(
                findRendimientoAprendiz()
        );
    }

}
