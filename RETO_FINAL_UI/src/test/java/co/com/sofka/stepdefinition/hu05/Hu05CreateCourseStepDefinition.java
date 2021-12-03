package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.exceptions.hu02.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static co.com.sofka.exceptions.hu02.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.tasks.hu01.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu01.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.hu05.FillCourseForm.fillCourseForm;
import static co.com.sofka.tasks.hu05.BrowsToDescrptionCourse.*;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.questions.hu05.CreateCourseQuestion.*;
import static co.com.sofka.userinterfaces.hu005.CourseInfo.HEADER_NAME_CURSO;
import static co.com.sofka.util.hu005.User.COACH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


public class Hu05CreateCourseStepDefinition extends Setup {
    private static final String ACTOR = COACH.getValue();
    private DataTable dataToValidate;
    @Given("doy click sobre la opcion Crear curso")
    public void doy_click_sobre_la_opcion_Crear_nuevo_curso() {
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

    @When("llene el formulario con todos los campos y doy clic sobre el boton crear")
    public void llene_el_formulario_con_todos_los_campos_y_de_clic_sobre_guardar(io.cucumber.datatable.DataTable dataTable) {
        dataToValidate = dataTable;

        theActorInTheSpotlight().attemptsTo(
                fillCourseForm()
                        .usingNameCourse(dataTable.row(0).get(1))
                        .usingNameCategory(dataTable.row(1).get(1))
                        .usingConditionRed(dataTable.row(2).get(1))
                        .usingQualificacionRed(dataTable.row(3).get(1))
                        .usingFeedBackNameRed(dataTable.row(4).get(1))
                        .usingUrlGrade(dataTable.row(5).get(1))
                        .usingConditionYellow(dataTable.row(6).get(1))
                        .usingQualificacionYellow(dataTable.row(7).get(1))
                        .usingFeedBackNameYellow(dataTable.row(8).get(1))
                        .usingConditionGreen(dataTable.row(9).get(1))
                        .usingQualificacionGreen(dataTable.row(10).get(1))
                        .usingFeedBackNameGreen(dataTable.row(11).get(1))
                        .usingNameCategoryCategory2(dataTable.row(12).get(1))
                        .usingConditionRedCategory2(dataTable.row(13).get(1))
                        .usingQualificacionRedCategory2(dataTable.row(14).get(1))
                        .usingFeedBackNameRedCategory2(dataTable.row(15).get(1))
                        .usingUrlGrade2(dataTable.row(16).get(1))
                        .usingConditionYellowCategory2(dataTable.row(17).get(1))
                        .usingQualificacionYellowCategory2(dataTable.row(18).get(1))
                        .usingFeedBackNameYellowCategory2(dataTable.row(19).get(1))
                        .usingConditionGreenCategory2(dataTable.row(20).get(1))
                        .usingQualificacionGreenCategory2(dataTable.row(21).get(1))
                        .usingFeedBackNameGreenCategory2(dataTable.row(22).get(1))

        );
        theActorInTheSpotlight().attemptsTo(
                searchUserPracticeForm()

        );
    }




    @Then("^el sistema debe mostrar el siguiente mensaje: (.+)$")
    public void el_sistema_debe_mostrar_el_siguiente_mensaje_Registro_exitoso(String message) {
        theActorInTheSpotlight().should(
                seeThat(createCourseQuestion()
                        .courseNameQuestionMessage(dataToValidate.row(0).get(1))

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
