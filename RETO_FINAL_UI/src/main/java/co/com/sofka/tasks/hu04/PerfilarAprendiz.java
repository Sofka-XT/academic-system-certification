package co.com.sofka.tasks.hu04;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu04.ListarAprendicesPage.PERFILAR_APRENDIZ;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PerfilarAprendiz implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PERFILAR_APRENDIZ, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PERFILAR_APRENDIZ)
        );
    }

    public static PerfilarAprendiz perfilarAprendiz() {
        return new PerfilarAprendiz();
    }
}
