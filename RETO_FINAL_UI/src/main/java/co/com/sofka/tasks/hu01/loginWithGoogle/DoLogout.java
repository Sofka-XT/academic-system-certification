package co.com.sofka.tasks.hu01.loginWithGoogle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu01.DashBoardPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoLogout implements Task {

    public DoLogout is()
    {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGOUTBUTTON),
                WaitUntil.the(SIGNOUT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SIGNOUT)
        );
    }

    public static DoLogout doLogoutAsCoach()
    {
        return new DoLogout();
    }
}
