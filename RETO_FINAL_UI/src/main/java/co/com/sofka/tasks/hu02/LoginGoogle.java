package co.com.sofka.tasks.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofka.userinterfaces.landingpage.LoginPage.*;

public class LoginGoogle implements Task {
    private String username;
    private String password;

    public LoginGoogle usingUserName(String username) {
        this.username = username;
        return this;
    }

    public LoginGoogle usingPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(EMAIL_GOOGLE),
                Enter.theValue(this.username).into(EMAIL_GOOGLE),
                Click.on(NEXT_EMAIL_BUTTON),

                //Click.on(PASSWORD),
                Enter.theValue("Admin123!").into(PASSWORD),
                //Enter.theValue(this.password).into(PASSWORD),
                Click.on(NEXT_PASSWORD_BUTTON)

        );
    }

    public static LoginGoogle loginGoogle() {
        return new LoginGoogle();
    }
}
