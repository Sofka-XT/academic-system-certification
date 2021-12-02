package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.SetUpHu05;
import co.com.sofka.questions.hu05.GetCourseInfo;
import co.com.sofka.questions.hu05.ResponseCode;
import co.com.sofka.tasks.hu05.CreateCourse;
import co.com.sofka.tasks.hu05.DeleteCourse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


import static co.com.sofka.util.hu05.Dictionary.ID_TEST;
import static co.com.sofka.util.hu05.RouteFile.*;
import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CreateCourseInvalidDataStepDefinition extends SetUpHu05 {
    private Boolean courseCreate;
    Logger loger = LoggerFactory.getLogger(CreateCourseInvalidDataStepDefinition.class);

    @When("envio todos los datos obligatorios y el dato average invalido")
    public void averageInvalid() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(AVERAGE_INVALD.getValue()))
        );

    }

    @Then("los datos no deben quedar guardados en la base de datos.")
    public void dateNotSave() {

        try {
            courseCreate = new GetCourseInfo().answeredBy("id").contains(ID_TEST.getValue());
            if (courseCreate) {
                actor.attemptsTo(DeleteCourse.fromPage(ID_TEST.getValue()));

            }
            actor.should(
                    seeThat("El curso se creo :  " + courseCreate,
                            act -> courseCreate, equalTo(false))
            );
        } catch (Exception e) {
            loger.info(e.toString());
        }

        actor.should(
                seeThat("Debe retornar el status code 400",
                        ResponseCode.was(), equalTo(SC_BAD_REQUEST))

        );

    }

    @When("envio todos los datos obligatorios y el dato condition invalido")
    public void conditionInvalid() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(CONDITION_INVALD.getValue()))
        );

    }

    @When("envio todos los datos obligatorios y el dato type invalido")
    public void typeInvalid() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(TYPE_INVALD.getValue()))
        );

    }

}
