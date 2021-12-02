package co.com.sofka.tasks.hu05;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.io.File;

import static co.com.sofka.util.hu05.Resources.CREATE_COURSE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateCourse implements Task {

    private final File infoNewCourse;

    public CreateCourse(File infoCourse) {
        this.infoNewCourse = infoCourse;
    }

    public static Performable withInfo(File infoCourse) {
        return instrumented(CreateCourse.class, infoCourse);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(CREATE_COURSE.getValue()).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(infoNewCourse)
                )
        );
    }
}

