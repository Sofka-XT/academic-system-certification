package co.com.sofka.tasks.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu005.CourseInfo.COURSE_CREATE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillCourseForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(COURSE_CREATE, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(COURSE_CREATE),
                Click.on(COURSE_CREATE)

        );

    }

    public static FillCourseForm fillCourseForm() {
        return new FillCourseForm();
    }
}
