package co.com.sofka.questions.hu12;

import co.com.sofka.models.hu12.ProfileModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetProfileById implements Question {
    @Override
    public ProfileModel answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ProfileModel.class);
    }
}
