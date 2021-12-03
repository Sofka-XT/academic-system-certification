package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.*;

public class HU06CrudProgramaEditarTask implements Task {
    private String nombrePrograma;
    private String duracionCurso1;
    private String duracionCurso2;

    public HU06CrudProgramaEditarTask usingNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
        return this;
    }

    public HU06CrudProgramaEditarTask usingDuracionCurso1(String duracionCurso1) {
        this.duracionCurso1 = duracionCurso1;
        return this;
    }

    public HU06CrudProgramaEditarTask usingDurationCurso2(String duracionCurso2) {
        this.duracionCurso2 = duracionCurso2;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

//                Click.on(BTN_EDITAR_PROGRAMA),
//
//                Enter.theValue(this.nombrePrograma).into(EDIT_NAME_PROGRAM),
//

//
//                Scroll.to(SUBMIT),
//                Click.on(SUBMIT),
//
//                Scroll.to(CONFIRMAR_CAMBIOS),
//                Click.on(CONFIRMAR_CAMBIOS)

                //////
                Scroll.to(BTN_EDITAR_PROGRAMA),
                Click.on(BTN_EDITAR_PROGRAMA),
//
                Enter.theValue(this.nombrePrograma).into(EDIT_NAME_PROGRAM),
                Enter.theValue(this.duracionCurso1).into(DURACION_CATEGORIA1_CUrSO),


                Scroll.to(DESPLEGAR_LISTA_CURSOS),
                Click.on(DESPLEGAR_LISTA_CURSOS),

                Scroll.to(SELECTION_A_CURSE),
                Click.on(SELECTION_A_CURSE),

                Scroll.to(AGREGAR_A_CURSO),
                Click.on(AGREGAR_A_CURSO),

               // Hit.the(Keys.TAB).into(AGREGAR_A_CURSO),

                Hit.the(Keys.ENTER).into(EDIT_NAME_PROGRAM),

               // Scroll.to(SUBMIT),
               // Click.on(SUBMIT),

                Scroll.to(CONFIRMAR_CAMBIOS),
                Click.on(CONFIRMAR_CAMBIOS)


                );
    }

    public static HU06CrudProgramaEditarTask editarProgramaCompleto(){
        return new HU06CrudProgramaEditarTask();
    }


}
