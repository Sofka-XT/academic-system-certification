package co.com.sofka.tasks.hu06.delete;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.ELIMINAR_UN_PROGRAMA;


public class HU06CrudProgramaEliminarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ELIMINAR_UN_PROGRAMA),
                Click.on(ELIMINAR_UN_PROGRAMA)
        );
    }

    public static HU06CrudProgramaEliminarTask eliminarPrograma(){
        return new HU06CrudProgramaEliminarTask();
    }

}
