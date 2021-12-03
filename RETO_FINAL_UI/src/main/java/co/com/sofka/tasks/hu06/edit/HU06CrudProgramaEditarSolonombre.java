package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.PROGRAM_NAME;
import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.*;

public class HU06CrudProgramaEditarSolonombre implements Task {
    private String nombrePrograma;

    public HU06CrudProgramaEditarSolonombre setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(BTN_EDITAR_PROGRAMA),
                Click.on(BTN_EDITAR_PROGRAMA),


                Enter.theValue(this.nombrePrograma).into(EDIT_NAME_PROGRAM),

                Hit.the(Keys.ENTER).into(EDIT_NAME_PROGRAM),


                //Scroll.to(SUBMIT),
                //Click.on(SUBMIT),


               // Scroll.to(CONFIRMAR_CAMBIOS),
                Click.on(CONFIRMAR_CAMBIOS)

        );
    }

    public static HU06CrudProgramaEditarSolonombre editarSolonombre(){
        return new HU06CrudProgramaEditarSolonombre();
    }

}
