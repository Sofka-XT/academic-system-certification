package co.com.sofka.stepdefinition.hu06;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HU06CA001StepDefinition extends Setup {
    @Given("El coach se encuentra en la ruta de creación de programa")
    public void elCoachSeEncuentraEnLaRutaDeCreacionDePrograma() {
    }

    @When("El mentor ingresa el nombre del programa y escoge un curso o los cursos necesarios para el programa")
    public void elMentorIngresaElNombreDelProgramaYEscogeUnCursoOLosCursosNecesariosParaElPrograma() {
    }

    @Then("Se creará exitosamente el programa y se debe notificar.")
    public void seCrearaExitosamenteElProgramaYSeDebeNotificar() {
    }

    @When("El mentor no ingresa el nombre del programa y no selecciona ningún curso")
    public void elMentorNoIngresaElNombreDelProgramaYNoSeleccionaNingunCurso() {
    }

    @Then("Se debe notificar que no es posible crear el programa.")
    public void seDebeNotificarQueNoEsPosibleCrearElPrograma() {
    }

    @When("El mentor no ingresa el nombre del programa y selecciona un curso")
    public void elMentorNoIngresaElNombreDelProgramaYSeleccionaUnCurso() {
    }

    @Then("Se debe notificar que no es posible crear el programa sin el que suministre el nombre.")
    public void seDebeNotificarQueNoEsPosibleCrearElProgramaSinElQueSuministreElNombre() {
    }

    @When("El mentor ingresa el nombre del programa y no selecciona ningún curso")
    public void elMentorIngresaElNombreDelProgramaYNoSeleccionaNingunCurso() {
    }

    @Then("Se debe notificar que no es posible crear el programa sin el asignar al menos un curso.")
    public void seDebeNotificarQueNoEsPosibleCrearElProgramaSinElAsignarAlMenosUnCurso() {
    }
}
