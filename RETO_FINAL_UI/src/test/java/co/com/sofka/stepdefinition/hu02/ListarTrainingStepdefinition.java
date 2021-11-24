package co.com.sofka.stepdefinition.hu02;

import co.com.sofka.exceptions.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.exceptions.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.questions.hu02.ListarTraining.listarTraining;
import static co.com.sofka.tasks.hu02.BrowseToListarTraining.browseToListarTraining;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class ListarTrainingStepdefinition extends Setup {

    protected static final String ACTOR_NAME = "usuario";
    protected static final String TRAINING_NAME = "T-shirts";//Se actualizara
    private static final String MESSAGE_ERROR = "No se muestran los datos del Training Activo buscado";


    @Given("que despues de estar logueado y se encuentra en la pagina de listar training")
    public void queDespuesDeEstarLogueadoYSeEncuentraEnLaPaginaDeListarTraining() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }

    @When("el usuario quiere visualizar los training activos")
    public void elUsuarioQuiereVisualizarLosTrainingActivos() {

        theActorInTheSpotlight().attemptsTo(
                browseToListarTraining()
        );
    }

    @Then("el sistema deberia mostrar los training activos que estan dentro de la fecha del programa")
    public void elSistemaDeberiaMostrarLosTrainingActivosQueEstanDentroDeLaFechaDelPrograma() {
        theActorInTheSpotlight().should(
                seeThat(listarTraining()
                        .wasFilledWithTrainingName(TRAINING_NAME)
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, MESSAGE_ERROR)
                        )
        );
    }


    @Given("que el usuario no esta logueado")
    public void queElUsuarioNoEstaLogueado() {

    }

    @Then("el sistema no deberia permitir el acceso a los training activos")
    public void elSistemaNoDeberiaPermitirElAccesoALosTrainingActivos() {

    }

    @Given("que el couch se encuentra en la pagina de listar training")
    public void queElCouchSeEncuentraEnLaPaginaDeListarTraining() {

    }

    @When("el usuario quiere visualizar los training activos {string}")
    public void elUsuarioQuiereVisualizarLosTrainingActivos(String string) {

    }

    @Then("el sistema deberia mostrar el training consultado en las listas de training activos")
    public void elSistemaDeberiaMostrarElTrainingConsultadoEnLasListasDeTrainingActivos() {

    }
}
