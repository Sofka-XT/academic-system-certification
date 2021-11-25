package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.setup.services.hu06.Hu06;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.models.hu06.HU06CA003Modelo.modelado;
import static co.com.sofka.tasks.hu06.PutEdirProgram.putEdirSoloNombre;

public class HU06CA003StepDefinition extends Hu06 {


    @Given("El coah se encuentre el la pagina de edicion de proegramas")
    public void elCoahSeEncuentreElLaPaginaDeEdicionDeProegramas() {
        setUp();
    }

    @When("El coach edite el nombre de un programa con un numero de caracteres adecuado")
    public void elCoachEditeElNombreDeUnProgramaConUnNumeroDeCaracteresAdecuado() {
        actor.attemptsTo(
                putEdirSoloNombre()
                        .usingUpdateInfo(modelado()
                                .setIdPrograma("619f01b4de1ee71e4736955c")
                                .setNombrePrograma("Programa prueba Json")
                                .setIdCurso("889911")
                                .setNombreCurso("Curso prueba Json")
                                .setIdCategoria("556677")
                                .setNombreCategoria("Categoria prueba Json")
                                .setDiasCategoria(6)
                                .getFullJson())
        );
    }

    @Then("entonces el los cambios definidos se deben guardar correctamente y  retornar un status OK")
    public void entoncesElLosCambiosDefinidosSeDebenGuardarCorrectamenteYRetornarUnStatusOK() {

    }

    @When("El coach edite el nombre de un programa con un numero de caracteres fuera del rango \\(menos de {int} y mas de {int})")
    public void elCoachEditeElNombreDeUnProgramaConUnNumeroDeCaracteresFueraDelRangoMenosDeYMasDe(Integer int1, Integer int2) {

    }

    @Then("entonces el los cambios definidos no se deben guardar  y  retornar un status FAIL")
    public void entoncesElLosCambiosDefinidosNoSeDebenGuardarYRetornarUnStatusFAIL() {

    }

    @When("El coach proceda a agregar un curso en un programa con los parametros adecuados")
    public void elCoachProcedaAAgregarUnCursoEnUnProgramaConLosParametrosAdecuados() {

    }

    @Then("entonces el curso se debe guardar correctamente en el programa indicado")
    public void entoncesElCursoSeDebeGuardarCorrectamenteEnElProgramaIndicado() {

    }

    @When("El coach proceda a agregar un curso en un programa con parametros erroneos")
    public void elCoachProcedaAAgregarUnCursoEnUnProgramaConParametrosErroneos() {

    }

    @Then("entonces el curso no se debe guardar en el programa  y debe retornar un status FAIL")
    public void entoncesElCursoNoSeDebeGuardarEnElProgramaYDebeRetornarUnStatusFAIL() {

    }

    @When("El coach proceda a eliminar todos los cursos de un programa")
    public void elCoachProcedaAEliminarTodosLosCursosDeUnPrograma() {

    }

    @Then("entonces se debe retornar un status FAIL")
    public void entoncesSeDebeRetornarUnStatusFAIL() {

    }
}
