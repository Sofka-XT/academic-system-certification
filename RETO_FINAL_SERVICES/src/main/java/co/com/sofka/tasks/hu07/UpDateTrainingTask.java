package co.com.sofka.tasks.hu07;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static co.com.sofka.util.hu07.Dictionary.UPDATE_TRAINING;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class UpDateTrainingTask implements Task {

    private final String trainingInfo;

    public UpDateTrainingTask(String trainingInfo)
    {
        this.trainingInfo =trainingInfo;
    }

    public static Performable fromPage(String trainingInfo)
    {
        return instrumented(UpDateTrainingTask.class,trainingInfo);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to(UPDATE_TRAINING.getValue()).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(trainingInfo)
                )
        );
    }
}
