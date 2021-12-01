package co.com.sofka.tasks.hu05;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.sofka.util.hu05.Resources.GET_BY_ID;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetById implements Task {

    private String id;

    public GetById(String id) {
        this.id = id;
    }

    public static Performable fromPage(String id){
        return instrumented(GetById.class,id);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(GET_BY_ID.getValue() + id).with(requestSpecification
                -> requestSpecification.contentType(ContentType.JSON)
        )
        );
    }
}
