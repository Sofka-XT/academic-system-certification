package co.com.sofka.questions.hu06.createprogram;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.MESSAGE_ERROR;
import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.MESSAGE_VALIDATION;

public class ProgramErrorMessage implements Question<Boolean> {

    public ProgramErrorMessage is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  (MESSAGE_ERROR.resolveFor(actor).isVisible());
    }

    public static ProgramErrorMessage programErrorMessage(){
        return new ProgramErrorMessage();
    }
}
