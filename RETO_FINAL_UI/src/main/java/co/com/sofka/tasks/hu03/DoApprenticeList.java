package co.com.sofka.tasks.hu03;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu03.TrainingPage.QA_C2_TRAINING;
import static co.com.sofka.userinterfaces.hu03.TrainingPage.TRAINING_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoApprenticeList implements Task {

    public DoApprenticeList is()
    {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TRAINING_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(TRAINING_BUTTON),
                WaitUntil.the(QA_C2_TRAINING, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(QA_C2_TRAINING)
        );
    }
    public static DoApprenticeList doApprenticeList()
    {
        return new DoApprenticeList();
    }
}
