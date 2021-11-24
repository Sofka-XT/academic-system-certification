package co.com.sofka.questions.hu07;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class LoginQuestion implements Question<Boolean> {

    private String assertionmessage;
    private Target target;

    public LoginQuestion setAssertionmessage(String assertionmessage) {
        this.assertionmessage = assertionmessage;
        return this;
    }

    public LoginQuestion setTarget(Target target) {
        this.target = target;
        return this;
    }

    public LoginQuestion is()
    {
        return this;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return (target.resolveFor(actor)
                .containsOnlyText(assertionmessage));
    }

    public static LoginQuestion loginQuestion()
    {
        return new LoginQuestion();
    }
}
