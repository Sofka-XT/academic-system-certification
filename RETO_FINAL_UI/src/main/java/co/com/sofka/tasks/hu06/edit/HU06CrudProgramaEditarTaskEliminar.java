package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.*;

public class HU06CrudProgramaEditarTaskEliminar implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Scroll.to(BTN_EDITAR_PROGRAMA),
                Click.on(BTN_EDITAR_PROGRAMA),

                Scroll.to(ELIMINAR_UN_CURSO),
                Click.on(ELIMINAR_UN_CURSO),

                Click.on(CONFIRMAR_CAMBIOS2),

                Scroll.to(SUBMIT),
                Click.on(SUBMIT),

                Click.on(CONFIRMAR_CAMBIOS)


        );
    }

    public static HU06CrudProgramaEditarTaskEliminar eliminarCurso(){
        return new HU06CrudProgramaEditarTaskEliminar();
    }
}
