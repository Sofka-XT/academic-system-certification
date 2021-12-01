package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.models.hu06.HU06CA003Modelo;
import co.com.sofka.questions.hu06.ResponseCode;
import co.com.sofka.setup.services.hu06.Hu06;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.hu06.DeleteProgram.deleteProgram;
import static co.com.sofka.tasks.hu06.PostSendProgram.postSendProgram;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.apache.http.HttpStatus.SC_ACCEPTED;
import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA002StepDefinition extends Hu06 {
    public HU06CA003Modelo modelo = new HU06CA003Modelo();
    @Given("El coah se realice una peticion de eliminar programa")
    public void elCoahSeRealiceUnaPeticionDeEliminarPrograma() {
        setUp();

        modelo.setIdPrograma("619f01b4de1ee71e4736955c");
        modelo.setNombrePrograma("Programa prueba Json 3");
        modelo.setIdCurso("889911");
        modelo.setNombreCurso("Curso prueba Json 3");
        modelo.setIdCategoria("556677");
        modelo.setNombreCategoria("Categoria prueba Json 3");
        modelo.setDiasCategoria(6);

        actor.attemptsTo(
                postSendProgram()
                        .usingUpdateInfo(
                                modelo.getFullJson()
                        )
        );
    }

    @When("la peticion se realice con un id correcto y existente")
    public void laPeticionSeRealiceConUnIdCorrectoYExistente() {
        actor.attemptsTo(
                deleteProgram()
                        .usingIdProgramaDelete("619f01b4de1ee71e4736955c")
        );
    }

    @Then("entonces el programa se debe eliminar  y  retornar un status ACEPTED")
    public void entoncesElProgramaSeDebeEliminarYRetornarUnStatusACEPTED() {
        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_ACCEPTED))
        );
    }

    @When("la peticion se realice con un id incorrecto  o no  existente")
    public void laPeticionSeRealiceConUnIdIncorrectoONoExistente() {
        actor.attemptsTo(
                deleteProgram()
                        .usingIdProgramaDelete("")
        );
    }

    @Then("se debe retornar un status fail")
    public void seDebeRetornarUnStatusFail() {
        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_NOT_FOUND))
        );
    }

}
