package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.exceptions.hu02.ValidationTextDoNotMatch;

import co.com.sofka.stepdefinition.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static co.com.sofka.exceptions.hu02.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;

import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu01.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.hu05.CourseDelete.*;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu005.CourseDelete.*;
import static co.com.sofka.questions.hu05.DeleteCourseQuestion.*;
import static co.com.sofka.util.hu005.User.COACH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class Hu05DeleteCourseStepDefinition extends Setup {
    private static final String ACTOR = COACH.getValue();
    private  final String ValidateMessaje ="El curso se ha eliminado con éxito";

    @Given("doy click sobre la opcion ver cursos")
    public void doyClickSobreLaOpcionVerCursos() {
        actorSetupTheBrowser(ACTOR);
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

    }

    @When("navego por el sitio hasta encontrar la opc eliminar curso")
    public void navegoPorElSitioHastaEncontrarLaOpcEliminarCurso() {

        theActorInTheSpotlight().attemptsTo(
                DeleteCourseForm()

        );
    }


    @Then("el sistema debe mostrar un mesaje de eliminado correctamente")
    public void elSistemaDebeMostrarUnMesajeDeEliminadoCorrectamente() {

        theActorInTheSpotlight().should(
                seeThat(deleteCourseQuestion()
                        .validateMessage(ValidateMessaje)

                        .is(), equalTo(true)

                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome())
                        )
        );

    }

    private String compareInWithSystemOutcome() {
        return "\n" + "Data for test : System outcome"
                + "\n" + ValidateMessaje+" : " + MESSAJE_DELETED_SUCCESSFUL.resolveFor(theActorInTheSpotlight()).getText();

    }
}
