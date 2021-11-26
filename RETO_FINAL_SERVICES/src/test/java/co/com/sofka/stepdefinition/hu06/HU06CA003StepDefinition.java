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
import org.hamcrest.Matcher;

import static co.com.sofka.tasks.hu06.GetOneProgram.getOneProgram;
import static co.com.sofka.tasks.hu06.PostSendProgram.postSendProgram;
import static co.com.sofka.tasks.hu06.PutEdirProgram.putEdirSoloNombre;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.apache.http.HttpStatus.SC_INTERNAL_SERVER_ERROR;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA003StepDefinition extends Hu06 {

    public HU06CA003Modelo modelo = new HU06CA003Modelo();
    private HU06CA003ModelWithoutCourse modelWithoutCourse = new HU06CA003ModelWithoutCourse();

    private Programa programaRecibido;

    @Given("El coah se encuentre el la pagina de edicion de proegramas")
    public void elCoahSeEncuentreElLaPaginaDeEdicionDeProegramas() {
        setUp();
    }

    @When("El coach edite el nombre de un programa con un numero de caracteres adecuado")
    public void elCoachEditeElNombreDeUnProgramaConUnNumeroDeCaracteresAdecuado() {
        inicializar();
        actor.attemptsTo(
                putEdirSoloNombre()
                        .usingUpdateInfo(
                                modelo.getFullJson()
                        )
        );

    }

    @Then("entonces el los cambios definidos se deben guardar correctamente y  retornar un status OK")
    public void entoncesElLosCambiosDefinidosSeDebenGuardarCorrectamenteYRetornarUnStatusOK() {
        actor.attemptsTo(
                getOneProgram()
                        .usingIdPrograma(modelo.getIdPrograma())//Aca el ide de nueva consulta
        );

        programaRecibido = new GetProgramaById().answeredBy(actor);

        actor.should(
                seeThat("el titulo debe coincidir",act ->programaRecibido.getName(),equalTo(modelo.getNombrePrograma()))
        );
    }

    @When("El coach edite el nombre de un programa con un numero de caracteres fuera del rango \\(menos de tres y mas de cien)")
    public void el_coach_edite_el_nombre_de_un_programa_con_un_numero_de_caracteres_fuera_del_rango_menos_de_tres_y_mas_de_cien() {
        inicializar();
        modelo.setNombrePrograma("ho");
        actor.attemptsTo(
                putEdirSoloNombre()
                        .usingUpdateInfo(
                                modelo.getFullJson()
                        )
        );
    }

    @Then("entonces el los cambios definidos no se deben guardar  y  retornar un status FAIL")
    public void entoncesElLosCambiosDefinidosNoSeDebenGuardarYRetornarUnStatusFAIL() {

        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_INTERNAL_SERVER_ERROR))
        );
    }

    @When("El coach proceda a agregar un curso en un programa con los parametros adecuados")
    public void elCoachProcedaAAgregarUnCursoEnUnProgramaConLosParametrosAdecuados() {
        modelo.setNombrePrograma("Programa prueba Json 3");
        inicializar();

        actor.attemptsTo(
                putEdirSoloNombre()
                        .usingUpdateInfo(
                                modelo.getFullJson2Program()
                        )
        );
    }

    @Then("entonces el curso se debe guardar correctamente en el programa indicado")
    public void entoncesElCursoSeDebeGuardarCorrectamenteEnElProgramaIndicado() {
        actor.attemptsTo(
                getOneProgram()
                        .usingIdPrograma(modelo.getIdPrograma())//Aca el ide de nueva consulta
        );

        programaRecibido = new GetProgramaById().answeredBy(actor);

        actor.should(
                seeThat("el titulo debe coincidir",act ->programaRecibido.getName(),equalTo(modelo.getNombrePrograma()))
        );
    }


    @When("El coach proceda a eliminar todos los cursos de un programa")
    public void elCoachProcedaAEliminarTodosLosCursosDeUnPrograma() {
        modelWithoutCourse.setIdPrograma("619f01b4de1ee71e4736955c");
        modelWithoutCourse.setNombrePrograma("Programa prueba Json 4");
        actor.attemptsTo(
                postSendProgram()
                        .usingUpdateInfo(
                                modelWithoutCourse.getFullJson()
                        )
        );
    }

    @Then("entonces se debe retornar un status FAIL")
    public void entoncesSeDebeRetornarUnStatusFAIL() {
        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_INTERNAL_SERVER_ERROR))
        );

    }

    private void inicializar(){
        modelo.setIdPrograma("619f01b4de1ee71e4736955c");
        modelo.setNombrePrograma("Programa prueba Json 3");
        modelo.setIdCurso("889911");
        modelo.setNombreCurso("Curso prueba Json 3");
        modelo.setIdCategoria("556677");
        modelo.setNombreCategoria("Categoria prueba Json 3");
        modelo.setDiasCategoria(6);
    }

}
