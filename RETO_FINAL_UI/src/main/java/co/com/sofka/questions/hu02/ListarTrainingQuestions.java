package co.com.sofka.questions.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu02.ListarTrainingPage.ASSERTION_TRAINING_ACTIVO;


public class ListarTrainingQuestions implements Question<Boolean> {

    private String training;

    public ListarTrainingQuestions wasFilledWithTrainingName(String training) {
        this.training = training;
        return this;
    }

    public ListarTrainingQuestions is() {
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (ASSERTION_TRAINING_ACTIVO.resolveFor(actor).containsOnlyText(training));
    }

    public static ListarTrainingQuestions listarTrainingQuestions() {
        return new ListarTrainingQuestions();
    }
}
