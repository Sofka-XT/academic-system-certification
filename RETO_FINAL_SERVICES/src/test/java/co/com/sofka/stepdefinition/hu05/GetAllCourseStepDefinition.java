package co.com.sofka.stepdefinition.hu05;

import co.com.sofka.SetUpHu05;
import co.com.sofka.questions.hu05.GetCourseInfo;
import co.com.sofka.questions.hu05.ResponseCode;
import co.com.sofka.tasks.hu05.GetAllResource;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.util.hu05.Resources.GET_ALL_COURSE;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GetAllCourseStepDefinition extends SetUpHu05 {

    @Given("que tengo acceso a la API")
    public void que_tengo_acceso_a_la_API() {
        setUp();
    }

    @When("solicito la informacion de un curso")
    public void solicito_la_informacion_de_un_curso() {
        actor.attemptsTo(
                GetAllResource.fromPage(GET_ALL_COURSE.getValue())
        );
    }

    @Then("el servidor debe retornar una repuesta exitosa.")
    public void el_sistema_debe_retornar_una_repuesta_exitosa_del_servidor() {
        actor.should((
                seeThat("El status code de respuesta debe ser 200" , ResponseCode.was(),
                        equalTo(SC_OK)
                )
                ));

        actor.should(
                seeThat("El id se encuentra en la lista",
                        act -> new GetCourseInfo().answeredBy("categories.rules").contains("DANGER"),
                        equalTo(true))
        );






    }

}
