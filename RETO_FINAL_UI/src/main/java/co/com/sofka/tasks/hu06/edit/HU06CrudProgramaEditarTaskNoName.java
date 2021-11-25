package co.com.sofka.tasks.hu06.edit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu06.edit.HU06CrudProgramaEditar.*;

public class HU06CrudProgramaEditarTaskNoName implements Task {
    private String duracionCurso1;
    private String duracionCurso2;

    public HU06CrudProgramaEditarTaskNoName usingDuracionCurso1(String duracionCurso1) {
        this.duracionCurso1 = duracionCurso1;
        return this;
    }

    public HU06CrudProgramaEditarTaskNoName usingDurationCurso2(String duracionCurso2) {
        this.duracionCurso2 = duracionCurso2;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(DESPLEGAR_LISTA_CURSOS),
                Click.on(DESPLEGAR_LISTA_CURSOS),

                Scroll.to(SELECTION_A_CURSE),
                Click.on(SELECTION_A_CURSE),

                Scroll.to(AGREGAR_A_CURSO),
                Click.on(AGREGAR_A_CURSO),

                Scroll.to(DURACION_CATEGORIA1_CUrSO),
                Enter.theValue(this.duracionCurso1).into(DURACION_CATEGORIA1_CUrSO),

                Scroll.to(DURACION_CATEGORIA2_CUrSO),
                Enter.theValue(this.duracionCurso2).into(DURACION_CATEGORIA2_CUrSO),

                Scroll.to(SUBMIT),
                Click.on(SUBMIT)
                );
    }

    public static HU06CrudProgramaEditarTaskNoName editarProgramaAgregandoCursos(){
        return new HU06CrudProgramaEditarTaskNoName();
    }
}
