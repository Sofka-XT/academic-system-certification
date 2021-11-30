package co.com.sofka.questions.hu06.createprogram;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.MESSAGE_ERROR;
import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.PROGRAM_NAME;

public class ErrorMessageQuestionsTwo implements Question {
    public ErrorMessageQuestionsTwo is(){
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return  (PROGRAM_NAME.resolveFor(actor).isVisible());
    }

    public static ErrorMessageQuestionsTwo errorMessageQuestionsTwo(){
        return new ErrorMessageQuestionsTwo();
    }

}
