package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.EDIT_NAME_PROGRAM;
import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.SUBMIT;

public class HU06CrudProgramaEditarTaskNoCurses implements Task {
    private String nombrePrograma;

    public HU06CrudProgramaEditarTaskNoCurses usingNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EDIT_NAME_PROGRAM),
                Enter.theValue(this.nombrePrograma).into(EDIT_NAME_PROGRAM),

                Scroll.to(SUBMIT),
                Click.on(SUBMIT)
        );

    }
}
