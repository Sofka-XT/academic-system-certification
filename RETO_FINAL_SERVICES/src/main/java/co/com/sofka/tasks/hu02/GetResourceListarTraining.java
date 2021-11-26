package co.com.sofka.tasks.hu02;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetResourceListarTraining implements Task {

    private final String RESOURCE = "/training";
    private final String FILTER;

    public GetResourceListarTraining(String status)
    {
        this.FILTER =status;
    }

    public static Performable fromPage(String status)
    {
        return instrumented(GetResourceListarTraining.class,status);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(RESOURCE + FILTER).
                        with(requestSpecification ->
                                requestSpecification.contentType(ContentType.JSON))
        );
    }
}
