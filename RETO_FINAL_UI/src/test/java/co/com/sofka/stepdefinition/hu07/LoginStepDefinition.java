package co.com.sofka.stepdefinition.hu07;

import co.com.sofka.exceptions.hu07.ValidationCrudTraingin;
import co.com.sofka.stepdefinition.Setup;
import co.com.sofka.tasks.hu07.LoginTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Locale;

import static co.com.sofka.exceptions.hu07.ValidationCrudTraingin.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.questions.hu07.LoginQuestion.loginQuestion;
import static co.com.sofka.tasks.hu07.LoginTask.loginTask;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu07.loginUI.PIM;
import static co.com.sofka.util.hu07.DictionaryCrudTraining.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginStepDefinition extends Setup {

    @Given("que tengo acceso al gestor de")
    public void que_tengo_acceso_al_gestor_de() {
        actorSetupTheBrowser(ACTOR_NAME.getValue());

        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }

    @When("quiero crear un training nuevo")
    public void quiero_crear_un_training_nuevo() {
        theActorInTheSpotlight().attemptsTo(
                loginTask().setUser(USER.getValue())
                        .setPassword(PASSWORD.getValue()).is()
        );
    }

    @Then("deberia crear el training de manera correcta")
    public void deberia_crear_el_training_de_manera_correcta() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginQuestion()
                                .setTarget(PIM)
                                .setAssertionmessage(PIM_ASSERTION.getValue())
                                .is(),
                        equalTo(true)
                ).orComplainWith(ValidationCrudTraingin.class,
                        String.format(VALIDATION_DO_NOT_MATCH,FALLO)
                )
        );
    }
}
