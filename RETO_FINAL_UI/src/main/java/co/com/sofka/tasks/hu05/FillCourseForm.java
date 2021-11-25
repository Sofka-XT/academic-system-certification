package co.com.sofka.tasks.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.sofka.userinterfaces.hu005.CourseInfo.*;


public class FillCourseForm implements Task {
    private String nameCourse;
    private String nameCategory;
    private String porcentage;
    private String type;
    private String condition;
    private String feedBackName;


    public FillCourseForm usingNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
        return this;
    }

    public FillCourseForm usingNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
        return this;
    }

    public FillCourseForm usingPorcentage(String porcentage) {
        this.porcentage = porcentage;
        return this;
    }

    public FillCourseForm usingType(String type) {
        this.type = type;
        return this;
    }

    public FillCourseForm usingCondition(String condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(COURSE_NAME),
                Enter.theValue(nameCourse).into(COURSE_NAME),

                Scroll.to(CATEGORY_NAME),
                Enter.theValue(nameCategory).into(CATEGORY_NAME),

                Scroll.to(TYPE_RED),
                SelectFromOptions.byVisibleText(type).from(TYPE_RED),

                Scroll.to(CONDITION_RED),
                SelectFromOptions.byVisibleText(condition).from(CONDITION_RED),

                Scroll.to(QUALIFICATION_RED),
                SelectFromOptions.byVisibleText(porcentage).from(QUALIFICATION_RED),

                Scroll.to(FEEDBACK_NAME_RED),
                SelectFromOptions.byVisibleText(feedBackName).from(FEEDBACK_NAME_RED),

                Scroll.to(TYPE_YELLOW),
                SelectFromOptions.byVisibleText(type).from(TYPE_YELLOW),

                Scroll.to(CONDITION_YELLOW),
                SelectFromOptions.byVisibleText(condition).from(CONDITION_YELLOW),

                Scroll.to(QUALIFICATION_YELLOW),
                SelectFromOptions.byVisibleText(porcentage).from(QUALIFICATION_YELLOW),

                Scroll.to(FEEDBACK_NAME_YELLOW),
                SelectFromOptions.byVisibleText(feedBackName).from(FEEDBACK_NAME_YELLOW),

                Scroll.to(TYPE_GREEN),
                SelectFromOptions.byVisibleText(type).from(TYPE_GREEN),

                Scroll.to(CONDITION_GREEN),
                SelectFromOptions.byVisibleText(condition).from(CONDITION_YELLOW),

                Scroll.to(QUALIFICATION_GREEN),
                SelectFromOptions.byVisibleText(porcentage).from(QUALIFICATION_GREEN),

                Scroll.to(FEEDBACK_NAME_GREEN),
                SelectFromOptions.byVisibleText(feedBackName).from(FEEDBACK_NAME_GREEN),

                Scroll.to(CREATE_BUTTON),
                Click.on(CREATE_BUTTON)


                );

    }

    public static FillCourseForm fillCourseForm() {
        return new FillCourseForm();
    }
}
