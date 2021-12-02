package co.com.sofka.tasks.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu005.CourseInfo.COURSE_NAME;

public class CourseDescription implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(COURSE_NAME),
                Click.on(COURSE_NAME)

        );

    }
    public static CourseDescription courseDescription() {
        return new CourseDescription();
    }
}
