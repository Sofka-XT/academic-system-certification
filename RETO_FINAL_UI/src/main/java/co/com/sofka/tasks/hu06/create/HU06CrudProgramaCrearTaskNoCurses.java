package co.com.sofka.tasks.hu06.create;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu06.create.HU06CrudProgramaCrear.*;

public class HU06CrudProgramaCrearTaskNoCurses implements Task {
    private String nameProgram;

    public HU06CrudProgramaCrearTaskNoCurses usingNameProgram(String nameProgram) {
        this.nameProgram = nameProgram;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PROGRAM_NAME),
                Enter.theValue(nameProgram).into(PROGRAM_NAME),
                Click.on(SAVE_PROGRAM)
        );
    }
    public static HU06CrudProgramaCrearTaskNoCurses createProgramWithoutCourses(){
        return new HU06CrudProgramaCrearTaskNoCurses();
    }

}
