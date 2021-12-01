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

public class CreateCourseInvalidStepDefinition extends SetUpHu05 {
    private Boolean courseCreate;
    Logger loger = LoggerFactory.getLogger(CreateCourseInvalidStepDefinition.class);

    @When("envio todos los datos vacio")
    public void dataEmpty() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(DATA_EMPTY.getValue()))
        );

    }

    @Then("no se debe guardar el la Base de datos")
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

    @When("envio algunos datos vacios")
    public void someEmptyData() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(SOME_EMPTY_FIELDS.getValue()))
        );

    }

    @When("envio todos los datos invalidos")
    public void invalidData() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(DATA_NOT_VALID.getValue()))
        );

    }


}
