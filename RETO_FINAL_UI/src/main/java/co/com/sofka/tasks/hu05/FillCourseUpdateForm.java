package co.com.sofka.tasks.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu005.CourseUpdate.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillCourseUpdateForm implements Task {

    private String nameCategory1;

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


    public FillCourseUpdateForm usingNameCategory(String nameCategory1) {
        this.nameCategory1 = nameCategory1;
        return this;
    }

    public FillCourseUpdateForm usingQualificacionRed(String qualificacionRed) {
        this.qualificacionRed = qualificacionRed;
        return this;
    }

    public FillCourseUpdateForm usingConditionRed(String conditionRed) {
        this.conditionRed = conditionRed;
        return this;
    }

    public FillCourseUpdateForm usingFeedBackNameRed(String feedBackNameRed) {
        this.feedBackNameRed = feedBackNameRed;
        return this;
    }

    public FillCourseUpdateForm usingUrlGrade(String urlGrade) {
        this.urlGrade = urlGrade;
        return this;
    }

    public FillCourseUpdateForm usingQualificacionYellow(String qualificacionYellow) {
        this.qualificacionYellow = qualificacionYellow;
        return this;
    }

    public FillCourseUpdateForm usingConditionYellow(String conditionYellow) {
        this.conditionYellow = conditionYellow;
        return this;
    }

    public FillCourseUpdateForm usingFeedBackNameYellow(String feedBackNameYellow) {
        this.feedBackNameYellow = feedBackNameYellow;
        return this;
    }

    public FillCourseUpdateForm usingQualificacionGreen(String qualificacionGreen) {
        this.qualificacionGreen = qualificacionGreen;
        return this;
    }

    public FillCourseUpdateForm usingConditionGreen(String conditionGreen) {
        this.conditionGreen = conditionGreen;
        return this;
    }

    public FillCourseUpdateForm usingFeedBackNameGreen(String feedBackNameGreen) {
        this.feedBackNameGreen = feedBackNameGreen;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(SEE_COURSE, isVisible()).forNoMoreThan(12).seconds(),
                Scroll.to(SEE_COURSE),
                DoubleClick.on(SEE_COURSE),

                Click.on(JAVA_BOTTON),

                Click.on(EDITAR_BOTTON),

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

                Scroll.to(URL_GRADE),
                Enter.theValue(urlGrade).into(URL_GRADE),

                Scroll.to(ADD_BOTTON_URL_GRADE),
                Click.on(ADD_BOTTON_URL_GRADE),

                Scroll.to(CONDITION_YELLOW),
                SelectFromOptions.byVisibleText(conditionYellow).from(CONDITION_YELLOW),

                Scroll.to(QUALIFICATION_YELLOW),
                Clear.field(QUALIFICATION_YELLOW),
                Enter.theValue(qualificacionYellow).into(QUALIFICATION_YELLOW),

                Scroll.to(FEEDBACK_YELLOW),
                Enter.theValue(feedBackNameYellow).into(FEEDBACK_YELLOW),

                Scroll.to(CONDITION_GREEN),
                SelectFromOptions.byVisibleText(conditionGreen).from(CONDITION_GREEN),

                Scroll.to(QUALIFICATION_GREEN),
                Clear.field(QUALIFICATION_GREEN),
                Enter.keyValues(qualificacionGreen).into(QUALIFICATION_GREEN),

                Scroll.to(FEEDBACK_GREEN),
                Enter.keyValues(feedBackNameGreen).into(FEEDBACK_GREEN),

                Scroll.to(EDITAR_BOTTON2).andAlignToTop(),
                Click.on(EDITAR_BOTTON2)


        );

    }

    public static FillCourseUpdateForm UpdateCourseForm() {
        return new FillCourseUpdateForm();
    }
}
