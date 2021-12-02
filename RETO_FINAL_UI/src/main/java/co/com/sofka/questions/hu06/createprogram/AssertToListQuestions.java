package co.com.sofka.questions.hu06.createprogram;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.MESSAGE_VALIDATION;
import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.EXISTE_PROGRAMA;

public class AssertToListQuestions implements Question {
    public AssertToListQuestions is(){
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return  (MESSAGE_VALIDATION.resolveFor(actor).isVisible());
    }

    public static AssertToListQuestions assertToListQuestions(){
        return new AssertToListQuestions();
    }

}
