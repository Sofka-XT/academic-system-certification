package co.com.sofka.questions.hu05;


import co.com.sofka.models.hu05.filterId.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetCourse implements Question {
    @Override
    public Response answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(Response.class);
    }
}
