package co.com.sofka.tasks.hu03;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu03.TrainingPage.ACTIVE_TRAINING;
import static co.com.sofka.userinterfaces.hu03.TrainingPage.TRAINING_BUTTON_APPRENTICE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoApprenticeListApprentice implements Task {
    public DoApprenticeListApprentice is() {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TRAINING_BUTTON_APPRENTICE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(TRAINING_BUTTON_APPRENTICE),
                WaitUntil.the(ACTIVE_TRAINING, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ACTIVE_TRAINING)
        );
    }
    public static DoApprenticeListApprentice doApprenticeListApprentice() {
        return new DoApprenticeListApprentice();
    }
}
