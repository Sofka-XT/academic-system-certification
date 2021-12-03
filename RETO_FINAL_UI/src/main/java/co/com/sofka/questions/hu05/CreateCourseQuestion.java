package co.com.sofka.questions.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu005.CourseInfo.HEADER_NAME_CURSO;

public class CreateCourseQuestion implements Question<Boolean> {
    private String nameCourse;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (HEADER_NAME_CURSO.resolveFor(actor)./*isPresent()*/containsOnlyText(nameCourse));
    }

    public CreateCourseQuestion courseNameQuestionMessage(String nameCourse){
        this.nameCourse=nameCourse;
        return this;
    }

    public CreateCourseQuestion is(){
        return this;
    }

    public static CreateCourseQuestion createCourseQuestion(){
        return new CreateCourseQuestion();
    }
}
