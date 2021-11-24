package co.com.sofka.tasks.hu07;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.HashMap;

import static co.com.sofka.util.hu07.Dictionary.GET_ALL_TRAININGS;
import static co.com.sofka.util.hu07.Dictionary.GET_ONE_TRAINING;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetAllTrainingsTask implements Task {

    private HashMap<String, Object> headers = new HashMap<>();

    public static Performable fromPage(String status)
    {

        return instrumented(GetAllTrainingsTask.class,status);
    }

    public GetAllTrainingsTask withHeaders(HashMap<String, Object> headers) {
        this.headers = headers;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(GET_ALL_TRAININGS.getValue()).
                        with(requestSpecification -> requestSpecification
                                .relaxedHTTPSValidation().headers(headers)
                        )
        );
    }

    public static GetAllTrainingsTask getAllTrainingsTask(){
        return new GetAllTrainingsTask();
    }
}
