package co.com.sofka.tasks.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.userinterfaces.hu02.ListarTrainingPage.TARGET_TRAINING;

public class FindTraining implements Task {
    private String training;

    public FindTraining usingTrainingName(String training) {
        this.training = training;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TARGET_TRAINING)
        );
    }

    public static FindTraining findTraining() {
        return new FindTraining();
    }
}
