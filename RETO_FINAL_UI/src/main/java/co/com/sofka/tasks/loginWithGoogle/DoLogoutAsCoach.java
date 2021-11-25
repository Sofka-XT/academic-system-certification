package co.com.sofka.tasks.loginWithGoogle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu01.DashBoardPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoLogoutAsCoach implements Task {

    public DoLogoutAsCoach is()
    {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOGOUTCOUCH, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(LOGOUTCOUCH),
                Click.on(LOGOUTCOUCH),
                WaitUntil.the(SIGNOUT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SIGNOUT)
        );
    }

    public static DoLogoutAsCoach doLogoutAsCoach()
    {
        return new DoLogoutAsCoach();
    }
}
