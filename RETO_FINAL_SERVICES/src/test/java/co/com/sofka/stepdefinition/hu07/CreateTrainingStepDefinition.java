package co.com.sofka.stepdefinition.hu07;

import co.com.sofka.questions.hu07.GetOneTrainingQuestion;
import co.com.sofka.questions.hu07.ResponseCode;
import co.com.sofka.setup.services.hu07.SetUpHu07;
import co.com.sofka.tasks.hu07.CreateTrainingTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static co.com.sofka.util.hu07.Dictionary.THE_RESPONSE_CODE;
import static javax.servlet.http.HttpServletResponse.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreateTrainingStepDefinition extends SetUpHu07 {

    DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    String dateTime = fechaHora.format(LocalDateTime.now()).toString();
    private final String FECHA_CORRECTA="2021-12-21";
    private final String FECHA_INCORRECTA="2021-30-21";

    static String trainingId;

    @When("quiero crear un training nuevo")
    public void quieroCrearUnTrainingNuevo() {
        setUp();
        actor.attemptsTo(
                CreateTrainingTask.withInfo(crearBody(FECHA_CORRECTA))
        );

        trainingId = new GetOneTrainingQuestion().answeredBy(actor).getTrainingId().toString();
    }

    @Then("deberia crear el training de manera correcta")
    public void deberiaCrearElTrainingDeManeraCorrecta() {
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(),ResponseCode.was(),equalTo(SC_OK))
        );
    }

    @When("quiero crear un training con una fecha invalida")
    public void quieroCrearUnTrainingConUnaFechaInvalida() {
        setUp();
        actor.attemptsTo(
                CreateTrainingTask.withInfo(crearBody(FECHA_INCORRECTA))
        );
    }

    @Then("deberia ver un mensaje de error en la creacion")
    public void deberiaVerUnMensajeDeErrorEnlaCreacion() {
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(),ResponseCode.was(),equalTo(SC_BAD_REQUEST))
        );
    }

    public String crearBody(String fecha)
    {
        String bodyTraining ="{\n" +
                "    \"trainingId\":\"61a5a744ac1c3a028ffa9ae7\",\n" +
                "    \"name\": \"Training actualizado: "+ dateTime +"\",\n" +
                "    \"startingDate\": \""+fecha+"\",\n" +
                "    \"apprentices\": [{\n" +
                "        \"id\": \"123456789\",\n" +
                "        \"name\": \"uvbadasd\",\n" +
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
