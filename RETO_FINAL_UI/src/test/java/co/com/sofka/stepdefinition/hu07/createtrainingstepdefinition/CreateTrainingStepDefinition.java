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

    @Given("que el coach se encuentra logueado")
    public void queElCoachSeEncuentraLogueado() {
        actorSetupTheBrowser("Coach");
        theActorInTheSpotlight().attemptsTo(openLandingPage());
        theActorInTheSpotlight().attemptsTo(loginWithGoogle());
        getDriver().switchTo().window(fillLoginForm());
        WaitUntil.the(CREAR_TRAINING, isVisible()).forNoMoreThan(10).seconds();
    }

    @When("el coah quiere crear un nuevo training")
    public void elCoahQuiereCrearUnNuevoTraining()  {
        theActorInTheSpotlight().attemptsTo(createTrainingTask());
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
