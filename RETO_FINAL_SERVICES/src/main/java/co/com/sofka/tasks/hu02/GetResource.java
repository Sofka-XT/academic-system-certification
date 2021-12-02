package co.com.sofka.tasks.hu02;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetResource implements Task {

    private  String RESOURCE = "/Training";
    private final String FILTER;

    public GetResource(String status, String resource)
    {
        this.FILTER =status;
        this.RESOURCE = resource;
    }

    public static Performable fromPage(String status, String resource)
    {
        return instrumented(GetResource.class,status,resource);
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
