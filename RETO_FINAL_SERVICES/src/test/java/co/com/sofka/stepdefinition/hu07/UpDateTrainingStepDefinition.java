package co.com.sofka.stepdefinition.hu07;

import co.com.sofka.questions.hu07.ResponseCode;
import co.com.sofka.setup.services.hu07.SetUpHu07;
import co.com.sofka.tasks.hu07.UpDateTrainingTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static co.com.sofka.util.hu07.Dictionary.THE_RESPONSE_CODE;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class UpDateTrainingStepDefinition extends SetUpHu07 {

    DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
    String time;

    @When("quiero actualizar un training nuevo")
    public void quiero_actualizar_un_training_nuevo() {
        setUp();
        time=hora.format(LocalTime.now());
        actor.attemptsTo(
                UpDateTrainingTask.fromPage(crearCuerpo(time))
        );
    }

    @Then("deberia ver el training actualizado")
    public void deberia_ver_el_training_actualizado() {
        LastResponse.received().answeredBy(actor).prettyPrint();
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(), ResponseCode.was(),equalTo(SC_OK))
        );
    }

    public String crearCuerpo(String time)
    {
        String cuerpo = "{\n" +
                "    \"trainingId\":\"619efc1119e2a93c03dd905a\",\n" +
                "    \"name\": \"Training Qa c33\",\n" +
                "    \"startingDate\": \"2021-12-21\",\n" +
                "    \"apprentices\": [{\n" +
                "        \"id\": \"123kisdha8\",\n" +
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
        return cuerpo;
    }
}
