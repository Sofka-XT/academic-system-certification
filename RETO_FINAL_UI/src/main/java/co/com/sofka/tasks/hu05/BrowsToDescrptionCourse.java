package co.com.sofka.tasks.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu005.CourseInfo.HEADER_NAME_CURSO;
import static co.com.sofka.userinterfaces.hu005.CourseInfo.OK_BOTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class BrowsToDescrptionCourse implements Task {
     private String assercionNameCourse;



     public BrowsToDescrptionCourse andUsingAserssionKeyword(String assercionNameCourse) {
        this.assercionNameCourse = assercionNameCourse;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(OK_BOTTON, isVisible()).forNoMoreThan(3).seconds(),
                Scroll.to(OK_BOTTON),
                Click.on(OK_BOTTON),

                Scroll.to(HEADER_NAME_CURSO)


           );


    }

    public static BrowsToDescrptionCourse searchUserPracticeForm(){
        return new BrowsToDescrptionCourse();
    }
}
