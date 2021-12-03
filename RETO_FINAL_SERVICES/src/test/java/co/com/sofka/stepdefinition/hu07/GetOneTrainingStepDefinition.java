package co.com.sofka.stepdefinition.hu07;

import co.com.sofka.models.hu07.getonetraining.ApprenticesItem;
import co.com.sofka.models.hu07.getonetraining.CoachesItem;
import co.com.sofka.questions.hu07.ResponseCode;
import co.com.sofka.questions.hu07.GetOneTrainingQuestion;
import co.com.sofka.setup.services.hu07.SetUpHu07;
import co.com.sofka.tasks.hu07.GetOneTrainingTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.util.hu07.Dictionary.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetOneTrainingStepDefinition extends SetUpHu07 {

    private ApprenticesItem apprenticesItem;
    private CoachesItem coachesItem;
    private String trainingId;
    private String name;
    private String program;
    private String startingDate;


    //Assertion
    private final String ID_ASSERTION ="61a1346bfb95976275096464";
    private final String TRAINING_NAME_ASSERTION ="Training Dev 2021";
    private final String STARTING_DATE_ASSERTION ="2021-11-26";


    @Given("que tengo acceso a la aplicacion api")
    public void que_tengo_acceso_a_la_aplicacion_api() {
        setUp();
    }

    @When("quiero ver un training nuevo")
    public void quiero_ver_un_training_nuevo() {
        actor.attemptsTo(
                GetOneTrainingTask.fromPage("/"+ID_ASSERTION)
        );
        guardarDatosTraining();
    }

    @Then("deberia ver el training de manera correcta")
    public void deberia_ver_el_training_de_manera_correcta() {
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(),ResponseCode.was(),equalTo(200)),
                seeThat(THE_RESPONSE_MUST.getValue(),act ->name,equalTo(TRAINING_NAME_ASSERTION)),
                seeThat(THE_RESPONSE_MUST.getValue(),act->trainingId,equalTo(ID_ASSERTION)),
                seeThat(THE_RESPONSE_MUST.getValue(),act->startingDate,equalTo(STARTING_DATE_ASSERTION))
                );
    }

    @When("solicito ver un training de forma incorrecta")
    public void solicitoVerUnTrainingDeFormaIncorrecta() {
        actor.attemptsTo(
                GetOneTrainingTask.fromPage("")
        );
    }

    @Then("deberia ver un mensaje de error")
    public void deberia_ver_un_mensaje_de_error() {
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(),ResponseCode.was(),equalTo(404))
        );
    }

    public void guardarDatosTraining()
    {
        apprenticesItem = new GetOneTrainingQuestion().answeredBy(actor)
                .getApprentices().stream().findFirst().orElse(null);
        coachesItem = new GetOneTrainingQuestion().answeredBy(actor)
                .getCoaches().stream().findFirst().orElse(null);
        name = new GetOneTrainingQuestion().answeredBy(actor).getName().toString();
        program = new GetOneTrainingQuestion().answeredBy(actor).getProgram().toString();
        startingDate = new GetOneTrainingQuestion().answeredBy(actor).getStartingDate().toString();
        trainingId = new GetOneTrainingQuestion().answeredBy(actor).getTrainingId().toString();
    }
}
