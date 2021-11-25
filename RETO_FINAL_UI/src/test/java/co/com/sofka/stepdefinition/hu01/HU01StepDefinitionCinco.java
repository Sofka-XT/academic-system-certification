package co.com.sofka.stepdefinition.hu01;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static co.com.sofka.questions.hu01.LoginValidation.loginValidation;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.loginWithGoogle.DoLogoutAsCoach.doLogoutAsCoach;
import static co.com.sofka.tasks.loginWithGoogle.DoLogoutAsCoach.doLogoutAsCoach;
import static co.com.sofka.tasks.loginWithGoogle.FillGoogleAutenticationForm.fillAutenticationForm;
import static co.com.sofka.tasks.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.userinterfaces.hu01.DashBoardPage.LOGOUTCOUCH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU01StepDefinitionCinco extends Setup {
    private static final String ACTOR_NAME = "User";
    @When("realiza login exitosamente")
    public void realizaLoginExitosamente() {

       /* actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );*/
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
        WaitUntil.the(LOGOUTCOUCH, isVisible()).forNoMoreThan(10).seconds();
    }
    @When("realiza logout")
    public void realizaLogout() {
        theActorInTheSpotlight().attemptsTo(
                doLogoutAsCoach()
        );
    }
    @Then("se tendra que mostrar la login page")
    public void seTendraQueMostrarLaLoginPage() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginValidation()
                                .loginValidationMessage("Iniciar sesión con Google")
                                .is(),equalTo(true)
                )
        );
    }
}
