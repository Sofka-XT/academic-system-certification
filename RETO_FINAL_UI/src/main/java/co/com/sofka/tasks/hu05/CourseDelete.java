package co.com.sofka.tasks.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu005.CourseDelete.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CourseDelete implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(SEE_COURSE, isVisible()).forNoMoreThan(12).seconds(),
                Scroll.to(SEE_COURSE),
                DoubleClick.on(SEE_COURSE),

                Click.on(JAVA_BOTTON),

                Click.on(DELETE_BOTTON),
                Click.on(CONFIRM_BOTTON)






        );

    }

    public static CourseDelete DeleteCourseForm() {
        return new CourseDelete();
    }
}
