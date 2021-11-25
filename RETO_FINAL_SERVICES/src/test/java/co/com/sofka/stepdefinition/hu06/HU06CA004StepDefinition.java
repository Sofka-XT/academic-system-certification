package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.questions.hu06.ResponseCode;
import co.com.sofka.setup.services.hu06.Hu06;
import co.com.sofka.tasks.hu06.GetAllProgram;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.equalTo;

public class HU06CA004StepDefinition extends Hu06 {

    @Given("El usuario ha definido que quiere obtener la información de los programas")
    public void elUsuarioHaDefinidoQueQuiereObtenerLaInformacionDeLosProgramas() {
    setUp();
    }
    @When("El usuario envía la solicitud")
    public void elUsuarioEnviaLaSolicitud() {
        actor.attemptsTo(
                GetAllProgram.page()

        );
    }
    @Then("El deberá obtener todos los datos solicitados con el codigo de respuesta status ok.")
    public void elDeberaObtenerTodosLosDatosSolicitadosConElCodigoDeRespuesta() {
        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_OK))
        );

    }

}
