package co.com.sofka.tasks.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.userinterfaces.hu02.ListarTrainingPage.OPCION_MENU_COACH;

public class BrowseToListarTrainingCoach implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_MENU_COACH)
        );
    }

    public static BrowseToListarTrainingCoach browseToListarTrainingCoach() {
        return new BrowseToListarTrainingCoach();
    }
}
