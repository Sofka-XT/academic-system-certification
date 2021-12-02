package co.com.sofka.tasks.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.hu02.ListarTrainingPage.TARGET_TRAINING;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FindTraining implements Task {
    protected String training;

    public FindTraining usingTrainingName(String training) {
        this.training = training;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TARGET_TRAINING, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(TARGET_TRAINING)
        );
    }

    public static FindTraining findTraining() {
        return new FindTraining();
    }
}
