package co.com.sofka.tasks.loginPage;

import co.com.sofka.userinterfaces.hu01.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenLoginPage implements Task {
    private LoginPage loginPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginPage)
        );
    }

    public static OpenLoginPage openLoginPage(){
        return new OpenLoginPage();
    }
}
