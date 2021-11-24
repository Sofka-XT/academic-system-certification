package co.com.sofka.tasks.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu02.ListarTraining.OPCION_MENU;
import static co.com.sofka.userinterfaces.hu02.ListarTraining.TARGET_TRAINING;

public class BrowseToListarTraining implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(OPCION_MENU),
                Hover.over(OPCION_MENU),
                Click.on(OPCION_MENU),

                Scroll.to(TARGET_TRAINING),
                Click.on(TARGET_TRAINING)

        );
    }

    public static BrowseToListarTraining browseToListarTraining() {
        return new BrowseToListarTraining();
    }
}
