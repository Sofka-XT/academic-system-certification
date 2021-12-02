package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.stepdefinition.SetUp;
import co.com.sofka.tasks.hu06.BrowseToList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static co.com.sofka.questions.hu06.createprogram.AssertToListQuestions.assertToListQuestions;
import static co.com.sofka.tasks.hu06.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu06.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu06.login.DashBoardPage.ROLE_COACH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA004StepDefinition extends SetUp {
    private static final String ACTOR_NAME = "QA";
    @Given("El coach se encuentra en el menú principal")
    public void elCoachSeEncuentraEnElMenuPrincipal() {
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


    }

    @When("El mentor selecciona programas activos")
    public void elMentorSeleccionaProgramasActivos() {

        theActorInTheSpotlight().attemptsTo(
                BrowseToList.browseToList()
        );

    }

    @Then("me debe llevar a la ruta de programas activos donde se listara los programas activos.")
    public void meDebeLlevarALaRutaDeProgramasActivosDondeSeListaraLosProgramasActivos() {
        theActorInTheSpotlight().should(
                seeThat(assertToListQuestions()
                        .is(), equalTo(true)
                )
        );
    }

}
