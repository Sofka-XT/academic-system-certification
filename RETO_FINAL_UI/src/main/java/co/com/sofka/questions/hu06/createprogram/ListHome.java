package co.com.sofka.questions.hu06.createprogram;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.LIST_HOME;
import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.MESSAGE_VALIDATION;

public class ListHome implements Question<Boolean> {

    public ListHome is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  (LIST_HOME.resolveFor(actor).isVisible());
    }

    public static ListHome listHome(){
        return new ListHome();
    }
}
