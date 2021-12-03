package co.com.sofka.questions.hu05;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu005.CourseDelete.*;

public class DeleteCourseQuestion implements Question<Boolean> {
    private String messageDelete;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (MESSAJE_DELETED_SUCCESSFUL.resolveFor(actor)./*isPresent()*/containsOnlyText(messageDelete));
    }

    public DeleteCourseQuestion validateMessage(String messageDelete){
        this.messageDelete=messageDelete;
        return this;
    }

    public DeleteCourseQuestion is(){
        return this;
    }

    public static DeleteCourseQuestion deleteCourseQuestion(){
        return new DeleteCourseQuestion();
    }
}
