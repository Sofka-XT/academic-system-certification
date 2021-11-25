package co.com.sofka.stepdefinition.hu07;

import co.com.sofka.questions.hu07.GetOneTrainingQuestion;
import co.com.sofka.questions.hu07.ResponseCode;
import co.com.sofka.setup.services.hu07.SetUpHu07;
import co.com.sofka.tasks.hu07.CreateTrainingTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import static co.com.sofka.util.hu07.Dictionary.THE_RESPONSE_CODE;
import static javax.servlet.http.HttpServletResponse.SC_ACCEPTED;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreateTrainingStepDefinition extends SetUpHu07 {

    static String trainingId;

    public String getTrainingId() {
        return trainingId;
    }

    @When("quiero crear un training nuevo")
    public void quiero_crear_un_training_nuevo() {
        setUp();
        actor.attemptsTo(
                CreateTrainingTask.withInfo(crearBody())
        );

        trainingId = new GetOneTrainingQuestion().answeredBy(actor).getTrainingId().toString();
    }

    @Then("deberia crear el training de manera correcta")
    public void deberia_crear_el_training_de_manera_correcta() {
        LastResponse.received().answeredBy(actor).prettyPrint();
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(),ResponseCode.was(),equalTo(SC_OK))
        );
    }

    public String crearBody()
    {
        String bodyTraining ="{\n" +
                "    \"name\": \"Training Qa c33\",\n" +
                "    \"startingDate\": \"2021-12-21\",\n" +
                "    \"apprentices\": [{\n" +
                "        \"id\": \"123kisdha8\",\n" +
                "        \"name\": \"Santi\",\n" +
                "        \"phoneNumber\": \"21232454\",\n" +
                "        \"emailAddress\": \"santiago@gmail.com\"\n" +
                "\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"qwedfws44ef3\",\n" +
                "        \"name\": \"Camilo\",\n" +
                "        \"phoneNumber\": \"234dfsdt\",\n" +
                "        \"emailAddress\": \"camilo@gmail.com\"\n" +
                "\n" +
                "    }\n" +
                "    ],\n" +
                "    \"coaches\": [{\n" +
                "        \"id\": \"wagary553\",\n" +
                "        \"name\": \"Raul\",\n" +
                "        \"phoneNumber\": \"12355656\",\n" +
                "        \"emailAddress\": \"raul@gmail.com\"\n" +
                "    }],\n" +
                "    \"program\": \"123iasdias9093\"\n" +
                "}";

        return bodyTraining;
    }
}
