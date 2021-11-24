package co.com.sofka.questions.hu06.createprogram;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.MESSAGE_VALIDATION;

public class PragramCreationMessage implements Question<Boolean> {

    public PragramCreationMessage is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  (MESSAGE_VALIDATION.resolveFor(actor).isVisible());
    }

    public static PragramCreationMessage programCreationMessage(){
        return new PragramCreationMessage();
    }
}
