package co.com.sofka.stepdefinition.hu07;

import co.com.sofka.models.hu07.getonetraining.ApprenticesItem;
import co.com.sofka.models.hu07.getonetraining.CoachesItem;
import co.com.sofka.questions.hu07.GetOneTrainingQuestion;
import co.com.sofka.questions.hu07.ResponseCode;
import co.com.sofka.setup.services.hu07.SetUpHu07;
import co.com.sofka.tasks.hu07.UpDateTrainingTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static co.com.sofka.util.hu07.Dictionary.THE_RESPONSE_CODE;
import static co.com.sofka.util.hu07.Dictionary.THE_RESPONSE_MUST;
import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class UpDateTrainingStepDefinition extends SetUpHu07 {

    DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private String name;
    private final String FECHA_CORRECTA="2021-12-21";
    private final String FECHA_INCORRECTA="2021-30-21";
    String dateTime = fechaHora.format(LocalDateTime.now()).toString();

    //Assertions
    private final String NAME_ASSERTION="Training actualizado: ";

    @When("quiero actualizar un training nuevo")
    public void quiero_actualizar_un_training_nuevo() {
        setUp();
        actor.attemptsTo(
                UpDateTrainingTask.fromPage(crearCuerpo(FECHA_CORRECTA))
        );
        guardarDatosTraining();
    }

    @Then("deberia ver el training actualizado")
    public void deberia_ver_el_training_actualizado() {
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(), ResponseCode.was(),equalTo(SC_OK)),
                seeThat(THE_RESPONSE_MUST.getValue(),act->name,equalTo(NAME_ASSERTION+dateTime))
        );
    }

    @When("quiero actualizar un training ingresando una fecha invalidad")
    public void quiero_actualizar_un_training_ingresando_una_fecha_invalidad() {
        setUp();
        actor.attemptsTo(
                UpDateTrainingTask.fromPage(crearCuerpo(FECHA_INCORRECTA))
        );
    }
    @Then("deberia aparecer un mensaje de error en la actualizacion")
    public void deberia_aparecer_un_mensaje_de_error_en_la_actualizacion() {
        actor.should(
                seeThat(THE_RESPONSE_CODE.getValue(), ResponseCode.was(),equalTo(SC_BAD_REQUEST))
        );
    }

    public String crearCuerpo(String fecha)
    {
        String cuerpo = "{\n" +
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
        return cuerpo;
    }

    public void guardarDatosTraining()
    {
        name = new GetOneTrainingQuestion().answeredBy(actor).getName().toString();
    }
}
