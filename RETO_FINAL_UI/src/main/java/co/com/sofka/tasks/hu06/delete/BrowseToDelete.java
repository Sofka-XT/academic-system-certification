package co.com.sofka.tasks.hu06.delete;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu06.HU06CrudHomePage.SUBMIT_CREATE;
import static co.com.sofka.userinterfaces.hu06.HU06CrudHomePage.SUBMIT_LIST;

public class BrowseToDelete implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SUBMIT_LIST)
        );
    }
    public static BrowseToDelete browseToDelete(){
        return new BrowseToDelete();
    }
}