package co.com.sofka.questions.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu02.ListarTraining.TARGET_TRAINING;

public class ListarTraining implements Question<Boolean> {

    private String training;

    public ListarTraining wasFilledWithTrainingName(String training) {
        this.training = training;
        return this;
    }

    public ListarTraining is() {
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (TARGET_TRAINING.resolveFor(actor).containsOnlyText(training));
    }

    public static ListarTraining listarTraining() {
        return new ListarTraining();
    }
}
