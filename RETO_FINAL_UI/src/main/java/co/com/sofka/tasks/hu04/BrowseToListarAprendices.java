package co.com.sofka.tasks.hu04;

import co.com.sofka.models.hu04.Aprendiz;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverBy;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu02.ListarTrainingPage.*;
import static co.com.sofka.userinterfaces.hu04.ListarAprendicesPage.*;
import static co.com.sofka.userinterfaces.hu04.ListarTrainingPerfilarPage.TARGET_TRAINING;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BrowseToListarAprendices implements Task {

    public static Aprendiz aprendiz;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(OPCION_MENU_COACH, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_MENU_COACH),
                Click.on(TARGET_TRAINING),
                HoverOverBy.over(LISTAR_NAME_APRENDIZ),
                HoverOverBy.over(LISTAR_EMAIL_APRENDIZ),
                HoverOverBy.over(LISTAR_MOBILE_APRENDIZ)
        );
        aprendiz = new Aprendiz();
        aprendiz.setName(LISTAR_NAME_APRENDIZ.resolveFor(actor).getText());
        aprendiz.setMobile(LISTAR_MOBILE_APRENDIZ.resolveFor(actor).getText());
        aprendiz.setEmail(LISTAR_EMAIL_APRENDIZ.resolveFor(actor).getText());
    }

    public static BrowseToListarAprendices browseToListarAprendices() {
        return new BrowseToListarAprendices();
    }
}
