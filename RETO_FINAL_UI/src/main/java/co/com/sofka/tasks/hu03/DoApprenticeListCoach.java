package co.com.sofka.tasks.hu03;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu03.TrainingPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoApprenticeListCoach implements Task {

    public DoApprenticeListCoach is()
    {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TRAINING_BUTTON_COACH, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(TRAINING_BUTTON_COACH),
                WaitUntil.the(ACTIVE_TRAINING, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ACTIVE_TRAINING)
        );
    }
    public static DoApprenticeListCoach doApprenticeListCoach()
    {
        return new DoApprenticeListCoach();
    }
}
