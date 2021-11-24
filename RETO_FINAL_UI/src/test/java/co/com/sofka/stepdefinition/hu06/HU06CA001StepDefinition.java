package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.exceptions.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.hu06.createprogram.PragramCreationMessage.programCreationMessage;
import static co.com.sofka.questions.hu06.createprogram.ProgramErrorMessage.programErrorMessage;
import static co.com.sofka.tasks.hu06.create.HU06CrudProgramaCrearTask.createProgram;
import static co.com.sofka.tasks.hu06.create.HU06CrudProgramaCrearTaskNoCurses.createProgramWithoutCourses;
import static co.com.sofka.tasks.hu06.create.HU06CrudProgramaCrearTaskNoCursesNoName.createProgramWithoutCoursesOrName;
import static co.com.sofka.tasks.hu06.create.HU06CrudProgramaCrearTaskNoName.createProgramNoName;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static  co.com.sofka.tasks.hu06.create.BrowseToCreate.browseToCreate;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA001StepDefinition extends Setup {

    private static final String ACTOR_NAME = "QA";

    @Given("El coach se encuentra en la ruta de creación de programa")
    public void elCoachSeEncuentraEnLaRutaDeCreacionDePrograma() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
        theActorInTheSpotlight().attemptsTo(
                browseToCreate()
        );
    }

    @When("El mentor ingresa el nombre del programa y escoge un curso o los cursos necesarios para el programa")
    public void elMentorIngresaElNombreDelProgramaYEscogeUnCursoOLosCursosNecesariosParaElPrograma() {
        theActorInTheSpotlight().attemptsTo(
                createProgram()
                        .usingNameProgram("")
                );
    }

    @Then("Se creará exitosamente el programa y se debe notificar.")
    public void seCrearaExitosamenteElProgramaYSeDebeNotificar() {
        theActorInTheSpotlight().should(
                seeThat(programCreationMessage()
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class
                        )
        );
    }

    @When("El mentor no ingresa el nombre del programa y no selecciona ningún curso")
    public void elMentorNoIngresaElNombreDelProgramaYNoSeleccionaNingunCurso() {
        theActorInTheSpotlight().attemptsTo(
                createProgramWithoutCourses()
                        .usingNameProgram("")
        );
    }

    @Then("Se debe notificar que no es posible crear el programa.")
    public void seDebeNotificarQueNoEsPosibleCrearElPrograma() {
        theActorInTheSpotlight().should(
                seeThat(programErrorMessage()
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class
                        )
        );
    }

    @When("El mentor no ingresa el nombre del programa y selecciona un curso")
    public void elMentorNoIngresaElNombreDelProgramaYSeleccionaUnCurso() {
        theActorInTheSpotlight().attemptsTo(
                createProgramNoName()
        );
    }

    @Then("Se debe notificar que no es posible crear el programa sin el que suministre el nombre.")
    public void seDebeNotificarQueNoEsPosibleCrearElProgramaSinElQueSuministreElNombre() {
        theActorInTheSpotlight().should(
                seeThat(programErrorMessage()
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class
                        )
        );
    }

    @When("El mentor ingresa el nombre del programa y no selecciona ningún curso")
    public void elMentorIngresaElNombreDelProgramaYNoSeleccionaNingunCurso() {
        theActorInTheSpotlight().attemptsTo(
                createProgramWithoutCoursesOrName()
        );
    }
    @Then("Se debe notificar que no es posible crear el programa sin el asignar al menos un curso.")
    public void seDebeNotificarQueNoEsPosibleCrearElProgramaSinElAsignarAlMenosUnCurso() {
        theActorInTheSpotlight().should(
                seeThat(programErrorMessage()
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class
                        )
        );
    }
}
