package co.com.sofka.stepdefinition.prueba;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.Set;


import static co.com.sofka.questions.hu01.LoginValidation.loginValidation;
import static co.com.sofka.tasks.loginWithGoogle.DoLogoutAsCoach.doLogoutAsCoach;
import static co.com.sofka.tasks.loginWithGoogle.FillGoogleAutenticationForm.fillAutenticationForm;
import static co.com.sofka.tasks.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu01.DashBoardPage.LOGOUTCOUCH;
import static co.com.sofka.userinterfaces.hu01.DashBoardPage.ROLE;
import static co.com.sofka.userinterfaces.hu01.LoginPage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.equalTo;


public class HU01StepDefinitionDos extends Setup {


    private static final String ACTOR_NAME = "User";

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
    @Then("deberia visualizar la pagina principal correspondiente a su rol")
    public void deberiaVisualizarLaPaginaPrincipalCorrespondienteASuRol() {
        WaitUntil.the(ROLE, isVisible()).forNoMoreThan(10).seconds();
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ROLE, isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(ROLE).text().isEqualToIgnoringCase("COACH")
        );
        /*
        theActorInTheSpotlight().should(
                seeThat(
                        loginQuestion()
                                .loginQuestionMessage("APPRENTICE")
                                .is(),equalTo(true)
                )
        );
*/
    }

    @When("realiza login exitosamente")
    public void realizaLoginExitosamente() {

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
    @When("realiza logout")
    public void realizaLogout() {
        theActorInTheSpotlight().attemptsTo(
                doLogoutAsCoach()
        );
    }
    @Then("se tendra que mostrar la login page")
    public void seTendraQueMostrarLaLoginPage() {
        WaitUntil.the(LOGIN_BUTTON, isVisible()).forNoMoreThan(10).seconds();
        theActorInTheSpotlight().should(
                seeThat(
                        loginValidation()
                                .loginValidationMessage("Iniciar sesión con Google")
                                .is(),equalTo(true)
                )
        );
    }
}
