package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.exceptions.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.hu06.createprogram.ListHome.listHome;
import static co.com.sofka.tasks.hu06.list.BrowseToList.browseToList;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA004StepDefinition extends Setup {
    private static final String ACTOR_NAME = "QA";
    @Given("El coach se encuentra en el menú principal")
    public void elCoachSeEncuentraEnElMenuPrincipal() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }

    @When("El mentor selecciona programas activos")
    public void elMentorSeleccionaProgramasActivos() {
        theActorInTheSpotlight().attemptsTo(
                browseToList()
        );
    }

    @Then("me debe llevar a la ruta de programas activos donde se listara los programas activos.")
    public void meDebeLlevarALaRutaDeProgramasActivosDondeSeListaraLosProgramasActivos() {

        theActorInTheSpotlight().should(
                seeThat(listHome()
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class
                        )
        );
    }

}
