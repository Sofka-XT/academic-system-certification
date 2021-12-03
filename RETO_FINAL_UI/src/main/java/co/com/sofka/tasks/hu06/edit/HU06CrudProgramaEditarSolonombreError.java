package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.*;

public class HU06CrudProgramaEditarSolonombreError implements Task {
    private String nombrePrograma;

    public HU06CrudProgramaEditarSolonombreError setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(BTN_EDITAR_PROGRAMA),
                Click.on(BTN_EDITAR_PROGRAMA),


                Enter.theValue(this.nombrePrograma).into(EDIT_NAME_PROGRAM),

                Hit.the(Keys.ENTER).into(EDIT_NAME_PROGRAM)

               // Scroll.to(SUBMIT),
               // Click.on(SUBMIT)
        );
    }

    public static HU06CrudProgramaEditarSolonombreError editarSolonombreError(){
        return new HU06CrudProgramaEditarSolonombreError();
    }

}
