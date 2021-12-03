package co.com.sofka.tasks.hu02;

import co.com.sofka.userinterfaces.hu01.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu02.LoginPage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.LOGIN_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(LOGIN_BUTTON),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static Login login() {
        return new Login();
    }
}
