package co.com.sofka.questions.hu02;

import co.com.sofka.models.hu02.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetAllTrainingQuestion implements Question {
    @Override
    public Response answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(Response.class);
    }
}
