package co.com.sofka.tasks.loginWithGoogle;

import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu01.LoginPage.EMAIL_GOOGLE;
import static co.com.sofka.userinterfaces.hu01.LoginPage.NEXT_EMAIL_BUTTON;
import static co.com.sofka.userinterfaces.hu01.LoginPage.PASSWORD;
import static co.com.sofka.userinterfaces.hu01.LoginPage.NEXT_PASSWORD_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillGoogleAutenticationForm implements Task {

    public FillGoogleAutenticationForm is()
    {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(EMAIL_GOOGLE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(EMAIL_GOOGLE),
                Enter.theValue("pruebasAutomatizacionQA@gmail.com").into(EMAIL_GOOGLE),
                Click.on(NEXT_EMAIL_BUTTON),
                WaitUntil.the(PASSWORD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PASSWORD),
                Enter.theValue("Admin123!").into(PASSWORD),
                WaitUntil.the(NEXT_PASSWORD_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NEXT_PASSWORD_BUTTON)
        );
    }

    public static FillGoogleAutenticationForm fillAutenticationForm()
    {
        return new FillGoogleAutenticationForm();
    }
}