package co.com.sofka.tasks.hu06;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.userinterfaces.hu06.HU06CrudHomePage.SUBMIT_LIST;

public class BrowseToList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SUBMIT_LIST)
        );
    }
    public static BrowseToList browseToList(){
        return new BrowseToList();
    }
}