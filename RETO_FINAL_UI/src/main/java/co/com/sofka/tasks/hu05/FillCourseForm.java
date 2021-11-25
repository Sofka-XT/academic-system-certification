package co.com.sofka.tasks.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.sofka.userinterfaces.hu005.CourseInfo.*;


public class FillCourseForm implements Task {
    private String nameCourse;
    private String nameCategory1;
    private String typeRed;
    private String qualificacionRed;
    private String conditionRed;
    private String feedBackNameRed;
    private String typeYellow;
    private String qualificacionYellow;
    private String conditionYellow;
    private String feedBackNameYellow;
    private String typeGreen;
    private String qualificacionGreen;
    private String conditionGreen;
    private String feedBackNameGreen;
    private String nameCategoryCategory2;
    private String typeRedCategory2;
    private String qualificacionRedCategory2;
    private String conditionRedCategory2;
    private String feedBackNameRedCategory2;
    private String typeYellowCategory2;
    private String qualificacionYellowCategory2;
    private String conditionYellowCategory2;
    private String feedBackNameYellowCategory2;
    private String typeGreenCategory2;
    private String qualificacionGreenCategory2;
    private String conditionGreenCategory2;
    private String feedBackNameGreenCategory2;

    public FillCourseForm usingNameCategory(String nameCategory1) {
        this.nameCategory1 = FillCourseForm.this.nameCategory1;
        return this;
    }

    public FillCourseForm usingTypeRed(String typeRed) {
        this.typeRed = typeRed;
        return this;
    }

    public FillCourseForm usingQualificacionRed(String qualificacionRed) {
        this.qualificacionRed = qualificacionRed;
        return this;
    }

    public FillCourseForm usingConditionRed(String conditionRed) {
        this.conditionRed = conditionRed;
        return this;
    }

    public FillCourseForm usingFeedBackNameRed(String feedBackNameRed) {
        this.feedBackNameRed = feedBackNameRed;
        return this;
    }

    public FillCourseForm usingTypeYellow(String typeYellow) {
        this.typeYellow = typeYellow;
        return this;
    }

    public FillCourseForm usingQualificacionYellow(String qualificacionYellow) {
        this.qualificacionYellow = qualificacionYellow;
        return this;
    }

    public FillCourseForm usingConditionYellow(String conditionYellow) {
        this.conditionYellow = conditionYellow;
        return this;
    }

    public FillCourseForm usingFeedBackNameYellow(String feedBackNameYellow) {
        this.feedBackNameYellow = feedBackNameYellow;
        return this;
    }

    public FillCourseForm usingTypeGreen(String typeGreen) {
        this.typeGreen = typeGreen;
        return this;
    }

    public FillCourseForm usingQualificacionGreen(String qualificacionGreen) {
        this.qualificacionGreen = qualificacionGreen;
        return this;
    }

    public FillCourseForm usingConditionGreen(String conditionGreen) {
        this.conditionGreen = conditionGreen;
        return this;
    }

    public FillCourseForm usingFeedBackNameGreen(String feedBackNameGreen) {
        this.feedBackNameGreen = feedBackNameGreen;
        return this;
    }

    public FillCourseForm usingNameCategoryCategory2(String nameCategoryCategory2) {
        this.nameCategoryCategory2 = nameCategoryCategory2;
        return this;
    }

    public FillCourseForm usingTypeRedCategory2(String typeRedCategory2) {
        this.typeRedCategory2 = typeRedCategory2;
        return this;
    }

    public FillCourseForm usingQualificacionRedCategory2(String qualificacionRedCategory2) {
        this.qualificacionRedCategory2 = qualificacionRedCategory2;
        return this;
    }

    public FillCourseForm usingConditionRedCategory2(String conditionRedCategory2) {
        this.conditionRedCategory2 = conditionRedCategory2;
        return this;
    }

    public FillCourseForm usingFeedBackNameRedCategory2(String feedBackNameRedCategory2) {
        this.feedBackNameRedCategory2 = feedBackNameRedCategory2;
        return this;
    }

    public FillCourseForm usingTypeYellowCategory2(String typeYellowCategory2) {
        this.typeYellowCategory2 = typeYellowCategory2;
        return this;
    }

    public FillCourseForm usingQualificacionYellowCategory2(String qualificacionYellowCategory2) {
        this.qualificacionYellowCategory2 = qualificacionYellowCategory2;
        return this;
    }

    public FillCourseForm usingConditionYellowCategory2(String conditionYellowCategory2) {
        this.conditionYellowCategory2 = conditionYellowCategory2;
        return this;
    }

    public FillCourseForm usingFeedBackNameYellowCategory2(String feedBackNameYellowCategory2) {
        this.feedBackNameYellowCategory2 = feedBackNameYellowCategory2;
        return this;
    }

    public FillCourseForm usingTypeGreenCategory2(String typeGreenCategory2) {
        this.typeGreenCategory2 = typeGreenCategory2;
        return this;
    }

    public FillCourseForm usingQualificacionGreenCategory2(String qualificacionGreenCategory2) {
        this.qualificacionGreenCategory2 = qualificacionGreenCategory2;
        return this;
    }

    public FillCourseForm usingConditionGreenCategory2(String conditionGreenCategory2) {
        this.conditionGreenCategory2 = conditionGreenCategory2;
        return this;
    }

    public FillCourseForm usingFeedBackNameGreenCategory2(String feedBackNameGreenCategory2) {
        this.feedBackNameGreenCategory2 = feedBackNameGreenCategory2;
        return this;
    }

    public FillCourseForm usingNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
        return this;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(COURSE_NAME),
                Enter.theValue(nameCourse).into(COURSE_NAME),

                Scroll.to(CATEGORY_NAME_1),
                Enter.theValue(nameCategory1).into(CATEGORY_NAME_1),

                Scroll.to(TYPE_RED),
                SelectFromOptions.byVisibleText(typeRed).from(TYPE_RED),

                Scroll.to(CONDITION_RED),
                SelectFromOptions.byVisibleText(conditionRed).from(CONDITION_RED),

                Scroll.to(QUALIFICATION_RED),
                SelectFromOptions.byVisibleText(qualificacionRed).from(QUALIFICATION_RED),

                Scroll.to(FEEDBACK_RED),
                SelectFromOptions.byVisibleText(feedBackNameRed).from(FEEDBACK_RED),

                Scroll.to(TYPE_YELLOW),
                SelectFromOptions.byVisibleText(typeYellow).from(TYPE_YELLOW),

                Scroll.to(CONDITION_YELLOW),
                SelectFromOptions.byVisibleText(conditionYellow).from(CONDITION_YELLOW),

                Scroll.to(QUALIFICATION_YELLOW),
                SelectFromOptions.byVisibleText(qualificacionYellow).from(QUALIFICATION_YELLOW),

                Scroll.to(FEEDBACK_YELLOW),
                SelectFromOptions.byVisibleText(feedBackNameYellow).from(FEEDBACK_YELLOW),

                Scroll.to(TYPE_GREEN),
                SelectFromOptions.byVisibleText(typeGreen).from(TYPE_GREEN),

                Scroll.to(CONDITION_GREEN),
                SelectFromOptions.byVisibleText(conditionGreen).from(CONDITION_GREEN),

                Scroll.to(QUALIFICATION_GREEN),
                SelectFromOptions.byVisibleText(qualificacionGreen).from(QUALIFICATION_GREEN),

                Scroll.to(FEEDBACK_GREEN),
                SelectFromOptions.byVisibleText(feedBackNameGreen).from(FEEDBACK_GREEN),

                Scroll.to(ADD_CATEGORY_BUTTON),
                Click.on(ADD_CATEGORY_BUTTON),
                //___________________________________________________CATEGORIA2____________________________________________________
                Scroll.to(CATEGORY_NAME_2),
                Enter.theValue(nameCategoryCategory2).into(CATEGORY_NAME_2),

                Scroll.to(TYPE_RED_2),
                SelectFromOptions.byVisibleText(typeRedCategory2).from(TYPE_RED_2),

                Scroll.to(CONDITION_RED_2),
                SelectFromOptions.byVisibleText(conditionRedCategory2).from(CONDITION_RED_2),

                Scroll.to(QUALIFICATION_RED_2),
                SelectFromOptions.byVisibleText(qualificacionRedCategory2).from(QUALIFICATION_RED_2),

                Scroll.to(FEEDBACK_RED_2),
                SelectFromOptions.byVisibleText(feedBackNameRedCategory2).from(FEEDBACK_RED_2),

                Scroll.to(TYPE_YELLOW_2),
                SelectFromOptions.byVisibleText(typeYellowCategory2).from(TYPE_YELLOW_2),

                Scroll.to(CONDITION_YELLOW_2),
                SelectFromOptions.byVisibleText(conditionYellowCategory2).from(CONDITION_YELLOW_2),

                Scroll.to(QUALIFICATION_YELLOW_2),
                SelectFromOptions.byVisibleText(qualificacionYellowCategory2).from(QUALIFICATION_YELLOW_2),

                Scroll.to(FEEDBACK_YELLOW_2),
                SelectFromOptions.byVisibleText(feedBackNameYellowCategory2).from(FEEDBACK_YELLOW_2),

                Scroll.to(TYPE_GREEN_2),
                SelectFromOptions.byVisibleText(typeGreenCategory2).from(TYPE_GREEN_2),

                Scroll.to(CONDITION_GREEN_2),
                SelectFromOptions.byVisibleText(conditionGreenCategory2).from(CONDITION_GREEN_2),

                Scroll.to(QUALIFICATION_GREEN_2),
                SelectFromOptions.byVisibleText(qualificacionGreenCategory2).from(QUALIFICATION_GREEN_2),

                Scroll.to(FEEDBACK_GREEN_2),
                SelectFromOptions.byVisibleText(feedBackNameGreenCategory2).from(FEEDBACK_GREEN_2),

                Scroll.to(CREATE_BUTTON),
                Click.on(CREATE_BUTTON)


        );

    }

    public static FillCourseForm fillCourseForm() {
        return new FillCourseForm();
    }
}
