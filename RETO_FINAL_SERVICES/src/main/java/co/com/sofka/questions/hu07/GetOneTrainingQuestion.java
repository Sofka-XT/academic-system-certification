package co.com.sofka.questions.hu07;

import co.com.sofka.models.hu07.getonetraining.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetOneTrainingQuestion implements Question {
    @Override
    public Response answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(Response.class);
    }
}
