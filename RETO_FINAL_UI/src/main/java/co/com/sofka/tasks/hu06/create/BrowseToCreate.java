package co.com.sofka.tasks.hu06.create;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.sofka.userinterfaces.hu06.HU06CrudHomePage.*;

public class BrowseToCreate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SUBMIT_CREATE),
                Click.on(SUBMIT_CREATE)
        );
    }
    public static BrowseToCreate browseToCreate(){
        return new BrowseToCreate();
    }
}