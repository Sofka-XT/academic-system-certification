package co.com.sofka.questions.hu01;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu01.DashBoardPage.*;

public class LoginQuestion implements Question<Boolean> {
    private String role;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (ROLE.resolveFor(actor)./*isPresent()*/containsOnlyText(role));
    }

    public LoginQuestion loginQuestionMessage(String role){
        this.role=role;
        return this;
    }

    public LoginQuestion is(){
        return this;
    }
    public static LoginQuestion loginQuestion(){
        return new LoginQuestion();
    }
}
