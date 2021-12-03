package co.com.sofka.stepdefinition.hu02;

import co.com.sofka.exceptions.hu02.ValidationNotEquals;
import co.com.sofka.models.hu02.Program;
import co.com.sofka.models.hu02.TrainingItem;
import co.com.sofka.tasks.hu02.GetResource;
import co.com.sofka.tasks.hu02.GetResourceListarTraining;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

import static co.com.sofka.exceptions.hu02.ValidationNotEquals.VALIDATION_IS_NOT_EQUALS;
import static co.com.sofka.questions.hu02.ReturnStringValue.systemValue;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

public class ListarTrainingStepDefinition extends Setup {

    private static final Gson gson = new Gson();
    protected TrainingItem trainingItem;

    protected final  String RESOURCE_TRAINING = "/Training";
    protected final  String RESOURCE_PROGRAM = "/program";
    protected Program program;
    protected static final String RESOURCE_TRAINING_ID = "/61aa23ac4d2f294fb4dd3fe2";
    protected static final String RESOURCE_LISTAR_TRAINING = "/list-actives";

    protected static final String RESOURCE_PROGRAM_ID = "/61a133e4fb95976275096463";
    protected static final String RESOURCE_LISTAR_PROGRAMS = "/get";

    protected static final String ASSERTION_TRAINING_ID = "61aa23ac4d2f294fb4dd3fe2";
    protected static final String ASSERTION_TRAINING_NAME = "Training para qa";
    protected static String ASSERTION_LISTAR_TRAINING = "";


    protected static final String ASSERTION_PROGRAM_ID = "61a133e4fb95976275096463";
    protected static final String ASSERTION_PROGRAM_NAME = "Desarrollo de software 2021";

    private static final Type typeListaTrainingActivos =
            new TypeToken<List<TrainingItem>>() {    }.getType();


    @Given("que el aprendiz desea consultar un training activo en la lista de training activos")
    public void queElAprendizDeseaConsultarUnTrainingActivoEnLaListaDeTrainingActivos() {
        setUp();
    }

    @When("el aprendiz consulta el training training activo")
    public void elAprendizConsultaElTrainingTrainingActivo() {
        actor.attemptsTo(
                GetResource.fromPage(RESOURCE_TRAINING_ID,RESOURCE_TRAINING)
        );
        trainingItem = gson.fromJson(fromLastResponseBy(actor), TrainingItem.class);
    }

    @Then("el sistema deberia mostrar el training activo esperado")
    public void elSistemaDeberiaMostrarElTrainingActivoEsperado() {
        actor.should(
                seeThatResponse(
                        "El código de respuesta HTTP debe ser: " + SC_OK,
                        response -> response.statusCode(SC_OK)
                ),
                seeThat("El training encontrado con el id proporcionado fue",
                        act -> trainingItem.getTrainingId(),
                        equalTo(ASSERTION_TRAINING_ID)),
                seeThat("El training encontrado con el id proporcionado tiene el nombre: ",
                        act -> trainingItem.getName(),
                        equalTo(ASSERTION_TRAINING_NAME))
        );
    }



    @Given("que el coach desea consultar la lista de training activos")
    public void queElCoachDeseaConsultarLaListaDeTrainingActivos() {
        setUp();
    }

    @When("el coach consulta los training activos")
    public void elCoachConsultaLosTrainingActivos() {
        actor.attemptsTo(
                GetResourceListarTraining.fromPage(RESOURCE_LISTAR_TRAINING)
        );

        actor.should(
                seeThatResponse(
                        "El código de respuesta HTTP debe ser: " + SC_OK,
                        response -> response.statusCode(SC_OK)
                )
        );

        ASSERTION_LISTAR_TRAINING = ""+gson.fromJson(fromLastResponseBy(actor), typeListaTrainingActivos);

    }

    @Then("el sistema deberia mostrar todos los training activos")
    public void elSistemaDeberiaMostrarTodosLosTrainingActivos() {
        actor.should(
                seeThat(
                        "El resultado de la consulta del training debe ser: ",
                        systemValue(ASSERTION_LISTAR_TRAINING),
                        containsString(ASSERTION_TRAINING_NAME)
                )
                        .orComplainWith(
                                ValidationNotEquals.class,
                                String.format(VALIDATION_IS_NOT_EQUALS, ASSERTION_LISTAR_TRAINING)
                        )
        );
    }

    @Given("que el usuario desea consultar el programa asociado al training activo")
    public void queElUsuarioDeseaConsultarElProgramaAsociadoAlTrainingActivo() {
        setUp();

    }

    @When("el usuario consulta con el id del programa asociado al training activo")
    public void elUsuarioConsultaConElIdDelProgramaAsociadoAlTrainingActivo() {

        actor.attemptsTo(
                GetResource.fromPage(RESOURCE_LISTAR_PROGRAMS + RESOURCE_PROGRAM_ID, RESOURCE_PROGRAM)

        );
        program = gson.fromJson(fromLastResponseBy(actor), Program.class);
    }



    @Then("el sistema deberia mostrar el programa asociado al training activo")
    public void elSistemaDeberiaMostrarElProgramaAsociadoAlTrainingActivo() {

        actor.should(
                seeThatResponse(
                        "El código de respuesta HTTP debe ser: " + SC_OK,
                        response -> response.statusCode(SC_OK)
                ),
                seeThat("El programa encontrado con el id proporcionado fue",
                        act -> program.getId(),
                        equalTo(ASSERTION_PROGRAM_ID)),
                seeThat("El programa encontrado con el id proporcionado tiene el nombre: ",
                        act -> program.getName(),
                        equalTo(ASSERTION_PROGRAM_NAME))
        );

    }
}
