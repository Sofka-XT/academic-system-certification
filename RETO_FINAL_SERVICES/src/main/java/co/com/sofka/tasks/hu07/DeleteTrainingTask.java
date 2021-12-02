package co.com.sofka.tasks.hu07;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static co.com.sofka.util.hu07.Dictionary.DELETE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteTrainingTask implements Task {
    private final String id;

    public DeleteTrainingTask(String id)
    {
        this.id=id;
    }

    public static Performable fromPage(String id)
    {
        return instrumented(DeleteTrainingTask.class,id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(DELETE.getValue()+id).with(
                        requestSpecification ->
                                requestSpecification.
                                        contentType(ContentType.JSON)
                )
        );
    }
}
