package co.com.sofka.tasks.hu07;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.sofka.util.hu07.Dictionary.GET_ALL_TRAININGS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetAllTrainingsTask implements Task {

    public static Performable fromPage(String status)
    {

        return instrumented(GetAllTrainingsTask.class,status);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(GET_ALL_TRAININGS.getValue()).
                        with(requestSpecification -> requestSpecification.
                                contentType(ContentType.JSON))
        );
    }
}
