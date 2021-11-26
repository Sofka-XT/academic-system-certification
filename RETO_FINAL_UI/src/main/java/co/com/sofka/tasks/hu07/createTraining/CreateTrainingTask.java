package co.com.sofka.tasks.hu07.createTraining;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu07.HomePage.CREAR_TRAINING;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateTrainingTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CREAR_TRAINING, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(CREAR_TRAINING),
                Click.on(CREAR_TRAINING)
        );
    }

    public static CreateTrainingTask createTrainingTask(){
        return new CreateTrainingTask();
    }
}
