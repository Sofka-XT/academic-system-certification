package co.com.sofka.questions.hu01;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu01.DashBoardPage.*;

public class LoginValidationRole implements Question<Boolean> {
    private String role;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (ROLE_COACH.resolveFor(actor).containsOnlyText(role));
    }

    public LoginValidationRole loginQuestionMessage(String role){
        this.role=role;
        return this;
    }

    public LoginValidationRole is(){
        return this;
    }
    public static LoginValidationRole loginQuestion(){
        return new LoginValidationRole();
    }
}
