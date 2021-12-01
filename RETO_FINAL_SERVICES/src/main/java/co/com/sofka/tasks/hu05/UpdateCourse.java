package co.com.sofka.tasks.hu05;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.io.File;

import static co.com.sofka.util.hu05.Resources.UPDATE_COURSE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdateCourse implements Task {

    private final File course;

    public UpdateCourse(File course)
    {
        this.course =course;
    }

    public static Performable fromPage(File course)
    {
        return instrumented(UpdateCourse.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to(UPDATE_COURSE.getValue()).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(course)
                )
        );
    }
}