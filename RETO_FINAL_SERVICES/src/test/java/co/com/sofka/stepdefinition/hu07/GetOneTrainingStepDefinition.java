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

import static javax.servlet.http.HttpServletResponse.SC_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetOneTrainingStepDefinition extends SetUpHu07 {

    private ApprenticesItem apprenticesItem;
    private CoachesItem coachesItem;
    private String trainingId;
    private String name;
    private String program;
    private String startingDate;

    @Given("que tengo acceso al gestor de")
    public void que_tengo_acceso_al_gestor_de() {
        setUp();
    }

    @When("quiero ver un training nuevo")
    public void quiero_ver_un_training_nuevo() {
        actor.attemptsTo(
                GetOneTrainingTask.fromPage("/619d6759989a1b6077057920")
        );
        guardarDatosTraining();
    }

    @Then("deberia ver el training de manera correcta")
    public void deberia_ver_el_training_de_manera_correcta() {
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(),act ->  name,equalTo("Training Qa "))
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
