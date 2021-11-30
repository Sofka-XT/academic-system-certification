package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

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

                //Scroll.to(BTN_EDITAR_PROGRAMA),
                Click.on(BTN_EDITAR_PROGRAMA),


                Enter.theValue(this.nombrePrograma).into(EDIT_NAME_PROGRAM),

                Scroll.to(SUBMIT),
                Click.on(SUBMIT),

                Scroll.to(CONFIRMAR_EDICION),
                Click.on(CONFIRMAR_EDICION)

        );
    }

    public static HU06CrudProgramaEditarSolonombre editarSolonombre(){
        return new HU06CrudProgramaEditarSolonombre();
    }

}
