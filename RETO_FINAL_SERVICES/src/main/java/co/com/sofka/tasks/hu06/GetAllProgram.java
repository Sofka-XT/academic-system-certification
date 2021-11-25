package co.com.sofka.tasks.hu06;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetAllProgram implements Task {
    public GetAllProgram() {
    }
    public static Performable page() {
        return instrumented(GetAllProgram.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/program/getAll")
        );
        }
}
