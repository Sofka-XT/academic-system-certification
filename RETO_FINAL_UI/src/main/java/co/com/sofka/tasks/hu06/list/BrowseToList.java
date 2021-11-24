package co.com.sofka.tasks.hu06.list;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.sofka.userinterfaces.hu06.HU06CrudHomePage.SUBMIT_LIST;

public class BrowseToList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SUBMIT_LIST),
                Click.on(SUBMIT_LIST)
        );
    }
    public static BrowseToList browseToList(){
        return new BrowseToList();
    }
}