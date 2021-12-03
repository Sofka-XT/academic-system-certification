package co.com.sofka.tasks.hu05;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static co.com.sofka.util.hu05.Resources.DELETE_COURSE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteCourse implements Task {
    private final String id;

    public DeleteCourse(String id) {
        this.id = id;
    }

    public static Performable fromPage(String id) {
        return instrumented(DeleteCourse.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(DELETE_COURSE.getValue() + id).with(
                        requestSpecification ->
                                requestSpecification.
                                        contentType(ContentType.JSON)
                )
        );
    }
}