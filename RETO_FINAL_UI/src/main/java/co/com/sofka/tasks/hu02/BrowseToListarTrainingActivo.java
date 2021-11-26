package co.com.sofka.tasks.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.userinterfaces.landingpage.LadingPageMain.OPCION_TRAINING_ACTIVO;


public class BrowseToListarTrainingActivo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_TRAINING_ACTIVO)
        );
    }

    public static BrowseToListarTrainingActivo browseToListarTrainingActivo() {
        return new BrowseToListarTrainingActivo();
    }
}
