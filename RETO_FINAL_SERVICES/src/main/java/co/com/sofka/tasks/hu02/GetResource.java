package co.com.sofka.tasks.hu02;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetResource implements Task {

    private final String RESOURCE = "/Training";
    private final String FILTER;

    public GetResource(String status)
    {
        this.FILTER =status;
    }

    public static Performable fromPage(String status)
    {
        return instrumented(GetResource.class,status);
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
