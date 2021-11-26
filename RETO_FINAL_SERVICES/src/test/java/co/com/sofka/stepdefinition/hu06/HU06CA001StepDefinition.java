package co.com.sofka.stepdefinition.hu06;
import co.com.sofka.models.hu06.HU06CA003ModelWithoutCourse;
import co.com.sofka.models.hu06.HU06CA003Modelo;
import co.com.sofka.models.hu06.Programa;
import co.com.sofka.questions.hu06.GetProgramaById;
import co.com.sofka.questions.hu06.ResponseCode;
import co.com.sofka.setup.services.hu06.Hu06;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.hu06.DeleteProgram.deleteProgram;
import static co.com.sofka.tasks.hu06.PostSendProgram.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.apache.http.HttpStatus.SC_OK;
import static org.apache.http.HttpStatus.SC_INTERNAL_SERVER_ERROR;

import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA001StepDefinition extends Hu06 {
    private HU06CA003Modelo modelo = new HU06CA003Modelo();
    private HU06CA003ModelWithoutCourse modelWithoutCourse = new HU06CA003ModelWithoutCourse();

    private Programa programaRecibido;

    @Given("El coach a definido que quiere crear un programa")
    public void elCoachADefinidoQueQuiereCrearUnPrograma() {
        setUp();
    }

    @When("El coach envía la solicitud con el nombre “Prueba programa” y un curso asociado “Fullstack” con una categoría asociada")
    public void elCoachEnviaLaSolicitudConElNombrePruebaProgramaYUnCursoAsociadoFullstackConUnaCategoriaAsociada() {
        modelo.setIdPrograma("test1");
        modelo.setNombrePrograma("test1");
        modelo.setIdCurso("test1");
        modelo.setNombreCurso("test1");
        modelo.setIdCategoria("test1");
        modelo.setNombreCategoria("test1");
        modelo.setDiasCategoria(1);

        actor.attemptsTo(
                postSendProgram()
                        .usingUpdateInfo(
                                modelo.getFullJson()
                        )
        );

    }
    @Then("El deberá obtener como respuesta que fue creado")
    public void elDeberaObtenerComoRespuestaQueFueCreado() {
        programaRecibido = new GetProgramaById().answeredBy(actor);
        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_OK))
        );
        actor.should(
                seeThat("el titulo debe coincidir",act ->programaRecibido.getName(),equalTo(modelo.getNombrePrograma()))
        );
        actor.attemptsTo(
                deleteProgram()
                        .usingIdProgramaDelete(modelo.getIdPrograma())
        );

    }

    @When("El coach proceda a crear un curso sin nombre")
    public void elCoachProcedaACrearUnCursoSinNombre() {
        modelo.setIdPrograma("test1");
        modelo.setNombrePrograma("");
        modelo.setIdCurso("test1");
        modelo.setNombreCurso("test1");
        modelo.setIdCategoria("test1");
        modelo.setNombreCategoria("test1");
        modelo.setDiasCategoria(1);

        actor.attemptsTo(
                postSendProgram()
                        .usingUpdateInfo(
                                modelo.getFullJson()
                        )
        );


    }

    @Then("el no debera permitir y saldra un status Error")
    public void elNoDeberaPermitirYSaldraUnStatusError() {
        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_INTERNAL_SERVER_ERROR))
        );
    }

    @When("El coach proceda a crear un programa sin cursos asociados")
    public void elCoachProcedaACrearUnProgramaSinCursosAsociados() {
        modelWithoutCourse.setIdPrograma("test1");
        modelWithoutCourse.setNombrePrograma("test1");
        actor.attemptsTo(
                postSendProgram()
                        .usingUpdateInfo(
                                modelWithoutCourse.getFullJson()
                        )
        );

    }

    @When("El coach proceda a crear un programa con una categoria con cero dias")
    public void elCoachProcedaACrearUnProgramaConUnaCategoriaConCeroDias() {
        modelo.setIdPrograma("test1");
        modelo.setNombrePrograma("");
        modelo.setIdCurso("test1");
        modelo.setNombreCurso("test1");
        modelo.setIdCategoria("test1");
        modelo.setNombreCategoria("test1");
        modelo.setDiasCategoria(0);

        actor.attemptsTo(
                postSendProgram()
                        .usingUpdateInfo(
                                modelo.getFullJson()
                        )
        );


    }

    @When("El coach proceda a crear un programa con dias negativos")
    public void elCoachProcedaACrearUnProgramaConDiasNegativos() {
        modelo.setIdPrograma("test1");
        modelo.setNombrePrograma("");
        modelo.setIdCurso("test1");
        modelo.setNombreCurso("test1");
        modelo.setIdCategoria("test1");
        modelo.setNombreCategoria("test1");
        modelo.setDiasCategoria(-1);

        actor.attemptsTo(
                postSendProgram()
                        .usingUpdateInfo(
                                modelo.getFullJson()
                        )
        );


    }

}
