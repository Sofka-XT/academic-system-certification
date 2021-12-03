package co.com.sofka.questions.hu06;

import co.com.sofka.models.hu06.Programa;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetProgramaById  implements Question {
    @Override
    public Programa answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(Programa.class);
    }
}
