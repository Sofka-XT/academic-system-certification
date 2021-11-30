package co.com.sofka.questions.hu06.editarPrograma;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.NO_NAME_CHANGE;
import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.NUEVO_NOMBRE_PROGRAMA;

public class AssertToEditNoNameQuestion implements Question {
    public AssertToEditNoNameQuestion is(){
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return  (NO_NAME_CHANGE.resolveFor(actor).isVisible());
    }

    public static AssertToEditNoNameQuestion assertToEditNoNameQuestion(){
        return new AssertToEditNoNameQuestion();
    }

}
