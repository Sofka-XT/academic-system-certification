package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.ELIMINAR_UN_CURSO;

public class HU06CrudProgramaEditarTaskEliminar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ELIMINAR_UN_CURSO),
                Click.on(ELIMINAR_UN_CURSO)
        );
    }
}
