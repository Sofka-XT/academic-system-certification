package co.com.sofka.stepdefinition.hu07;

import co.com.sofka.models.hu07.Response;
import co.com.sofka.models.hu07.ResponseItem;
import co.com.sofka.questions.hu07.ResponseCode;
import co.com.sofka.questions.hu07.ResponseItemQuestion;
import co.com.sofka.setup.services.hu07.SetUpHu07;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import java.util.Arrays;
import java.util.HashMap;

import static co.com.sofka.tasks.hu07.GetAllTrainingsTask.getAllTrainingsTask;
import static co.com.sofka.util.hu07.Dictionary.*;

import static javax.servlet.http.HttpServletResponse.SC_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetAllTrainingsStepDefinition extends SetUpHu07 {

    private final HashMap<String, Object> headers = new HashMap<>();
    private ResponseItem responseItem;
    private String trainings;
    private String[] lista;

    @Given("que tengo acceso al gestor de")
    public void que_tengo_acceso_al_gestor_de() {
        setUp();
    }

    @When("quiero ver un training nuevo")
    public void quiero_ver_un_training_nuevo() {
        actor.attemptsTo(
                getAllTrainingsTask().withHeaders(headers)
        );

        /*responseItem= new ResponseItemQuestion().answeredBy(actor)
                .getResponse().stream().findFirst().orElse(null);*/

        trainings=LastResponse.received().answeredBy(actor).asString();
        lista=trainings.split("trainingId");
        System.err.println(trainings);
    }

    @Then("deberia ver el training de manera correcta")
    public void deberia_ver_el_training_de_manera_correcta() {
        LastResponse.received().answeredBy(actor).prettyPrint();
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(), ResponseCode.was(),equalTo(SC_OK))
        );
    }

}
