package co.com.sofka.stepdefinition.hu12;

import co.com.sofka.models.hu06.HU06CA003Modelo;
import co.com.sofka.models.hu12.CreateTrainingForProfile;
import co.com.sofka.setup.services.hu06.Hu06;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.bcel.generic.NEW;
import org.apache.xmlbeans.soap.SOAPArrayType;

import static co.com.sofka.tasks.hu06.PostSendProgram.postSendProgram;
import static co.com.sofka.tasks.hu12.PostTrainingForProfile.postTrainingForProfile;

public class HU12CA001StepDefinition extends Hu06 {

    private HU06CA003Modelo modelo = new HU06CA003Modelo();
    private CreateTrainingForProfile perfil = new CreateTrainingForProfile();

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
        System.out.println(modelo.getFullJson());
    }


    @When("cuando el coach crea el training")
    public void cuandoElCoachCreaElTraining() {
        perfil.setIdProfile("666");
        perfil.setNameProfile("Testprueba");
        perfil.setNumberProfile("66666666");
        perfil.setEmailProfile("David@gmail.com");
        System.out.println(perfil.getFullJson());
        actor.attemptsTo(
                postTrainingForProfile()
                        .usingUpdateInfo(
                                perfil.getFullJson()
                        )
        );
    }


    @Then("se deben crear exitosamente los perfiles de los aprendices")
    public void seDebenCrearExitosamenteLosPerfilesDeLosAprendices() {

    }

}
