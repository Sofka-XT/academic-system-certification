package co.com.sofka.tasks.hu07;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.sofka.util.hu07.Dictionary.CREATE_TRAINING;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateTrainingTask implements Task {

    private final String trainginInfo;

    public CreateTrainingTask(String trainginInfo)
    {
        this.trainginInfo=trainginInfo;
    }

    public static Performable withInfo(String trainingInfo)
    {
        return instrumented(CreateTrainingTask.class,trainingInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(CREATE_TRAINING.getValue()).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(trainginInfo)
                )
        );
    }
}
