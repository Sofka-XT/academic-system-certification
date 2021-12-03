package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.SetUpHu05;
import co.com.sofka.questions.hu05.ResponseCode;
import co.com.sofka.tasks.hu05.CreateCourse;
import co.com.sofka.tasks.hu05.DeleteCourse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

import static co.com.sofka.util.hu05.Dictionary.ID_TEST;
import static co.com.sofka.util.hu05.RouteFile.AVERAGE_INVALD;
import static javax.servlet.http.HttpServletResponse.SC_ACCEPTED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DeleteCourseStepDefinition extends SetUpHu05 {


    @When("solicito eliminar un curso")
    public void solicito_la_informacion_de_un_curso() {
        setUp();
        actor.attemptsTo(
                CreateCourse.withInfo(new File(AVERAGE_INVALD.getValue()))
        );

        actor.attemptsTo(
                DeleteCourse.fromPage( ID_TEST.getValue())
        );


    }


    @Then("se eliminara de la Base de datos")
    public void el_sistema_debe_retornar_una_repuesta_exitosa_del_servidor() {
        actor.should(
                seeThat("Debe retornar el status code 202",
                        ResponseCode.was(), equalTo(SC_ACCEPTED))

        );

    }

}
