package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.*;

public class HU06CrudProgramaOk implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(CONFIRMAR_CAMBIOS),
                Click.on(CONFIRMAR_CAMBIOS)
        );
    }

    public static HU06CrudProgramaOk ok(){
        return new HU06CrudProgramaOk();
    }

}
