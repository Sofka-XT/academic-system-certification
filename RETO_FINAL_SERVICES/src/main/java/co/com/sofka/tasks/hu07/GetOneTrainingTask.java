package co.com.sofka.tasks.hu07;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.HashMap;

import static co.com.sofka.util.hu07.Dictionary.GET_ONE_TRAINING;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetOneTrainingTask implements Task {

    private String id;

    public GetOneTrainingTask (String status) {
        this.id = status;
    }

    public static Performable fromPage(String status)
    {
        return instrumented(GetOneTrainingTask.class,status);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(GET_ONE_TRAINING.getValue()+id).
                        with(requestSpecification ->
                                requestSpecification.contentType(
                                ContentType.JSON
                                )
                        )
        );
    }
}
