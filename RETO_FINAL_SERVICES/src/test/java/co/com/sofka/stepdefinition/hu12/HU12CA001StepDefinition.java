package co.com.sofka.stepdefinition.hu12;

import co.com.sofka.models.hu06.HU06CA003Modelo;
import co.com.sofka.models.hu12.CreateTrainingForProfile;
import co.com.sofka.models.hu12.ProfileModel;
import co.com.sofka.questions.hu12.GetProfileById;
import co.com.sofka.questions.hu12.ResponseCode;
import co.com.sofka.setup.services.hu06.Hu06;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.hu06.DeleteProgram.deleteProgram;
import static co.com.sofka.tasks.hu06.PostSendProgram.postSendProgram;
import static co.com.sofka.tasks.hu12.DeleteTraining.deleteTraining;
import static co.com.sofka.tasks.hu12.GetOneProfile.getOneProfile;
import static co.com.sofka.tasks.hu12.PostTrainingForProfile.postTrainingForProfile;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.equalTo;


public class HU12CA001StepDefinition extends Hu06 {

    private HU06CA003Modelo modelo = new HU06CA003Modelo();
    private CreateTrainingForProfile perfil = new CreateTrainingForProfile();
    private ProfileModel perfilRecibido;
    @Given("que el coach asigna aprendices a un training")
    public void queElCoachAsignaAprendicesAUnTraining() {
        setUp();
        modelo.setIdPrograma("yyyy");
        modelo.setNombrePrograma("yyyy");
        modelo.setIdCurso("test1");
        modelo.setNombreCurso("test1");
        modelo.setIdCategoria("test1");
        modelo.setNombreCategoria("test1");
        modelo.setDiasCategoria(1);

        actor.attemptsTo(
                postSendProgram()
                        .usingUpdateInfo(
                                modelo.getFullJson()
                        )
        );
    }


    @When("cuando el coach crea el training")
    public void cuandoElCoachCreaElTraining() {
        perfil.setIdProfile("666");
        perfil.setNameProfile("Testprueba"+Math.round(Math.random()*100));
        perfil.setNumberProfile("66666666");
        perfil.setEmailProfile("David@gmail.com");
        actor.attemptsTo(
                postTrainingForProfile()
                        .usingUpdateInfo(
                                perfil.getFullJson()
                        )
        );
    }


    @Then("se deben crear exitosamente los perfiles de los aprendices")
    public void seDebenCrearExitosamenteLosPerfilesDeLosAprendices() {
        actor.attemptsTo(
                getOneProfile()
                        .usingIdProfile(perfil.getEmailProfile())
        );


        perfilRecibido = new GetProfileById().answeredBy(actor);

        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_OK))
        );

        actor.should(
                seeThat("El nombre debe coincidir",act ->perfilRecibido.getApprenticeName(),equalTo(perfil.getNameProfile()))
        );



        actor.attemptsTo(
                deleteTraining()
                        .usingIdTrainingDelete("Testprueba")
        );


        actor.attemptsTo(
                deleteProgram()
                        .usingIdProgramaDelete(modelo.getIdPrograma())
        );




    }

}
