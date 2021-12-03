package co.com.sofka.tasks.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.userinterfaces.hu02.ListarTrainingPage.OPCION_MENU_APRENDIZ;

public class BrowseToListarTrainingAprendiz implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_MENU_APRENDIZ)
        );
    }

    public static BrowseToListarTrainingAprendiz browseToListarTrainingAprendiz() {
        return new BrowseToListarTrainingAprendiz();
    }
}
