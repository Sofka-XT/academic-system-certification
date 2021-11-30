package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.questions.hu06.editarPrograma.AssertToEditNameQuestion;
import co.com.sofka.stepdefinition.Setup;
import co.com.sofka.tasks.hu06.BrowseToList;
import co.com.sofka.tasks.hu06.edit.BrowseToEdit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static co.com.sofka.questions.hu06.delete.AssertToDeleteQuestions.assertToDeleteQuestions;
import static co.com.sofka.questions.hu06.editarPrograma.AssertToEditNameQuestion.assertToEditNameQuestion;
import static co.com.sofka.tasks.hu06.BrowseToList.browseToList;
import static co.com.sofka.tasks.hu06.create.BrowseToCreate.browseToCreate;
import static co.com.sofka.tasks.hu06.edit.BrowseToEdit.browseToEdit;

import static co.com.sofka.tasks.hu06.edit.HU06CrudProgramaEditarSolonombre.editarSolonombre;
import static co.com.sofka.tasks.hu06.edit.HU06CrudProgramaEditarTaskEliminar.eliminarCurso;
import static co.com.sofka.tasks.hu06.edit.HU06CrudProgramaEditarTaskNoName.editarProgramaAgregandoCursos;
import static co.com.sofka.tasks.hu06.loginWithGoogle.FillGoogleAutenticationCoach.fillAutenticationForm;
import static co.com.sofka.tasks.hu06.loginWithGoogle.LoginWithGoogle.loginWithGoogle;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.userinterfaces.hu06.login.DashBoardPage.ROLE_COACH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA003StepDefinition extends Setup {

    private static final String ACTOR_NAME = "Coach";


    @Given("que el coach se encuentra en la seccion de editar programa")
    public void queElCoachSeEncuentraEnLaSeccionDeEditarPrograma() {
        actorSetupTheBrowser(ACTOR_NAME);
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

        WaitUntil.the(ROLE_COACH, isVisible()).forNoMoreThan(10).seconds();

        theActorInTheSpotlight().attemptsTo(
                browseToList()
        );
    }

    @When("el coah proceda a editar el nombre de un programa ya existente y pulse el boton de guardar")
    public void el_coah_proceda_a_editar_el_nombre_de_un_programa_ya_existente_y_pulse_el_boton_de_guardar() {
        theActorInTheSpotlight().attemptsTo(
                editarSolonombre()
                        .setNombrePrograma("Program Testt")
        );
    }

    @Then("este cambio se debe guardar exitosamente en dicho programa")
    public void esteCambioSeDebeGuardarExitosamenteEnDichoPrograma() {
        theActorInTheSpotlight().should(
                seeThat(
                        assertToEditNameQuestion()
                                .is(),equalTo(true)
                )
        );
    }

    @When("el coah proceda a editar el nombre de un programa y deje este campo vacio")
    public void elCoahProcedaAEditarElNombreDeUnProgramaYDejeEsteCampoVacio() {
        theActorInTheSpotlight().attemptsTo(
                editarSolonombre()
                        .setNombrePrograma("")
        );
    }

    @Then("debe saltar una alerta que haga saber al usuario el fallo cometido")
    public void debe_saltar_una_alerta_que_haga_saber_al_usuario_el_fallo_cometido() {

    }

    @When("el coah proceda a asignar un curso en un programa especifico")
    public void el_coah_proceda_a_asignar_un_curso_en_un_programa_especifico() {
        theActorInTheSpotlight().attemptsTo(
            editarProgramaAgregandoCursos()
                    .usingDuracionCurso1("1")
                    .usingDurationCurso2("2")
        );
    }

    @Then("el curso asignado en dicho programa debe guardarse correctamente y en el orden estipilado de agregacion")
    public void el_curso_asignado_en_dicho_programa_debe_guardarse_correctamente_y_en_el_orden_estipilado_de_agregacion() {

    }

    @When("el coah proceda a eliminar un curso en un programa especifico")
    public void el_coah_proceda_a_eliminar_un_curso_en_un_programa_especifico() {
        theActorInTheSpotlight().attemptsTo(
            eliminarCurso()
        );
    }

    @Then("el curso eliminado de dicho programa debe retirarse  correctamente y en el orden estipilado se debe conservar")
    public void el_curso_eliminado_de_dicho_programa_debe_retirarse_correctamente_y_en_el_orden_estipilado_se_debe_conservar() {

    }

}
