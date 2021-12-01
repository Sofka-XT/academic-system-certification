package co.com.sofka.questions.hu06.delete;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.EXISTE_PROGRAMA;

public class AssertToDeleteQuestions implements Question {
    public AssertToDeleteQuestions is(){
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return  (EXISTE_PROGRAMA.resolveFor(actor).isVisible());
    }

    public static AssertToDeleteQuestions assertToDeleteQuestions(){
        return new AssertToDeleteQuestions();
    }

}
