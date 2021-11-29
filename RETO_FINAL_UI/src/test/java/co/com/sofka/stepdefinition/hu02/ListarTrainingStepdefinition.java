package co.com.sofka.stepdefinition.hu02;

import co.com.sofka.exceptions.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static co.com.sofka.exceptions.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.questions.hu02.ListarTrainingActivoQuestions.listarTrainingActivoQuestions;
import static co.com.sofka.questions.hu02.ListarTrainingQuestions.listarTrainingQuestions;
import static co.com.sofka.tasks.hu02.BrowseToListarTraining.browseToListarTraining;
import static co.com.sofka.tasks.hu02.BrowseToListarTrainingAprendiz.browseToListarTrainingAprendiz;
import static co.com.sofka.tasks.hu02.BrowseToListarTrainingCoach.browseToListarTrainingCoach;
import static co.com.sofka.tasks.hu02.FindTraining.findTraining;
import static co.com.sofka.tasks.hu02.Login.login;
import static co.com.sofka.tasks.hu02.LoginGoogle.loginGoogle;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.CoreMatchers.equalTo;


public class ListarTrainingStepdefinition extends Setup {

    protected static final String ACTOR_NAME_APRENDIZ = "aprendiz";
    protected static final String ACTOR_NAME_COACH = "coach";
    protected static final String TRAINING_NAME = "Training Dev 2021";

    protected static final String ASSERTION_TRAINING_NAME = "Training Activos";
    protected static final String MESSAGE_ERROR_LISTAR_TRAINING = "No se listan los Training Activos";
    protected static final String MESSAGE_ERROR = "No se muestran los datos del Training Activo buscado";


    @Given("que el aprendiz se encuentra logueado y en la pagina principal")
    public void queElAprendizSeEncuentraLogueadoYEnLaPaginaPrincipal() {
        actorSetupTheBrowser(ACTOR_NAME_APRENDIZ);
        loginWithGmail(ACTOR_NAME_APRENDIZ);
    }
    @When("el aprendiz desea visualizar los training activos")
    public void elAprendizDeseaVisualizarLosTrainingActivos() {
        theActorInTheSpotlight().attemptsTo(
                browseToListarTrainingAprendiz()
        );
    }
    @Then("el sistema deberia permitir la visualizacion de los training activos al aprendiz")
    public void elSistemaDeberiaPermitirLaVisualizacionDeLosTrainingActivosAlAprendiz() {
        assertionTraining();
    }


    @Given("que el coach se encuentra logueado y en la pagina principal")
    public void queElCoachSeEncuentraLogueadoYEnLaPaginaPrincipal() {
        actorSetupTheBrowser(ACTOR_NAME_COACH);
        loginWithGmail(ACTOR_NAME_COACH);
    }
    @When("el coach desea visualizar los training activos")
    public void elCoachDeseaVisualizarLosTrainingActivos() {
        theActorInTheSpotlight().attemptsTo(
                browseToListarTrainingCoach()
        );
    }
    @Then("el sistema deberia permitir la visualizacion de los training activos al coach")
    public void elSistemaDeberiaPermitirLaVisualizacionDeLosTrainingActivosAlCoach() {
        assertionTraining();
    }



    @Given("que el couch se encuentra en la pagina de listar training")
    public void queElCouchSeEncuentraEnLaPaginaDeListarTraining() {
        actorSetupTheBrowser(ACTOR_NAME_COACH);
        loginWithGmail(ACTOR_NAME_COACH);
    }
    @When("el usuario quiere visualizar en la lista de training activos el training activo {string}")
    public void elUsuarioQuiereVisualizarEnLaListaDeTrainingActivosElTrainingActivo(String string) {
        theActorInTheSpotlight().attemptsTo(
                browseToListarTrainingCoach(),
                findTraining().usingTrainingName(TRAINING_NAME)
        );
    }
    @Then("el sistema deberia mostrar el training activo consultado en las listas de training activos")
    public void elSistemaDeberiaMostrarElTrainingActivoConsultadoEnLasListasDeTrainingActivos() {
        theActorInTheSpotlight().should(
                seeThat(listarTrainingActivoQuestions()
                        .wasFilledWithTrainingName(TRAINING_NAME)
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, MESSAGE_ERROR)
                        )
        );
    }


    @Given("que el coach se encuentra autenticado y en la pagina principal")
    public void queElCoachSeEncuentraAutenticadoYEnLaPaginaPrincipal() {
        actorSetupTheBrowser(ACTOR_NAME_COACH);
        loginWithGmail(ACTOR_NAME_COACH);
    }
    @When("el coach desea visualizar los training activos ingresando desde una ruta alternativa")
    public void elCoachDeseaVisualizarLosTrainingActivosIngresandoDesdeUnaRutaAlternativa() {
        theActorInTheSpotlight().attemptsTo(
                browseToListarTraining()
        );
    }
    @Then("el sistema deberia permitir la visualizacion de los training activos al coach como en la ruta principal")
    public void elSistemaDeberiaPermitirLaVisualizacionDeLosTrainingActivosAlCoachComoEnLaRutaPrincipal() {
        assertionTraining();
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

    protected void assertionTraining(){
        theActorInTheSpotlight().should(
                seeThat(listarTrainingQuestions()
                        .wasFilledWithTrainingName(ASSERTION_TRAINING_NAME)
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, MESSAGE_ERROR_LISTAR_TRAINING)
                        )
        );

    }

}
