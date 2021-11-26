package co.com.sofka.tasks.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu02.ListarTrainingPage.OPCION_MENU_APRENDIZ;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BrowseToListarTraining implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_MENU_APRENDIZ, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(OPCION_MENU_APRENDIZ),
                Hover.over(OPCION_MENU_APRENDIZ),
                Click.on(OPCION_MENU_APRENDIZ)

                //Scroll.to(TARGET_TRAINING),
                //Click.on(TARGET_TRAINING)
        );
    }

    public static BrowseToListarTraining browseToListarTraining() {
        return new BrowseToListarTraining();
    }
}
