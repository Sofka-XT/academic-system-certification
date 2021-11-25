package co.com.sofka.stepdefinition.hu07;

import co.com.sofka.questions.hu07.ResponseCode;
import co.com.sofka.setup.services.hu07.SetUpHu07;
import co.com.sofka.tasks.hu07.DeleteTrainingTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import static co.com.sofka.util.hu07.Dictionary.THE_RESPONSE_CODE;
import static javax.servlet.http.HttpServletResponse.SC_ACCEPTED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class DeleteTrainingStepDefinition extends SetUpHu07 {

    String traniginID;

    @When("quiero eliminar un training")
    public void quiero_eliminar_un_training() {
        setUp();
        traniginID= CreateTrainingStepDefinition.trainingId;
        actor.attemptsTo(
                DeleteTrainingTask.fromPage("/"+traniginID)
        );

    }

    @Then("deberia eliminar el training de manera correcta")
    public void deberia_eliminar_el_training_de_manera_correcta() {
        LastResponse.received().answeredBy(actor).prettyPrint();
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(), ResponseCode.was(),equalTo(SC_ACCEPTED))
        );
    }

}
