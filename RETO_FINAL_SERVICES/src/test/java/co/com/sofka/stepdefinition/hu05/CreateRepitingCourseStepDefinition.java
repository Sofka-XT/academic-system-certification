package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.SetUpHu05;
import co.com.sofka.questions.hu05.ResponseCode;
import co.com.sofka.tasks.hu05.CreateCourse;
import co.com.sofka.tasks.hu05.DeleteCourse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

import static co.com.sofka.util.hu05.Dictionary.ID_TEST;
import static co.com.sofka.util.hu05.RouteFile.DATA_VALID;
import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CreateRepitingCourseStepDefinition extends SetUpHu05 {

    @When("envio todos los datos obligatorios y el dato name curso igual a uno ya creado")
    public void nameRepetingCourse() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(DATA_VALID.getValue()))
        );
        actor.attemptsTo(
                CreateCourse.withInfo(new File(DATA_VALID.getValue()))
        );

    }

    @Then("los datos no deben ser guardados en la base de datos.")
    public void el_sistema_debe_retornar_una_repuesta_exitosa_del_servidor() {
        actor.should(
                seeThat("Debe retornar el status code 400",
                        ResponseCode.was(), equalTo(SC_BAD_REQUEST))

        );
        actor.attemptsTo(
                DeleteCourse.fromPage( ID_TEST.getValue())
        );


    }

    @When("envio todos los datos obligatorios y el dato name categoria igual a uno ya creado")
    public void nameRepeatingCategory() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(DATA_VALID.getValue()))
        );
        actor.attemptsTo(
                CreateCourse.withInfo(new File(DATA_VALID.getValue()))
        );

    }
}
