package co.com.sofka.stepdefinition.hu01;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static co.com.sofka.questions.hu01.LoginValidationButton.loginValidation;
import static co.com.sofka.tasks.hu01.loginWithGoogle.DoLogout.doLogoutAsCoach;
import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationApprentice.fillGoogleAutenticationApprentice;
import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationFail.fillGoogleAutenticationFail;
import static co.com.sofka.tasks.hu01.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu01.DashBoardPage.*;
import static co.com.sofka.userinterfaces.hu01.LoginPage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.equalTo;


public class HU01StepDefinition extends Setup {

    private static final String ACTOR_NAME = "User";
    String currentWindow ="";

    @Given("el usuario se encuentra en la pagina login")
    public void elUsuarioSeEncuentraEnLaPaginaLogin() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }

    @When("realiza login a la plataforma")
    public void realizaLoginALaPlataforma() {
        theActorInTheSpotlight().attemptsTo(
                loginWithGoogle()
        );
        cambiarAGoogleLogin();
        theActorInTheSpotlight().attemptsTo(
                fillAutenticationForm()
        );
        volverAPaginaLogin();
    }

    @Then("deberia visualizar la pagina principal correspondiente a coach")
    public void deberiaVisualizarLaPaginaPrincipalCorrespondienteACoach() {
        WaitUntil.the(ROLE_COACH, isVisible()).forNoMoreThan(20).seconds();
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ROLE_COACH, isVisible()).forNoMoreThan(20).seconds(),
                Ensure.that(ROLE_COACH).text().isEqualToIgnoringCase("COACH")
        );

    }

    public void cambiarAGoogleLogin(){
        try{
            currentWindow = getDriver().getWindowHandle();
            Set<String> allWindows = getDriver().getWindowHandles();
            for (String window : allWindows) {
                if (!window.contentEquals(currentWindow)) {
                    getDriver().switchTo().window(window);
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void volverAPaginaLogin(){
        getDriver().switchTo().window(currentWindow);
    }




    @When("realiza login con credenciales de aprendiz")
    public void realizaLoginConCredencialesDeAprendiz() {
        theActorInTheSpotlight().attemptsTo(
                loginWithGoogle()
        );
        cambiarAGoogleLogin();
        theActorInTheSpotlight().attemptsTo(
                fillGoogleAutenticationApprentice()
        );
        volverAPaginaLogin();
    }

    @Then("deberia visualizar la pagina principal correspondiente a aprendiz")
    public void eberiaVisualizarLaPaginaPrincipalCorrespondienteAAprendiz() {
        WaitUntil.the(ROLE_APPRENDICE, isVisible()).forNoMoreThan(20).seconds();
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ROLE_APPRENDICE, isVisible()).forNoMoreThan(20).seconds(),
                Ensure.that(ROLE_APPRENDICE).text().isEqualToIgnoringCase("APPRENTICE")
        );
    }

    @When("ingresa gmail erroneo o no registrado")
    public void ingresaGmailErroneoONoRegistrado() {
        theActorInTheSpotlight().attemptsTo(
                loginWithGoogle()
        );
        cambiarAGoogleLogin();
        theActorInTheSpotlight().attemptsTo(
                fillGoogleAutenticationFail()
        );
        volverAPaginaLogin();
    }

    @Then("se tendra que mostrar un mensaje de error")
    public void seTendraQueMostrarUnMensajeDeError() {
        WaitUntil.the(FAIL_LOGIN, isVisible()).forNoMoreThan(20).seconds();
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(FAIL_LOGIN, isVisible()).forNoMoreThan(20).seconds(),
                Ensure.that(FAIL_LOGIN).text().isEqualToIgnoringCase("Usuario no encontrado")
        );
    }

    @When("realiza login exitosamente")
    public void realizaLoginExitosamente() {
        theActorInTheSpotlight().attemptsTo(
                loginWithGoogle()
        );
        cambiarAGoogleLogin();
        theActorInTheSpotlight().attemptsTo(
                fillAutenticationForm()
        );
        volverAPaginaLogin();
    }

    @When("realiza logout")
    public void realizaLogout() {
        theActorInTheSpotlight().attemptsTo(
                doLogoutAsCoach()
        );
    }

    @Then("se tendra que mostrar la login page")
    public void seTendraQueMostrarLaLoginPage() {
        WaitUntil.the(LOGIN_BUTTON, isVisible()).forNoMoreThan(20).seconds();
        theActorInTheSpotlight().should(
                seeThat(
                        loginValidation()
                                .loginValidationMessage("Iniciar sesión con Google")
                                .is(), equalTo(true)
                )
        );
    }
}
