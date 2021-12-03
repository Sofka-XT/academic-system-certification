package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.SetUpHu05;
import co.com.sofka.questions.hu05.ResponseCode;
import co.com.sofka.tasks.hu05.CreateCourse;
import co.com.sofka.tasks.hu05.DeleteCourse;
import co.com.sofka.tasks.hu05.UpdateCourse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

import static co.com.sofka.util.hu05.Dictionary.ID_TEST;
import static co.com.sofka.util.hu05.RouteFile.DATA_VALID;
import static co.com.sofka.util.hu05.RouteFile.EDIT_DATA;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class UpdateCourseStepDefinition extends SetUpHu05 {

    @When("envio todos los datos de un curso para editar")
    public void editDate() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(DATA_VALID.getValue()))
        );
        actor.attemptsTo(
                UpdateCourse.fromPage(new File(EDIT_DATA.getValue()))
        );

    }

    @Then("se debe guardar en la Base de datos")
    public void result() {
        actor.should(
                seeThat("Debe retornar el status code 200",
                        ResponseCode.was(), equalTo(SC_OK))

        );
        actor.attemptsTo(DeleteCourse.fromPage(ID_TEST.getValue()));

    }
}
