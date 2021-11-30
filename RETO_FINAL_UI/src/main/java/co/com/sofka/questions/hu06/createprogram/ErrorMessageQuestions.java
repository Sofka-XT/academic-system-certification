package co.com.sofka.questions.hu06.createprogram;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.MESSAGE_ERROR;

public class ErrorMessageQuestions implements Question {
    public ErrorMessageQuestions is(){
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return  (MESSAGE_ERROR.resolveFor(actor).isVisible());
    }

    public static ErrorMessageQuestions errorMessageQuestions(){
        return new ErrorMessageQuestions();
    }

}
