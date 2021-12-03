package co.com.sofka.tasks.hu04;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu04.PefilarRendimientoAprendizPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FindRendimientoAprendiz implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PHOTO_PROFILE, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(PHOTO_PROFILE),
                Scroll.to(NOMBRE_APRENDIZ),
                Scroll.to(EMAIL_APRENDIZ),
                Scroll.to(ESQUEMA_DATOS_APRENDIZ),
                Click.on(ACORDEON_CURSO),
                Scroll.to(GRAFICA_RENDIMIENTO_APRENDIZ)
        );
    }

    public static FindRendimientoAprendiz findRendimientoAprendiz() {
        return new FindRendimientoAprendiz();
    }
}
