package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.questions.hu06.ResponseCode;
import co.com.sofka.setup.services.hu06.Hu06;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.hu06.DeleteProgram.deleteProgram;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.apache.http.HttpStatus.SC_ACCEPTED;
import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA002StepDefinition extends Hu06 {

    @Given("El coah se realice una peticion de eliminar programa")
    public void elCoahSeRealiceUnaPeticionDeEliminarPrograma() {
        setUp();
    }

    @When("la peticion se realice con un id correcto y existente")
    public void laPeticionSeRealiceConUnIdCorrectoYExistente() {
        actor.attemptsTo(
                deleteProgram()
                        .usingIdProgramaDelete("619f9415415833bde0d299")
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
