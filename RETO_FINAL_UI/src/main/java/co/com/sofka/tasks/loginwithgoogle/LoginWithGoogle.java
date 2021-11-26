package co.com.sofka.tasks.loginwithgoogle;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu07.LoginPage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginWithGoogle implements Task {

    private String user;
    private String password;

    public LoginWithGoogle setUser(String user) {
        this.user = user;
        return this;
    }

    public LoginWithGoogle setPassword(String password) {
        this.password = password;
        return this;
    }

    public LoginWithGoogle is()
    {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOGIN_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(LOGIN_BUTTON),
                Click.on(LOGIN_BUTTON)

        );
    }

    public static LoginWithGoogle loginWithGoogle()
    {
        return new LoginWithGoogle();
    }
}

