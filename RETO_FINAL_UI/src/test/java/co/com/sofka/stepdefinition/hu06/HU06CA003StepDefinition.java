package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.stepdefinition.Setup;
import co.com.sofka.tasks.hu06.edit.BrowseToEdit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.hu06.edit.BrowseToEdit.browseToEdit;

import static co.com.sofka.tasks.hu06.edit.HU06CrudProgramaEditarSolonombre.editarSolonombre;
import static co.com.sofka.tasks.hu06.edit.HU06CrudProgramaEditarTaskEliminar.eliminarCurso;
import static co.com.sofka.tasks.hu06.edit.HU06CrudProgramaEditarTaskNoName.editarProgramaAgregandoCursos;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HU06CA003StepDefinition extends Setup {

    private static final String ACTOR_NAME = "Coach";

    @Given("que el coach se encuentra en la seccion de editar programa")
    public void queElCoachSeEncuentraEnLaSeccionDeEditarPrograma() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
        theActorInTheSpotlight().attemptsTo(
                browseToEdit()
        );
    }

    @When("el coah proceda a editar el nombre de un programa ya existente y pulse el boton de guardar")
    public void el_coah_proceda_a_editar_el_nombre_de_un_programa_ya_existente_y_pulse_el_boton_de_guardar() {
        theActorInTheSpotlight().attemptsTo(
                editarSolonombre()
                        .setNombrePrograma("asdasda")
        );
    }

    @Then("este cambio se debe guardar exitosamente en dicho programa")
    public void esteCambioSeDebeGuardarExitosamenteEnDichoPrograma() {

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
