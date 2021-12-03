package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.exceptions.hu02.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.SetUp;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static co.com.sofka.exceptions.hu02.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.questions.hu05.UpdateCourseQuestion.*;
import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu01.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.hu05.FillCourseUpdateForm.UpdateCourseForm;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu005.CourseInfo.HEADER_NAME_CURSO;
import static co.com.sofka.util.hu005.User.COACH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class Hu05UpdateCourseStepDefinition extends SetUp {
    private static final String ACTOR = COACH.getValue();
    private DataTable dataToValidate;
    private String fullCategory="Categoria: ";
    @Given("doy click sobre la opcion Ver curso")
    public void doyClickSobreLaOpcionVerCurso() {
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

    @When("lleno la regla con todos los campos y doy clic sobre el boton editar")
    public void llenoLaReglaConTodosLosCamposYDoyClicSobreElBotonEditar(io.cucumber.datatable.DataTable dataTable) {
        dataToValidate = dataTable;

        theActorInTheSpotlight().attemptsTo(
                UpdateCourseForm()

                        .usingNameCategory(dataTable.row(0).get(1))
                        .usingConditionRed(dataTable.row(1).get(1))
                        .usingQualificacionRed(dataTable.row(2).get(1))
                        .usingFeedBackNameRed(dataTable.row(3).get(1))
                        .usingUrlGrade(dataTable.row(4).get(1))
                        .usingConditionYellow(dataTable.row(5).get(1))
                        .usingQualificacionYellow(dataTable.row(6).get(1))
                        .usingFeedBackNameYellow(dataTable.row(7).get(1))
                        .usingConditionGreen(dataTable.row(8).get(1))
                        .usingQualificacionGreen(dataTable.row(9).get(1))
                        .usingFeedBackNameGreen(dataTable.row(10).get(1))


        );

    }




    @Then("^el sistema debe mostrara el siguiente mensaje: (.+)$")
    public void el_sistema_debe_mostrara_el_siguiente_mensaje_Registro_exitoso(String message) {
        fullCategory=fullCategory+dataToValidate.row(0).get(1);
        theActorInTheSpotlight().should(
                seeThat(UpdateCourseQuestion()
                        .courseNameQuestionMessage(fullCategory)

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
                + "\n" + dataToValidate.row(0).get(1) +" : " + HEADER_NAME_CURSO.resolveFor(theActorInTheSpotlight()).getText();

    }
}
