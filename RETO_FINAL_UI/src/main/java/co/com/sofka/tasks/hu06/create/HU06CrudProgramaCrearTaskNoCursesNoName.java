package co.com.sofka.tasks.hu06.create;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.SAVE_PROGRAM;

public class HU06CrudProgramaCrearTaskNoCursesNoName implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SAVE_PROGRAM)
        );
    }
    public static HU06CrudProgramaCrearTaskNoCursesNoName createProgramWithoutCoursesOrName(){
        return new HU06CrudProgramaCrearTaskNoCursesNoName();
    }

}
