package co.com.sofka.tasks.loginWithGoogle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu01.DashBoardPage.*;

public class DoLogoutAsCoach implements Task {

    public DoLogoutAsCoach is()
    {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LOGOUTCOUCH),
                Click.on(LOGOUTCOUCH),
                Click.on(SIGNOUT)
        );
    }

    public static DoLogoutAsCoach doLogoutAsCoach()
    {
        return new DoLogoutAsCoach();
    }
}
