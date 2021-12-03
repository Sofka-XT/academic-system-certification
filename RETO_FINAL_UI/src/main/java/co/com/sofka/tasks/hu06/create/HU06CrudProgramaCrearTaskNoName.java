package co.com.sofka.tasks.hu06.create;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.*;

public class HU06CrudProgramaCrearTaskNoName implements Task {
    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PROGRAM_NAME),
                Click.on("//*[@id=\"container_dashboard\"]/div/form/div/select/option[2]"), //Depende como se organiza los cursos para seleccionar uno
                Click.on("//*[@id=\"container_dashboard\"]/div/form/div/button"),
                Scroll.to(SAVE_PROGRAM),
                Click.on(SAVE_PROGRAM)
        );
    }
    public static HU06CrudProgramaCrearTaskNoName createProgramNoName(){
        return new HU06CrudProgramaCrearTaskNoName();
    }

}
