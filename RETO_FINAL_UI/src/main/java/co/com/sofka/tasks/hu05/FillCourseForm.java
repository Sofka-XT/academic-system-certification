package co.com.sofka.tasks.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu005.CourseInfo.*;
import static co.com.sofka.userinterfaces.hu005.CourseInfo.CREATE_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillCourseForm implements Task {
    private String nameCourse;
    private String nameCategory1;
    private final String RUTA=System.getProperty("user.dir")+"\\src\\test\\resources\\document\\resume.pdf";
    private String qualificacionRed;
    private String conditionRed;
    private String feedBackNameRed;
    private String urlGrade;
    private String qualificacionYellow;
    private String conditionYellow;
    private String feedBackNameYellow;
    private String qualificacionGreen;
    private String conditionGreen;
    private String feedBackNameGreen;
    private String nameCategoryCategory2;
    private String urlGrade2;
    private String qualificacionRedCategory2;
    private String conditionRedCategory2;
    private String feedBackNameRedCategory2;
    private String qualificacionYellowCategory2;
    private String conditionYellowCategory2;
    private String feedBackNameYellowCategory2;
    private String qualificacionGreenCategory2;
    private String conditionGreenCategory2;
    private String feedBackNameGreenCategory2;

    public FillCourseForm usingNameCategory(String nameCategory1) {
        this.nameCategory1 = nameCategory1;
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


    public FillCourseForm usingUrlGrade(String urlGrade) {
        this.urlGrade = urlGrade;
        return this;
    }

    public FillCourseForm usingUrlGrade2(String urlGrade2) {
        this.urlGrade2 = urlGrade2;
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

                WaitUntil.the(COURSE_CREATE, isVisible()).forNoMoreThan(12).seconds(),
                Scroll.to(COURSE_CREATE),
                DoubleClick.on(COURSE_CREATE),

                Scroll.to(COURSE_NAME),
                Enter.theValue(nameCourse).into(COURSE_NAME),

                Scroll.to(ADD_CATEGORY_BUTTON),
                Click.on(ADD_CATEGORY_BUTTON),

                Scroll.to(ADD_MORE_RULES),
                Click.on(ADD_MORE_RULES),

                Scroll.to(CATEGORY_NAME_1),
                Enter.theValue(nameCategory1).into(CATEGORY_NAME_1),

                Scroll.to(CONDITION_RED),
                SelectFromOptions.byVisibleText(conditionRed).from(CONDITION_RED),

                Scroll.to(QUALIFICATION_RED),
                Enter.theValue(qualificacionRed).into(QUALIFICATION_RED),

                Scroll.to(FEEDBACK_RED),
                Enter.theValue(feedBackNameRed).into(FEEDBACK_RED),

                Scroll.to(FILE_RULE_RED),
                Enter.keyValues(RUTA).into(FILE_RULE_RED),

                Scroll.to(URL_GRADE),
                Enter.theValue(urlGrade).into(URL_GRADE),

                Scroll.to(ADD_BOTTON_URL_GRADE),
                Click.on(ADD_BOTTON_URL_GRADE),


                Scroll.to(CONDITION_YELLOW),
                SelectFromOptions.byVisibleText(conditionYellow).from(CONDITION_YELLOW),

                Scroll.to(QUALIFICATION_YELLOW),
                Enter.theValue(qualificacionYellow).into(QUALIFICATION_YELLOW),

                Scroll.to(FEEDBACK_YELLOW),
                Enter.theValue(feedBackNameYellow).into(FEEDBACK_YELLOW),

                Scroll.to(FILE_RULE_YELLOW),
                Enter.keyValues(RUTA).into(FILE_RULE_YELLOW),

                Scroll.to(CONDITION_GREEN),
                SelectFromOptions.byVisibleText(conditionGreen).from(CONDITION_GREEN),

                Scroll.to(QUALIFICATION_GREEN),
                Enter.keyValues(qualificacionGreen).into(QUALIFICATION_GREEN),

                Scroll.to(FEEDBACK_GREEN),
                Enter.keyValues(feedBackNameGreen).into(FEEDBACK_GREEN),

                Scroll.to(FILE_RULE_GREEN),
                Enter.keyValues(RUTA).into(FILE_RULE_GREEN),

                Scroll.to(ADD_CATEGORY_BUTTON),
                Click.on(ADD_CATEGORY_BUTTON),
                //__________________CATEGORIA2____________________________________________________________________________________
                Scroll.to(ADD_MORE_RULES2),
                Click.on(ADD_MORE_RULES2),

                Scroll.to(CATEGORY_NAME2),
                Enter.theValue(nameCategoryCategory2).into(CATEGORY_NAME2),

                Scroll.to(CONDITION_RED2),
                SelectFromOptions.byVisibleText(conditionRedCategory2).from(CONDITION_RED2),

                Scroll.to(QUALIFICATION_RED2),
                Enter.keyValues(qualificacionRedCategory2).into(QUALIFICATION_RED2),

                Scroll.to(FEEDBACK_RED2),
                Enter.keyValues(feedBackNameRedCategory2).into(FEEDBACK_RED2),

                Scroll.to(FILE_RULE_RED2),
                Enter.keyValues(RUTA).into(FILE_RULE_RED2),

                Scroll.to(URL_GRADE2),
                Enter.theValue(urlGrade).into(URL_GRADE2),

                Scroll.to(ADD_BOTTON_URL_GRADE2),
                Click.on(ADD_BOTTON_URL_GRADE2),

                Scroll.to(CONDITION_YELLOW2),
                SelectFromOptions.byVisibleText(conditionYellowCategory2).from(CONDITION_YELLOW2),

                Scroll.to(QUALIFICATION_YELLOW2),
                Enter.keyValues(qualificacionYellowCategory2).into(QUALIFICATION_YELLOW2),

                Scroll.to(FEEDBACK_YELLOW2),
                Enter.keyValues(feedBackNameYellowCategory2).into(FEEDBACK_YELLOW2),

                Scroll.to(FILE_RULE_YELLOW2),
                Enter.keyValues(RUTA).into(FILE_RULE_YELLOW2),

                Scroll.to(CONDITION_GREEN2),
                SelectFromOptions.byVisibleText(conditionGreenCategory2).from(CONDITION_GREEN2),

                Scroll.to(QUALIFICATION_GREEN2),
                Enter.keyValues(qualificacionGreenCategory2).into(QUALIFICATION_GREEN2),

                Scroll.to(FEEDBACK_GREEN2),
                Enter.keyValues(feedBackNameGreenCategory2).into(FEEDBACK_GREEN2),

                Scroll.to(FILE_RULES_GREEN2),
                Enter.keyValues(RUTA).into(FILE_RULES_GREEN2),

                Scroll.to(CREATE_BUTTON).andAlignToBottom(),
                Click.on(CREATE_BUTTON)

        );

    }

    public static FillCourseForm fillCourseForm() {
        return new FillCourseForm();
    }
}
