package co.com.sofka.stepdefinition.hu01;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.sofka.questions.hu01.LoginValidationButton.loginValidation;
import static co.com.sofka.util.Dictionary.URL_MENU;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU01StepDefinitionCuatro extends Setup {
    @When("ingresa a cualquier ruta")
    public void ingresaACualquierRuta() {
        theActorInTheSpotlight().attemptsTo(
                Open.url(URL_MENU)
        );
    }
    @Then("deberia visualizar la pagina de login")
    public void deberiaVisualizarLaPaginaDeLogin() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginValidation()
                                .loginValidationMessage("Iniciar sesión con Google")
                                .is(),equalTo(true)
                )
        );
    }
}
