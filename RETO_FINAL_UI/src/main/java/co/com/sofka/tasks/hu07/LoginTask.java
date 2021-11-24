package co.com.sofka.tasks.hu07;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.hu07.loginUI.*;

public class LoginTask implements Task {

    private String user;
    private String password;

    public LoginTask setUser(String user) {
        this.user = user;
        return this;
    }

    public LoginTask setPassword(String password) {
        this.password = password;
        return this;
    }

    public LoginTask is()
    {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TXT_USER_NAME),
                Clear.field(TXT_USER_NAME),
                Enter.theValue(this.user).into(TXT_USER_NAME),

                Scroll.to(TXT_PASSWORD),
                Clear.field(TXT_PASSWORD),
                Enter.theValue(this.password).into(TXT_PASSWORD),

                Scroll.to(BTN_LOGIN),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginTask loginTask()
    {
        return new LoginTask();
    }
}
