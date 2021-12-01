package co.com.sofka.tasks.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.sofka.userinterfaces.hu02.LoginPage.LOGIN_BUTTON;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LOGIN_BUTTON),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static Login login() {
        return new Login();
    }
}
