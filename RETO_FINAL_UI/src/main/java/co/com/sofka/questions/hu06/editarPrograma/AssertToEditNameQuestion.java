package co.com.sofka.questions.hu06.editarPrograma;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.EXISTE_PROGRAMA;
import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.NUEVO_NOMBRE_PROGRAMA;

public class AssertToEditNameQuestion implements Question {
    public AssertToEditNameQuestion is(){
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return  (NUEVO_NOMBRE_PROGRAMA.resolveFor(actor).isPresent());
    }

    public static AssertToEditNameQuestion assertToEditNameQuestion(){
        return new AssertToEditNameQuestion();
    }

}
