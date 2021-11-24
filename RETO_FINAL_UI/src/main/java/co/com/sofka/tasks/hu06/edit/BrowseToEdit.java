package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.BTN_EDITAR_PROGRAMA;

public class BrowseToEdit implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_EDITAR_PROGRAMA),
                Click.on(BTN_EDITAR_PROGRAMA)
        );

    }
}
