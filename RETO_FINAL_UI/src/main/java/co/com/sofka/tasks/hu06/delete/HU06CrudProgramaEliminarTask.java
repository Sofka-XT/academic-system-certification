package co.com.sofka.tasks.hu06.delete;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument;

import java.util.List;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.*;


public class HU06CrudProgramaEliminarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(ELIMINAR_UN_PROGRAMA),
                Click.on(ELIMINAR_UN_PROGRAMA),
                Click.on(CONFIRMAR_CAMBIOS)
        );
    }

    public static HU06CrudProgramaEliminarTask eliminarPrograma() {
        return new HU06CrudProgramaEliminarTask();
    }


}
