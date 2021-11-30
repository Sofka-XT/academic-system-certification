package co.com.sofka.stepdefinition.hu07.createtrainingstepdefinition;

import co.com.sofka.stepdefinition.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static co.com.sofka.tasks.hu07.createTraining.CreateTrainingTask.createTrainingTask;
import static co.com.sofka.tasks.hu07.fillLoginGoogle.FillGoogleLoginFormTask.fillAutenticationForm;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.loginwithgoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.userinterfaces.hu07.HomePage.CREAR_TRAINING;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CreateTrainingStepDefinition extends SetUp {

    private static final String NAME_PROGRAM = "DESARROLLO";
    private static final String VALUE_COACH = "1";
    private static final String FECHA_INICIO_TRAINING = "12/02/2022";


    @Given("que el coach se encuentra logueado")
    public void queElCoachSeEncuentraLogueado() {
        actorSetupTheBrowser("Coach");
        theActorInTheSpotlight().attemptsTo(openLandingPage());
        theActorInTheSpotlight().attemptsTo(loginWithGoogle());
        getDriver().switchTo().window(fillLoginForm());
        WaitUntil.the(CREAR_TRAINING, isVisible()).forNoMoreThan(10).seconds();
    }

    @When("el coah quiere crear un nuevo training")
    public void elCoahQuiereCrearUnNuevoTraining() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                createTrainingTask().setNameTraining(NAME_PROGRAM)
                //createTrainingTask().setValueSelectCoach(VALUE_COACH)
                //createTrainingTask().setDateStart(FECHA_INICIO_TRAINING)
        );
        Thread.sleep(10000);
        //aquí tarea de llenar el formulario de training
    }

    @Then("el sistema deberia crear el training de manera correcta")
    public void elSistemaDeberiaCrearElTrainingDeManeraCorrecta() {

    }

    public String fillLoginForm(){

        String currentWindow = getDriver().getWindowHandle();

        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow)){
                getDriver().switchTo().window(window);
                break;
            }
        }
        theActorInTheSpotlight().attemptsTo(fillAutenticationForm());
        return currentWindow;

    }
}
