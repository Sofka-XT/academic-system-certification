package co.com.sofka.questions.hu06;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu06.login.DashBoardPage.ROLE_COACH;

public class Login implements Question<Boolean> {
    public Login is(){
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return  (ROLE_COACH.resolveFor(actor).isVisible());
    }

//     WaitUntil.the(ROLE_COACH, isVisible()).forNoMoreThan(10).seconds();


    public static Login login(){
        return new Login();
    }
}
