package co.com.sofka.questions.hu02;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.hu02.ListarTrainingPage.TARGET_TRAINING_COACH;


public class ListarTrainingActivoQuestions implements Question<Boolean> {

    private String training;

    public ListarTrainingActivoQuestions wasFilledWithTrainingName(String training) {
        this.training = training;
        return this;
    }

    public ListarTrainingActivoQuestions is() {
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (TARGET_TRAINING_COACH.resolveFor(actor).containsOnlyText(training));
    }

    public static ListarTrainingActivoQuestions listarTrainingActivoQuestions() {
        return new ListarTrainingActivoQuestions();
    }
}
