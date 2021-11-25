package co.com.sofka.stepdefinition.hu01;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static co.com.sofka.questions.hu01.LoginValidation.loginValidation;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU01StepDefinitionUno extends Setup {

    private static final String ACTOR_NAME = "User";

    @Given("el usuario se encuentra en la pagina login")
    public void elUsuarioSeEncuentraEnLaPaginaLogin() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }

    @Then("deberia visualizar el boton de ingreso")
    public void deberiaVisualizarElBotonDeIngreso() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginValidation()
                                .loginValidationMessage("Iniciar sesión con Google")
                                .is(),equalTo(true)
                )
        );
    }
}
