package co.com.sofka.stepdefinition.hu07;

import co.com.sofka.models.hu07.ResponseItem;
import co.com.sofka.questions.hu07.ResponseCode;
import co.com.sofka.questions.hu07.ResponseItemQuestion;
import co.com.sofka.setup.services.hu07.SetUpHu07;
import co.com.sofka.tasks.hu07.GetAllTrainingsTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.stream.Collectors;

import static co.com.sofka.util.hu07.Dictionary.*;

import static javax.servlet.http.HttpServletResponse.SC_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetAllTrainingsStepDefinition extends SetUpHu07 {

    ResponseItem responseItem;
    @Given("que tengo acceso al gestor de")
    public void que_tengo_acceso_al_gestor_de() {
        setUp();
    }

    @When("quiero ver un training nuevo")
    public void quiero_ver_un_training_nuevo() {
        actor.attemptsTo(
                GetAllTrainingsTask.fromPage("")
        );

        responseItem = new ResponseItemQuestion()
                .answeredBy(actor).getResponse().stream().collect(Collectors.toList()).get(0);

        responseItem.getName();
    }

    @Then("deberia ver el training de manera correcta")
    public void deberia_ver_el_training_de_manera_correcta() {
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(), ResponseCode.was(),equalTo(SC_OK))
        );
    }

}
