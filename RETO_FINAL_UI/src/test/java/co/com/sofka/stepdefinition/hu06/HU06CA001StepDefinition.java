package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static co.com.sofka.questions.hu06.createprogram.AssertToListQuestions.assertToListQuestions;
import static co.com.sofka.questions.hu06.createprogram.ErrorMessageQuestions.errorMessageQuestions;
import static co.com.sofka.questions.hu06.delete.AssertToDeleteQuestions.assertToDeleteQuestions;
import static co.com.sofka.tasks.hu06.create.HU06CrudProgramaCrearTask.createProgram;
import static co.com.sofka.tasks.hu06.create.HU06CrudProgramaCrearTaskNoCurses.createProgramWithoutCourses;
import static co.com.sofka.tasks.hu06.create.HU06CrudProgramaCrearTaskNoCursesNoName.createProgramWithoutCoursesOrName;
import static co.com.sofka.tasks.hu06.create.HU06CrudProgramaCrearTaskNoName.createProgramNoName;
import static co.com.sofka.tasks.hu06.delete.BrowseToDelete.browseToDelete;
import static co.com.sofka.tasks.hu06.delete.HU06CrudProgramaEliminarTask.eliminarPrograma;
import static co.com.sofka.tasks.hu06.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu06.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu06.login.DashBoardPage.ROLE_COACH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static  co.com.sofka.tasks.hu06.create.BrowseToCreate.browseToCreate;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
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

        theActorInTheSpotlight().attemptsTo(
                browseToCreate()
        );

    }

    @When("El mentor ingresa el nombre del programa y escoge un curso o los cursos necesarios para el programa")
    public void elMentorIngresaElNombreDelProgramaYEscogeUnCursoOLosCursosNecesariosParaElPrograma() {
        theActorInTheSpotlight().attemptsTo(
                createProgram()
                        .usingNameProgram("Program Test")
                );


    }

    @Then("Se creará exitosamente el programa y se debe notificar.")
    public void seCrearaExitosamenteElProgramaYSeDebeNotificar() {

        theActorInTheSpotlight().should(
                seeThat(assertToListQuestions()
                        .is(), equalTo(true)
                )
        );


        theActorInTheSpotlight().attemptsTo(
                browseToDelete()
        );

        theActorInTheSpotlight().attemptsTo(
                eliminarPrograma()
        );


        theActorInTheSpotlight().should(
                seeThat(assertToDeleteQuestions()
                        .is(), equalTo(false)
                )
        );



    }

    @When("El mentor no ingresa el nombre del programa y no selecciona ningún curso")
    public void elMentorNoIngresaElNombreDelProgramaYNoSeleccionaNingunCurso() {
        theActorInTheSpotlight().attemptsTo(
                createProgramWithoutCoursesOrName()
        );
    }

    @Then("Se debe notificar que no es posible crear el programa.")
    public void seDebeNotificarQueNoEsPosibleCrearElPrograma() {

        theActorInTheSpotlight().should(
                seeThat(errorMessageQuestions()
                        .is(), equalTo(true)
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
                seeThat(errorMessageQuestions()
                        .is(), equalTo(true)
                )
        );
    }

    @When("El mentor ingresa el nombre del programa y no selecciona ningún curso")
    public void elMentorIngresaElNombreDelProgramaYNoSeleccionaNingunCurso() {


        theActorInTheSpotlight().attemptsTo(
                createProgramWithoutCourses()
                        .usingNameProgram("Program Test")
        );

    }
    @Then("Se debe notificar que no es posible crear el programa sin el asignar al menos un curso.")
    public void seDebeNotificarQueNoEsPosibleCrearElProgramaSinElAsignarAlMenosUnCurso() {
        theActorInTheSpotlight().should(
                seeThat(errorMessageQuestions()
                        .is(), equalTo(true)
                )
        );
    }
}
