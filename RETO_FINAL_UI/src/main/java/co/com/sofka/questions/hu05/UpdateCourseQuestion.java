package co.com.sofka.questions.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu005.CourseUpdate.*;

public class UpdateCourseQuestion implements Question<Boolean> {
    private String nameCourse;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (HEADER_NAME_CATEGORY.resolveFor(actor)./*isPresent()*/containsOnlyText(nameCourse));
    }

    public UpdateCourseQuestion courseNameQuestionMessage(String nameCourse){
        this.nameCourse=nameCourse;
        return this;
    }

    public UpdateCourseQuestion is(){
        return this;
    }

    public static UpdateCourseQuestion UpdateCourseQuestion(){
        return new UpdateCourseQuestion();
    }
}
